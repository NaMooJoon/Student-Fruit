package com.example.lab2fruit;

import java.util.Comparator;

public class Fruit {
	private int no;
	private String name;
	private int price;
	
	Fruit(){}
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}

class FruitComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
class FruitComparatorDesc implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.getName().compareTo(o1.getName());
	}
}

