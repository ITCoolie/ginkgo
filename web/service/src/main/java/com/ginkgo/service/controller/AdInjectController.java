package com.ginkgo.service.controller;

import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.AccessTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*广告投放控制*/
@Slf4j
@RestController
@RequestMapping(path = "/ad/inject/v1")
public class AdInjectController {

    @Resource
    private AccessTokenService accessService;

    /*修改投放预算*/
    @PostMapping("/budget/modify")
    public Integer ModifyBudget(@RequestParam String token, @RequestBody String data) {
        Integer ret = accessService.checkValid(token);
        if (ret != STATUS.OK) {
            return ret;
        }
        return STATUS.OK;
    }
}