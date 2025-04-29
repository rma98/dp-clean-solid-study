package com.restaurant.main;

import com.restaurant.controller.*;
import com.restaurant.view.*;
import com.restaurant.model.*;

public class Main {
	public static void main(String[] args) {
		// Mostrando a tela usando o Template Method
		Screen orderScreen = new OrderScreen();
		ScreenAdapter fancyAdapter = new FancyScreenAdapter(orderScreen);
		fancyAdapter.display();

		// Criando e salvando pedidos usando o Facade + Strategy
		SaveStrategy localStrategy = new LocalSaveStrategy();
		OrderFacade orderFacade = new OrderFacade(localStrategy);

		orderFacade.createAndSaveOrder("Pasta", "Wine", true);

		// Mudando para estratégia de nuvem
		SaveStrategy cloudStrategy = new CloudSaveStrategy();
		orderFacade = new OrderFacade(cloudStrategy);

		orderFacade.createAndSaveOrder("Burger", "Cola", false);
	}
}
