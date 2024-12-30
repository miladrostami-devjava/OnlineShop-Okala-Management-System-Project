package com.okala.onlineshop.inventory;

import com.okala.onlineshop.order.Order;

public class Inventory {


    public static void checkStock(Order order){

        if (! order.isInStock()){
            System.out.println("item is out of stock!");

            order.setPaid(true);
            System.out.println("Stock replenished! , now item is available");
        }else {
            System.out.println("item is in stock!");
        }

    }


}
