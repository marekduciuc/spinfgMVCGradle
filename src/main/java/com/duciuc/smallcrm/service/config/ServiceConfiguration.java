package com.duciuc.smallcrm.service.config;

import com.duciuc.smallcrm.service.WorkOrderService;
import com.duciuc.smallcrm.service.WorkOrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public WorkOrderService reservationService() {
        return new WorkOrderServiceImpl();
    }

}
