package com.ginkgo.service.controller;

import com.ginkgo.service.Result;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.AccountService;
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

    @Resource
    private AccountService accountService;

    @GetMapping("/login")
    public Result login(@RequestBody String data) {
        String user = "";
        String password = "";
        if (StringUtils.isEmpty(user) || StringUtils.isEmpty(password)) {
            return new Result(STATUS.INVALID_ACCOUNT);
        }

        String token = accountService.login(user, password);
        if (StringUtils.isEmpty(token)) {
            return new Result(STATUS.INVALID_ACCOUNT);
        }
        Result result = new Result(STATUS.OK);
        result.setData(token);
        return result;
    }

    @GetMapping("/logout")
    public Result logout(@RequestParam String token) {
        return new Result(tokenService.logout(token));
    }

    /*heart beat request api*/
    @GetMapping("/tick")
    public Result tick(@RequestParam String token) {
        Integer ret = tokenService.Tick(token);
        return new Result(ret);
    }
}

