package com.pp.managesystem.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "upload.path")
@Data
public class UploadPathConfig {

        private String per;

        private String ip;

        private String port;
}
