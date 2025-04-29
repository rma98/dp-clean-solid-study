package com.restaurant.controller;

import com.restaurant.model.Order;

public class CloudSaveStrategy implements SaveStrategy {

	@Override
	public void save(Order order) {
		System.out.println("Order sent to the cloud: " + order + "\n");
	}

}
