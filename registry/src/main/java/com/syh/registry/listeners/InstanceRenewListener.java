package com.syh.registry.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceRenewListener implements ApplicationListener<EurekaInstanceRenewedEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceRenewListener.class);

    public void onApplicationEvent(EurekaInstanceRenewedEvent event) {
        LOGGER.debug("心跳检测服务：{}", event.getInstanceInfo().getAppName());
    }
}