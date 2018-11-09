package WorkFactory.impl;

import Factory.Factory;
import WorkFactory.Order;
import WorkFactory.StoreFactory;

/**
 * Created by Qin on 2018/11/9.
 */
public class StarBurksFactory implements StoreFactory {


    @Override
    public StarBurks createFactory() {
        return new StarBurks();
    }
}
