package com.cy.config;

import com.cy.facade.UserFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author jackson
 * @date 2020/4/8
 */
@Configuration
public class RmiServerConfig {
    @Bean
    public RmiServiceExporter registerService(UserFacade userFacade) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("UserInfo");
        rmiServiceExporter.setService(userFacade);
        rmiServiceExporter.setServiceInterface(UserFacade.class);
        rmiServiceExporter.setRegistryPort(8888);
        return rmiServiceExporter;
    }
}
