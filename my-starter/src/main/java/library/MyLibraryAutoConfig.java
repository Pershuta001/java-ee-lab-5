package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "property")
    ConditionalOnPropertyComponent onPropertyComponent(){
        return new ConditionalOnPropertyComponent();
    }

    @Bean
    @ConditionalOnBean(ConditionalOnPropertyComponent.class)
    ConditionalOnBeanComponent onBeanComponent(){
        return new ConditionalOnBeanComponent();
    }

    @Bean
    @ConditionalOnMissingBean
    ConditionalOnMissingBeanComponent onMissingBeanComponent(){
        return new ConditionalOnMissingBeanComponent();
    }


}
