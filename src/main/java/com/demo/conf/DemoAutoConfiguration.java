package com.demo.conf;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {

    @Bean
    public DemoModule demoModule(DemoProperties p) {
        DemoModule m = new DemoModule();
        m.setP(p);
        return m;
    }
}
