package com.ginkgo.service.controller;

import com.ginkgo.service.Config.DBConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* Controller of user login logout*/
@Slf4j
@RestController
@RequestMapping(path = "/user/v1")
public class LoginController {

    @Autowired
    private DBConfig dbConfig;

    @GetMapping("/login")
    public Integer login(@RequestParam String account, @RequestParam String password) {
        if (StringUtils.isNoneEmpty(account) || StringUtils.isNoneEmpty(password)) {
            //check account and password
            return -1;
        }
        return 0;
    }

    @GetMapping("/logout")
    public Integer logout(@RequestParam String token) {
        if (StringUtils.isNoneEmpty(token)) {
            //token is empty
        }
        //check token valid
        return 0;
    }

    /*heart beat request api*/
    @GetMapping("/tick")
    public Integer tick(@RequestParam String token) {
        return 0;
    }
}

