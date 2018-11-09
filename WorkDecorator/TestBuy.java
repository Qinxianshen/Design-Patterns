package WorkDecorator;

/**
 * Created by Qin on 2018/11/9.
 */
public class TestBuy {
    public static void main(String[] args) {
        //MilkTea
        MilkTea milkTea = new MilkTea();
        CodiementDecorator decorator = new CodiementDecorator(milkTea);
        decorator.addPrice();


        System.out.println("------------------");

        //添加Pudding
        pudding pud = new pudding(milkTea);
        pud.addPrice();

        System.out.println("------------------");

        //添加RedBean

        RedBean redBean = new RedBean(milkTea);
        redBean.addPrice();

        System.out.println("------------------");

        //添加Zhenboye

        Zhenboye zhenboye = new Zhenboye(milkTea);
        zhenboye.addPrice();

    }
}
