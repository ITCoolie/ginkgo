package com.ginkgo.service.controller;

import com.ginkgo.service.Config.DBConfig;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/* Controller of user login logout.
 */
@Slf4j
@RequestMapping(path = "/user/v1")
public class LoginController {

    @Resource
    private DBConfig dbConfig;

    @GetMapping("/login")
    public Integer login(@RequestParam String account, @RequestParam String password) {
        return 0;
    }

    @GetMapping("/logout")
    public Integer logout(@RequestParam String token) {
        return 0;
    }

    /*heart beat request api*/
    @GetMapping("/tick")
    public Integer tick(@RequestParam String token) {
        return 0;
    }
}

