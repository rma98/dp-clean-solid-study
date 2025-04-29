package com.restaurant.controller;

import com.restaurant.model.Order;

public interface SaveStrategy {
	void save(Order order);
}
