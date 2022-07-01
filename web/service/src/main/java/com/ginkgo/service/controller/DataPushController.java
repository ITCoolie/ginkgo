package com.ginkgo.service.controller;

import com.ginkgo.service.Config.DBConfig;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/* Controller of full data pushment and increment data pushment.
 */
@Slf4j
@RequestMapping(path = "/data/v1")
public class DataPushController {

    @Resource
    private DBConfig dbConfig;

    /*Push full data of everyday*/
    @GetMapping("/push_full_data")
    public Integer PushFullData(@RequestParam String token, @RequestParam String date) {
        return 0;
    }
}
