package com.restaurant.controller;

import com.restaurant.model.Order;

public class OrderFacade {
	private SaveStrategy saveStrategy;

    public OrderFacade(SaveStrategy saveStrategy) {
        this.saveStrategy = saveStrategy;
    }

    public void createAndSaveOrder(String dish, String drink, boolean dessert) {
        Order order = new Order.Builder()
                .dish(dish)
                .drink(drink)
                .dessert(dessert)
                .build();
        saveStrategy.save(order);
    }
}
