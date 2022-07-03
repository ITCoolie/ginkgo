package com.ginkgo.service.controller;

import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/* Controller of user login logout*/
@Slf4j
@RestController
@RequestMapping(path = "/user/v1")
public class LoginController {

    @Resource
    private TokenService tokenService;

    @PostMapping("/login")
    public Integer login(@RequestBody String data) {
        //if (StringUtils.isNoneEmpty(account) || StringUtils.isNoneEmpty(password)) {
        //    //check account and password
        //    return STATUS.INVALID_ACCOUNT;
        //}
        return 0;
    }

    @GetMapping("/logout")
    public Integer logout(@RequestParam String token) {
        if (!tokenService.checkValid(token)) {
            return STATUS.INVALID_TOKEN;
        }
        Integer ret = tokenService.logout(token);
        return ret;
    }

    /*heart beat request api*/
    @GetMapping("/tick")
    public Integer tick(@RequestParam String token) {

        return STATUS.OK;
    }
}

