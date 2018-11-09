package WorkProxy;

/**
 * Created by Qin on 2018/11/9.
 */
public class ShopProxy implements Shopping{
    private User user;

    public ShopProxy() {
        user = new User();
    }

    public ShopProxy(User user) {
        this.user = user;
    }

    @Override
    public void Buy() {
        user.Buy();
        ProxyBuy();
    }

    private void ProxyBuy() {
        System.out.println("商店接到请求，开始代理购买");
    }
}
