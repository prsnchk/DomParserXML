package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "order_delivery")
public class OrderDelivery {
    private int orderID;
    private double price;
    private Customer customer;
    private Courier courier;
    private Cafe cafe;
    private DeliveryProvider deliveryProvider;
    private PaymentType paymentType;

    public OrderDelivery(int orderID, double price, Customer customer, Courier courier, Cafe cafe, DeliveryProvider deliveryProvider, PaymentType paymentType) {
        this.orderID = orderID;
        this.price = price;
        this.customer = customer;
        this.courier = courier;
        this.cafe = cafe;
        this.deliveryProvider = deliveryProvider;
        this.paymentType = paymentType;
    }

    public OrderDelivery() {

    }

    public int getOrderID() {
        return orderID;
    }

    @XmlAttribute(name = "id")
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPrice() {
        return price;
    }

    @XmlElement(name = "price")
    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    @XmlElement(name = "customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Courier getCourier() {
        return courier;
    }

    @XmlElement(name = "courier")
    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Cafe getCafe() {
        return cafe;
    }

    @XmlElement(name = "cafe")
    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public DeliveryProvider getDeliveryProvider() {
        return deliveryProvider;
    }

    @XmlElement(name = "delivery_provider")
    public void setDeliveryProvider(DeliveryProvider deliveryProvider) {
        this.deliveryProvider = deliveryProvider;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    @XmlElement(name = "payment_type")
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
