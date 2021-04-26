package com.birdsandtree;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("welcome birds and tree assignment");
		
		BirdsSantuaryManager birdsSantutryManager = new BirdsSantuaryManager();
		
		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Parrot parrot = new Parrot();
		Penguin penguin = new Penguin();
		
		birdsSantutryManager.add(duck);
		birdsSantutryManager.add(duck2);
		birdsSantutryManager.add(parrot);
		birdsSantutryManager.add(penguin);
		
		birdsSantutryManager.remove(duck);
		birdsSantutryManager.remove(parrot);
		birdsSantutryManager.remove(penguin);
		
		birdsSantutryManager.printeatingBirds();
		birdsSantutryManager.printflyableBirds();
		birdsSantutryManager.printSwimmableBirds();
		
		System.out.println("Duck count "+Duck.count);
		System.out.println("Parrot count "+Parrot.count);
		System.out.println("Penguin count "+Penguin.count);
	}
}
