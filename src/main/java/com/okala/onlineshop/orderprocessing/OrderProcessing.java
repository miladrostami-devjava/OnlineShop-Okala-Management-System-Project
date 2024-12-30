package com.okala.onlineshop.orderprocessing;

import com.okala.onlineshop.order.Order;

/**Ternary Operator == if - else*/

public class OrderProcessing {

    public static void processOrder(Order order){
       String shipping = (order.getTotalPrice() > 100_000_000) ? "Free Shipping and 20 % discount" : "Standard Shipping!";
        System.out.println("Shipping method : " + shipping);
    }


}
