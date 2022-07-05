package com.ginkgo.service.service;

import com.ginkgo.service.bi.AccountMapper;
import com.ginkgo.service.enums.STATUS;
import com.ginkgo.service.model.po.TbAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private MybatisUtils mybatis;

    @Resource
    private AccountMapper mapper;

    @Resource
    private TokenService tokenService;

    public String login(String account, String password) {
        List<TbAccount> list = mapper.query(account, password);
        if (list == null || list.size() == 0) {
            return "";
        }
        String token = tokenService.NewToken(list.get(0));
        return token;
    }
}
