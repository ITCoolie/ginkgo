package com.ginkgo.service.service;

import com.ginkgo.service.bi.AccountMapper;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.model.po.TbAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {

    @Resource
    private AccountMapper mapper;

    @Resource
    private AccessTokenService tokenService;

    public Integer login(String account, String password) {
        List<TbAccount> list = mapper.query(account, password);
        if (list == null || list.size() == 0) {
            return STATUS.INVALID_ACCOUNT;
        }

        Integer result = tokenService.NewToken(account);
        return STATUS.OK;
    }
}
