package com.syh.registry.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceRegisterListener implements ApplicationListener<EurekaInstanceRegisteredEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceRegisterListener.class);

    public void onApplicationEvent(EurekaInstanceRegisteredEvent eurekaInstanceRegisteredEvent) {
        LOGGER.info("服务：{}，注册成功了", eurekaInstanceRegisteredEvent.getInstanceInfo().getAppName());
    }
}