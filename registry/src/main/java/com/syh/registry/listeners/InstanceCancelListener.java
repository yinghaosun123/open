package com.syh.registry.listeners;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceCancelListener.class);
    public void onApplicationEvent(EurekaInstanceCanceledEvent event) {
        LOGGER.error("服务:{}挂了",event.getAppName());
    }
}