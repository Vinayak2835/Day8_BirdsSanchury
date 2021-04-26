package com.birdsandtree;

public  class Duck extends Bird implements Flyable , Swimmable{
	public static int count;
	
	public void eat() {
		System.out.println("Duck can eat");
	}
	
	public void swim()
	{
		System.out.println("Duck can swim");
	}
	
	public void fly()
	{
		System.out.println("Duck can fly");
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
