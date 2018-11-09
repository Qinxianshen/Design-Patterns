package WorkFactory;

import WorkFactory.impl.StarBurks;
import WorkFactory.impl.YiDianDian;

/**
 * Created by Qin on 2018/11/9.
 */
public class Test {
    public static void main(String[] args) {

        StarBurks starBurks = StarBurks.getSingleton();
        System.out.println(starBurks.toString());
        starBurks.Order();



        System.out.println("------------------");


        YiDianDian yiDianDian = YiDianDian.getSingleton();
        System.out.println(yiDianDian.toString());
        yiDianDian.Order();

    }
}
