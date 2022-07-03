package com.ginkgo.service.model.vo;

import lombok.Data;
import java.io.Serializable;

@Data
public class AdBudgetVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String customer;    //客户名称

    private Long money;         //金额

    private String deal;        //合同编号

    private String deal_date;   //合同日期
}