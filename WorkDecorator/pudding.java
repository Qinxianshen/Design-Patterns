package WorkDecorator;

/**
 * Created by Qin on 2018/11/9.
 */
public class pudding extends CodiementDecorator {
    public pudding(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public void addPrice() {
        super.addPrice();
        System.out.println("现在加了RedBean 多加1元");
    }
}
