package client;

public class ClientConditionalOnMissingBean implements ClientComponent{
    @Override
    public void afterPropertiesSet() {
        System.out.println("Client conditional on missing bean");
    }
}
