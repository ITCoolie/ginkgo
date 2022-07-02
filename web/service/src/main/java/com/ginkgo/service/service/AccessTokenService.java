package com.ginkgo.service.service;

import com.ginkgo.service.Config.DBConfig;
import com.ginkgo.service.Utils.Tools;
import com.ginkgo.service.enums.STATUS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.commons.lang3.*;

import java.util.HashMap;

/*Access token service*/
@Component
public class AccessTokenService {

    //Key: token value:account
    private static HashMap<String, String> tokenMap = new HashMap<>();

    //Key: account value:token
    private static HashMap<String, String> accountMap = new HashMap<>();

    /*check token is empty or invalid*/
    public Integer checkValid(String token) {
        if (StringUtils.isNoneEmpty(token)) {
            return STATUS.PARAMETER_WRONG;
        }
        return STATUS.OK;
    }

    public Integer NewToken(String account) {
        String token = Tools.createId();
        tokenMap.put(token, account);
        return STATUS.OK;
    }

    public Integer Tick(String token) {
        return STATUS.OK;
    }
}
