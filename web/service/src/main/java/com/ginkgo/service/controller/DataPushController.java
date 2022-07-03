package com.ginkgo.service.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ginkgo.service.Config.DBConfig;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.AccessTokenService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.commons.lang3.*;

/* Controller of full data pushment and increment data pushment*/
@Slf4j
@RestController
@RequestMapping(path = "/data/push/v1")
public class DataPushController {

    @Autowired
    private AccessTokenService tokenService;

    /*Push full data of everyday*/
    @GetMapping("/push_full_data")
    public Integer PushFullData(@RequestParam String token, @RequestParam String date) {
        return STATUS.OK;
    }
}
