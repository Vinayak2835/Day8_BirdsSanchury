package com.birdsandtree;

public class Penguin extends Bird implements  Swimmable{
	public static int count;
	
	public void eat() {
		System.out.println("Penguin can eat");
	}
	
	public void swim()
	{
		System.out.println("Penguin can swim");
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
