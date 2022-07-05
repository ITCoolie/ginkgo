package com.ginkgo.service.controller;

import com.ginkgo.service.Result;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/access/token/v1")
public class AccessTokenController {

    @Autowired
    private TokenService accessService;

    @GetMapping("/request")
    public Result RequestToken() {
        return new Result(STATUS.OK);
    }

}