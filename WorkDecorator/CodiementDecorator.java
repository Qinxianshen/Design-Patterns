package WorkDecorator;

import WorkAdapter.PriceServer1;

/**
 * Created by Qin on 2018/11/9.
 */
public class CodiementDecorator implements PriceServer1 {

    private  MilkTea milkTea;

    public CodiementDecorator(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public void addPrice() {
        milkTea.addPrice();
    }
}
