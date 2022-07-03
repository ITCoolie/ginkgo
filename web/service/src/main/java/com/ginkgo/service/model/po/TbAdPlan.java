package com.ginkgo.service.model.po;

import lombok.Data;

import java.io.Serializable;

/*广告投放计划*/
@Data
public class TbAdPlan implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;     //投放计划id

    private String name;    //投放计划名称

    private String author;

    private Long  budget;       //投放计划金额预算(分)

    private Long cost;          //投放计划已消耗(分)

    private Integer status;     //投放计划状态

    private String create_at;

    private String update_at;
}
