package com.ginkgo.service.model.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbCreative implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String data;    //json

    private Integer template_id;

    private String author;

    private Integer status;

    private String create_at;

    private String update_at;
}
