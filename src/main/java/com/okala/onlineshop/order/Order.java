package com.okala.onlineshop.order;

public class Order {


    private double totalPrice;
    private boolean paid;
    private int itemCount;
    private boolean inStock;

    public Order(double totalPrice, boolean paid, int itemCount, boolean inStock) {
        this.totalPrice = totalPrice;
        this.paid = paid;
        this.itemCount = itemCount;
        this.inStock = inStock;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
