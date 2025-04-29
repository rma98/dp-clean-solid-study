package com.restaurant.model;

public class OrderDatabase {
	private static OrderDatabase instance = new OrderDatabase();

    private OrderDatabase() { }

    public static OrderDatabase getInstance() {
    	if (instance == null) {
            instance = new OrderDatabase();
        }
        return instance;
    }

    public void saveOrder(Order order) {
        System.out.println("Order saved to database: " + order);
    }
}
