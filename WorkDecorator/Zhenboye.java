package WorkDecorator;

/**
 * Created by Qin on 2018/11/9.
 */
public class Zhenboye extends CodiementDecorator {

    public Zhenboye(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public void addPrice() {
        super.addPrice();
        System.out.println("现在加了Zhenboye 多加3元");
    }
}
