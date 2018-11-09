package WorkDecorator;

/**
 * Created by Qin on 2018/11/9.
 */
public class MilkTea implements PriceServer {
    @Override
    public void addPrice() {
        System.out.println(MilkTea.class.getName() + "买MilkTea 12元");
    }
}
