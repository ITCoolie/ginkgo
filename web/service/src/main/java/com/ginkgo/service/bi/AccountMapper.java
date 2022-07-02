package com.ginkgo.service.bi;

import com.ginkgo.service.model.po.TbAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Select("select * from db_ginkgo.tb_user where name=${name} and password=${password};")
    List<TbAccount> query(@Param("name") String name, @Param("password") String password);
}