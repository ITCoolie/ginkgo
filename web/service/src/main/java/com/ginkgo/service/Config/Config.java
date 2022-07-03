package com.ginkgo.service.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "config")
public class Config {

    public String time_format;

    public String date_format;

    public String login_keep_time;
}
