package com.ginkgo.service.model.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbAdUnit implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer ad_plan;

    private String author;

    private Long  budget;       //投放计划金额预算(分)

    private Long cost;          //投放计划已消耗(分)

    private Integer status;

    private String create_at;

    private String update_at;
}
