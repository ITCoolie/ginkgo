package com.ginkgo.service;

import lombok.Data;
import java.io.Serializable;

@Data
public class Result implements Serializable {

    protected Integer status;   //状态码

    protected String message;   //状态文本

    protected Object data;

    public Result(Integer status) {
        this.setStatus(status);
    }
}
