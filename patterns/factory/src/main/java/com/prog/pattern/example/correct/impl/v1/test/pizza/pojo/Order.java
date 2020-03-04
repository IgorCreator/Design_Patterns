package com.prog.pattern.example.correct.impl.v1.test.pizza.pojo;

public class Order {

    private String pizzaType;
    private DeliveryType deliveryType;

    public Order(String pizzaType, DeliveryType deliveryType) {
        this.pizzaType = pizzaType;
        this.deliveryType = deliveryType;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public String getPizzaChar() {
        return pizzaType;
    }

    public enum DeliveryType{
        RESTARAUNT,
        PICK_UP,
        DELIVERY
    }
}
