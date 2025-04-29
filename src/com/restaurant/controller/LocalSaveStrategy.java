package com.restaurant.controller;

import com.restaurant.model.Order;
import com.restaurant.model.OrderDatabase;

public class LocalSaveStrategy implements SaveStrategy {

	@Override
	public void save(Order order) {
		OrderDatabase.getInstance().saveOrder(order);
		System.out.println("Saved locally.\n");
	}

}
