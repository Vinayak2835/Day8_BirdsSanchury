package com.birdsandtree;

import java.util.ArrayList;
import java.util.List;

public class BirdsSantuaryManager {
	
	List<Bird> birdlist = new ArrayList<Bird>();
	
	public void add(Bird bird) {
		birdlist.add(bird);
		bird.incrementCount();
	}
	
	public void remove(Bird birds) {
		birdlist.remove(birds);
	    birds.decrementCount();
	}
	
	public void printeatingBirds() {
		for(Bird bird: birdlist){
			bird.eat();
	    }
	}
	
	public void printflyableBirds() {
		for(Bird bird: birdlist) {
			if(bird instanceof Flyable) {
			   ((Flyable) bird).fly();
			}
	    }
	}
	
	public void printSwimmableBirds() {
		for(Bird bird: birdlist) {
			if(bird instanceof Swimmable) {
		       ((Swimmable) bird).swim();
		    }
	    }
	}
}
