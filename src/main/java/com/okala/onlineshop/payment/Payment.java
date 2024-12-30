package com.okala.onlineshop.payment;

import com.okala.onlineshop.order.Order;

public class Payment {

    public static void processPayment(Order order){

        if (order.isPaid()){
            System.out.println("Order already paid!");
        }else {
            if (order.getTotalPrice() <- 0 ){
                System.out.println("Invalid order total price!");
            }else {
                order.setPaid(true);
                System.out.println("payment processed successfully!");

            }
        }


    }

}
