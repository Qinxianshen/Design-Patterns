package WorkProxy;

/**
 * Created by Qin on 2018/11/9.
 */
public class User implements Shopping {

    @Override
    public void Buy() {
        System.out.println("用户买东西，提交订单给代理商店");
    }
}
