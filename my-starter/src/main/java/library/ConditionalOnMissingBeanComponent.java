package library;

public class ConditionalOnMissingBeanComponent implements ComponentInterface{
    @Override
    public void afterPropertiesSet() {
        System.out.println("Conditional on missing bean");
    }
}
