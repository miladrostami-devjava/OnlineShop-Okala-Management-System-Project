package com.okala.onlineshop.discountreport;

import com.okala.onlineshop.discount.Discount;
import com.okala.onlineshop.order.Order;

public class DiscountReport {

    public static void reportDiscount(Order order){

        double discount = Discount.applyDiscount(order);
        String discountMessage = switch ((int) (discount*100)) {

            case 0 -> "No discount applied!";
            case  10 -> "10% discount applied!";
            case 20 -> "20% discount applied!";
                    default -> "Discount applied : "  + " " + (discount*100) + "%";
                };
        System.out.println(discountMessage);
    }

}
