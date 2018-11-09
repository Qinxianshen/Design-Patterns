package WorkFactory.impl;

import Factory.Factory;
import WorkFactory.Order;
import WorkFactory.StoreFactory;

/**
 * Created by Qin on 2018/11/9.
 */
public class YiDianDianFactory implements StoreFactory {


    @Override
    public YiDianDian createFactory() {
        return new YiDianDian();
    }
}
