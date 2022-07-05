package com.ginkgo.service.controller;

import com.ginkgo.service.Result;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.TokenService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* Controller of full data pushment and increment data pushment*/
@Slf4j
@RestController
@RequestMapping(path = "/data/push/v1")
public class DataPushController {

    @Autowired
    private TokenService tokenService;

    /*Push full data of everyday*/
    @GetMapping("/push_full_data")
    public Result PushFullData(@RequestParam String token, @RequestParam String date) {

        return new Result(STATUS.OK);
    }
}
