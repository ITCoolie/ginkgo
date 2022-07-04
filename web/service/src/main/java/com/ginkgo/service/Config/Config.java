package com.ginkgo.service.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "config")
public class Config {

    public String time_format;

    public String date_format;

    public Integer login_keep_time;
}
