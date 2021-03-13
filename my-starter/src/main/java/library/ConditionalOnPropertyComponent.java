package library;

public class ConditionalOnPropertyComponent implements ComponentInterface{
    @Override
    public void afterPropertiesSet() {
        System.out.println("Conditional on property component");
    }
}
