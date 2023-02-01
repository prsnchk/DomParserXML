package model;

import java.util.List;

public class OrderDelivery {
    private int orderID;
    private double price;
    private Customer customer;
    private Courier courier;
    private Cafe cafe;
    private DeliveryProvider deliveryProvider;
    private PaymentType paymentType;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public DeliveryProvider getDeliveryProvider() {
        return deliveryProvider;
    }

    public void setDeliveryProvider(DeliveryProvider deliveryProvider) {
        this.deliveryProvider = deliveryProvider;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", price='" + price + '\'' +
                ", customer='" + customer.toString() + '\'' +
                ", waiter='" + courier.toString() + '\'' +
                ", cafe='" + cafe.toString() + '\'' +
                ", paymentType='" + paymentType.toString() + '\'' +
                '}';
    }
}
