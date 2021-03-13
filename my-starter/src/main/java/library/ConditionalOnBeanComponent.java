package library;

public class ConditionalOnBeanComponent implements ComponentInterface {
    @Override
    public void afterPropertiesSet() {
        System.out.println("Conditional on bean component");
    }
}
