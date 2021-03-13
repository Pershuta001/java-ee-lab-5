package client;

import library.ConditionalOnBeanComponent;
import library.ConditionalOnMissingBeanComponent;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientAutoConfig {

    @Bean
    @ConditionalOnBean(ConditionalOnBeanComponent.class)
    ClientComponent conditionalOnBean(){
        return new ClientConditionalOnBean();
    }

    @Bean
    @ConditionalOnMissingBean(ConditionalOnMissingBeanComponent.class)
    ClientComponent conditionalOnMissingBean(){
        return new ClientConditionalOnMissingBean();
    }

}
