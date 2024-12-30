package com.okala.onlineshop.price;

import com.okala.onlineshop.order.Order;

public class PriceCalculate {

    public static double applyPrice(Order order){
        double price =0;



        if (order.getTotalPrice() > 1_000_000){
            price =  1_090_000;
            System.out.println("برای قیمت بزرگتر از 1 میلیون تومان");
            System.out.println("توجه داشته باشید قیمت اعلام شده با 9 درصد مالیات درنظر گرفته شده است.");
        }

        if (order.getTotalPrice() > 3_000_000 || order.getTotalPrice() < 5_000_000){
            price = 3_270_000;
            System.out.println("برای قیمت بیشتر از 3 میلیون  و کمتر از 5 میلیون ");
            System.out.println("توجه داشته باشید قیمت اعلام شده با 9 درصد مالیات درنظر گرفته شده است.");
        }
        if (order.getTotalPrice() < 1_000_000 && order.getTotalPrice() > 0){
            price = 1_000_000;
            System.out.println("معاف از مالیات");
        }


        System.out.println("the price is : " + price);
        return price;
    }


    }
