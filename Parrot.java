package com.birdsandtree;

public class Parrot extends Bird implements Flyable {
	public static int count;
	
	public void fly() {
		System.out.println("Parrot can fly");
	}
	
	public void eat() {
		System.out.println("parrot can eat");
	}

	@Override
	int getCount() {
		return count;
	}

	@Override
	void incrementCount() {
		count++;
	}

	@Override
	int decrementCount() {
		return count--;
	}
}
