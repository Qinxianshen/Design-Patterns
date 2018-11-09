package WorkProxy;

/**
 * Created by Qin on 2018/11/9.
 */
public class TestProxy {
    public static void main(String[] args) {
        Shopping shopping = new ShopProxy();
        shopping.Buy();
    }
}
