package com.restaurant.model;

public class Order {
	private String dish;
    private String drink;
    private boolean dessert;

    private Order(Builder builder) {
        this.dish = builder.dish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
    }

    public static class Builder {
        private String dish;
        private String drink;
        private boolean dessert;

        public Builder dish(String dish) {
            this.dish = dish;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder dessert(boolean dessert) {
            this.dessert = dessert;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Dish: " + dish + ", Drink: " + drink + ", Dessert: " + dessert;
    }
}
