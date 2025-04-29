package com.restaurant.view;

public class FancyScreenAdapter implements ScreenAdapter {
	private Screen screen;

	public FancyScreenAdapter(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void display() {
		System.out.println("*** FANCY SCREEN DISPLAY ***");
		screen.showScreen();
		System.out.println("*** END OF FANCY DISPLAY ***\n");
	}

}
