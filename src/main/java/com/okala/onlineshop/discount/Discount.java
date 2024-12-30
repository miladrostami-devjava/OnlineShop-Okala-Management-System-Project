package com.okala.onlineshop.discount;

import com.okala.onlineshop.order.Order;

public class Discount {


    public static double applyDiscount(Order order){

        double discount = 0;

        /**
         * تخفیف برای بیش از سه عدد کالا
         * */
        if (order.getItemCount() > 3){
            discount = 0.1;
            System.out.println("تبریک ! شما 10 درصد تخفیف گرفتید.");
        }

        /**
         * تخفیف برای خرید های بالای 2 میلیون تومان
         * */
        if (order.getTotalPrice() > 2_000_000){
            //2000000
            discount = Math.max(discount,0.2);
            System.out.println("تبریک ! شما 20 درصد تخفیف گرفتید");
        }
        /**
         *
         * اگر تعداد سفارس بالای 5 عدد و
         *خرید های بالای 10 میلیون تومان
         * بود تخفیف 40 درصد لحاظ کن
         * */
        if (order.getItemCount() > 5 && order.getTotalPrice() > 10_000_000){
            discount = Math.max(discount,.4);
            System.out.println("تبریک ! شما 40 درصد تخفیف گرفتید");

        }


        System.out.println("امیدوارم از تخفیفات لذت ببرید!");
     return discount;
    }


}
