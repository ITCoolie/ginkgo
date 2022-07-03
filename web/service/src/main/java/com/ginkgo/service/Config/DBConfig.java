package com.ginkgo.service.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "config.db")
@Component
public class DBConfig {

    public String server;

    public String port;

    public String account;

    public String password;

    public String driver;
}
