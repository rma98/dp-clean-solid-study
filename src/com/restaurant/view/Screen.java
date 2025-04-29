package com.restaurant.view;

public abstract class Screen {
	public void showScreen() {
        loadHeader();
        loadContent();
        loadFooter();
    }

    private void loadHeader() {
        System.out.println("=== Welcome to Restaurant System ===");
    }

    protected abstract void loadContent();

    private void loadFooter() {
        System.out.println("=== Thank you! ===\n");
    }
}
