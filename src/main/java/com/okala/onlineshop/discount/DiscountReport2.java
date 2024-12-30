package com.okala.onlineshop.discount;

import com.okala.onlineshop.order.Order;

public class DiscountReport2 {

    public static void reportDiscount(Order order) {

        double discount = Discount.applyDiscount(order);
        String discountMessage;

        switch ((int) (discount * 100)) {
            case 0:
                discountMessage = "No discount applied!";
                break;
            case 10:
                discountMessage = "10% discount applied!";
                break;
            case 20:
                discountMessage = "20% discount applied!";
                break;
            default:
                discountMessage = "Discount applied : " + (discount * 100) + "%";
                break;
        }

        System.out.println(discountMessage);
    }

}
