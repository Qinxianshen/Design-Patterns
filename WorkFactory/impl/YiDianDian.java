package WorkFactory.impl;

import WorkDecorator.CodiementDecorator;
import WorkDecorator.MilkTea;
import WorkDecorator.pudding;
import WorkFactory.Order;

/**
 * Created by Qin on 2018/11/9.
 */
public class YiDianDian implements Order{
    public YiDianDian() {

    }

    private static class SingletonYiDianDianFactory{
        public static YiDianDian yiDianDian = new YiDianDian();
    }

    public static YiDianDian getSingleton() {
        return SingletonYiDianDianFactory.yiDianDian;
    }

    public Object readResolve() {
        return getSingleton();
    }
    @Override
    public void Order() {
        //MilkTea
        MilkTea milkTea = new MilkTea();
        System.out.println("------------------");
        //添加Pudding
        pudding pud = new pudding(milkTea);
        pud.addPrice();
    }
}
