package com.okala.onlineshop.reportorderprocessing;

import com.okala.onlineshop.order.Order;
import com.okala.onlineshop.orderprocessing.OrderProcessing;
import com.okala.onlineshop.price.PriceCalculate;

public class ReportOrderProcessing {

    public static void reportOrderProcessing(Order order){

        double totalPrice = PriceCalculate.applyPrice(order);
        double maintenancePrice = 10_000;





    }


}
