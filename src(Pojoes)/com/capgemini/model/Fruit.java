package com.capgemini.model;

public class Fruit {
	private String name;
	private int calories;
	private int price;
	private String color;

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.price = price;
		this.name = name;
		this.calories = calories;
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", color=" + color + "]";
	}

}
