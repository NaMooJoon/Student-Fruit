package com.example.lab2fruit;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		//Create arraylist of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		fl.add(new Fruit(100, "Apple", 1000));
		fl.add(new Fruit(101, "Orange", 1200));
		fl.add(new Fruit(102, "Kiwi", 1300));
		fl.add(new Fruit(103, "Peer", 1400));
		fl.add(new Fruit(104, "Melon", 1100));
		fl.add(new Fruit(105, "Watermelon", 1300));
		fl.add(new Fruit(106, "Grape", 1500));
		fl.add(new Fruit(107, "Banana", 1100));
		fl.add(new Fruit(108, "Peach", 2000));
		fl.add(new Fruit(109, "stawberry", 1800));
		
		Collections.sort(fl, new FruitComparator());
		//Traverse elements of arraylist (ordered)
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		//Travers elements of arraylist (reverse ordered)
		for(int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}

	}
	
}
