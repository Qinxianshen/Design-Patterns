package WorkFactory.impl;

import WorkDecorator.CodiementDecorator;
import WorkDecorator.MilkTea;
import WorkDecorator.RedBean;
import WorkDecorator.pudding;
import WorkFactory.Order;

/**
 * Created by Qin on 2018/11/9.
 */
public class StarBurks implements Order{
    public StarBurks() {
    }

    private static class SingletonStarBurksFactory{
        public static StarBurks singleton = new StarBurks();
    }

    public static StarBurks getSingleton() {
        return SingletonStarBurksFactory.singleton;
    }

    public Object readResolve() {
        return getSingleton();
    }
    @Override
    public void Order() {
        //MilkTea
        MilkTea milkTea = new MilkTea();
        System.out.println("------------------");
        //添加RedBean
        RedBean redBean = new RedBean(milkTea);
        redBean.addPrice();
    }
}
