package client;

public class ClientConditionalOnBean implements ClientComponent {
    @Override
    public void afterPropertiesSet() {
        System.out.println("Client conditional on bean");
    }
}
