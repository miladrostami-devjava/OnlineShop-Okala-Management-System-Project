package com.okala.onlineshop.shipping;

import com.okala.onlineshop.order.Order;

public class Shipping {

    public static String getShippingMethod(Order order){


        if (order.getItemCount() > 100){
            return  "Free Shipping!!!";
        } else if (order.getTotalPrice() > 50_000_000) {
            return  "Standard Shipping!";
        }else {
            return "Express Shipping";
        }

    }


}
