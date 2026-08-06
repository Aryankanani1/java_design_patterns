package design_pattern.structural_pattern.proxy_pattern;

public class ProxyClient {
    public static void main(String[] args) {

        Image image = new ProxyImage("min.png");
        // load from the disk
        image.display();
        // it is already cached
        image.display();
    }
}
