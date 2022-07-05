package com.ginkgo.service.controller;

import com.ginkgo.service.Result;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*广告投放控制*/
@Slf4j
@RestController
@RequestMapping(path = "/ad/inject/v1")
public class AdInjectController {

    @Resource
    private TokenService accessService;

    /*修改投放预算*/
    @PostMapping("/budget/modify")
    public Result ModifyBudget(@RequestParam String token, @RequestBody String data) {
        if (!accessService.checkValid(token)) {
            return new Result(STATUS.INVALID_TOKEN);
        }
        return new Result(STATUS.OK);
    }
}