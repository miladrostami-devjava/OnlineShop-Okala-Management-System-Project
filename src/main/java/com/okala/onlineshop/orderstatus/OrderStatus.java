package com.okala.onlineshop.orderstatus;

import com.okala.onlineshop.order.Order;

public class OrderStatus {

    public static void reportStatus(Order order){
        String status ;

        if (order.isPaid()){

            if (order.isInStock()){
                status = "Paid and ready for shipping!";
            }else {
                status = "Paid, waiting for Stock";
            }

        }else {
            status = "Payment Pending,";
        }

        System.out.println("Order status : " + " "  + status);

    }

}
