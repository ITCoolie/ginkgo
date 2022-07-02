package com.ginkgo.service.model.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    private String nickname;

    private String photo;

    private String phone;

    private Integer status;

    private String create_at;

    private String update_at;
}
