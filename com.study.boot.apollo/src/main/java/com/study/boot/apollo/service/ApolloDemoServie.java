package com.study.boot.apollo.service;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ApolloDemoServie {
    @ApolloConfig
    private Config config;

}
