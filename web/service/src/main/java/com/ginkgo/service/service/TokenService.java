package com.ginkgo.service.service;

import com.ginkgo.service.Config.Config;
import com.ginkgo.service.Utils.IDCreator;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.model.po.TbAccount;
import org.springframework.stereotype.Component;

import org.apache.commons.lang3.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/*Access token service*/
@Component
public class TokenService {

    @Resource
    private Config config;

    //Key: token value:time
    private static HashMap<String, String> tokenMap = new HashMap<>();

    /*check token is empty or invalid*/
    public boolean checkValid(String token) {
        if (StringUtils.isBlank(token)) {
            return false;
        }

        if (tokenMap.containsKey(token)) {
            String lastTime = tokenMap.get(token);
            SimpleDateFormat sdf = new SimpleDateFormat(config.time_format);
            try {
                java.util.Date lastLogin = sdf.parse(lastTime);
                Date now = new Date();
                if ((now.getTime() - lastLogin.getTime()) < (long)(config.login_keep_time)) {
                    return true;
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    /*创建一个新的token*/
    public String NewToken(TbAccount account) {
        String token = IDCreator.newId();
        Collections.singletonMap(token, account);
        return token;
    }

    /*更新最近登录时间*/
    public Integer Tick(String token) {
        if (!checkValid(token)) {
            return STATUS.INVALID_TOKEN;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(config.time_format);
        tokenMap.put(token, sdf.format(new Date()));
        return STATUS.OK;
    }

    /*推出登录*/
    public Integer logout(String token) {
        if (checkValid(token)) {
            tokenMap.remove(token);
        }
        return STATUS.OK;
    }
}
