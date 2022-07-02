package com.ginkgo.service.Config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class DBConfig {

    public String server;

    public String port;

    public String account;

    public String password;

    public String driver = "com.mysql.cj.jdbc.Driver";
}
