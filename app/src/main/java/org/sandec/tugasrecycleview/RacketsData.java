package org.sandec.tugasrecycleview;

import java.util.ArrayList;

public class RacketsData {
    public static String[][] data = new String[][]{
            {"Astrox 99", "The new shape allows the shaft to flex, which ensures the maximum effect of “(more flex and faster kick-back graphite material)” and stabilizes the racquet face by preventing the shaft twisting, increasing control.", "https://cdn.shopify.com/s/files/1/0723/9035/products/Yumo_Yonex_Astrox_99_01_600x.jpg?v=1560496670"},
            {"Astrox 88 S", "Making the whole frame flexible allows the“ASTROX 88 S”to hold the shuttlecock for accurate control, while the“ASTROX 88 D” has more flex in the upper part of the frame transmitting maximum power to the shuttlecock to break through the opponents. In addition the overall length of the“88 S” is only 5mm longer, which enhances both accuracy and power while the“88 D” is 10 mm longer to provide powerful attacks.", "https://cdn.shopify.com/s/files/1/0723/9035/products/Astrox_88_S_600x.jpg?v=1517359247"},
            {"Astrox 88 D", "The square-shaped ISOMETRIC frame shape is designed to keep vertical strings at a similar length, as well as the horizontal strings to produce an expanded sweet spot in all directions.", "https://cdn.shopify.com/s/files/1/0723/9035/products/Astrox_88_D_600x.jpg?v=1516743337"},
            {"Astrox 66", "By applying the counterbalance theory, weight is distributed throughout the grip end, frame top and the joint for maximum control. The transition to the next shot can be performed smoothly with a rapid succession.", "https://cdn.shopify.com/s/files/1/0723/9035/products/Astrox_66_600x.jpg?v=1516745701"},
            {"Astrox 55", "Moulded deep into the layers of graphite where the frame connects with the shaft, the YONEX Built-in T-Joint creates a durable and high-strength one-piece frame that is torque-free.", "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/9/27/1345829/1345829_f89ec3d1-0893-40df-b9eb-2abb6be99726_600_600.jpg"},

    };

    public static ArrayList<Racket> getListData(){
        ArrayList<Racket> list = new ArrayList<>();
        for (String[] adata: data){
            Racket racket = new Racket();
            racket.setName(adata[0]);
            racket.setFrom(adata[1]);
            racket.setPhoto(adata[2]);
            list.add(racket);
        }
        return list;
    }
}

