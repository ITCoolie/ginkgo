package com.ginkgo.service.service;

import com.ginkgo.service.Config.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.commons.lang3.*;

/*Access token service*/
@Component
public class AccessTokenService {

    @Autowired
    private DBConfig dbConfig;

    /*check token is empty or invalid*/
    public Integer checkValid(String token) {
        if (StringUtils.isNoneEmpty(token)) {
            return -2;
        }
        return 0;
    }
}
