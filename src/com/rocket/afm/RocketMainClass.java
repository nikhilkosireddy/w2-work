package com.rocket.afm;
public class RocketMainClass {
	
	
public static void main(String[] args) {   
		
	    System.out.println("Hobby Rockets");
        System.out.println("=====================");

	    RocketFactory rf = RocketFaactoryBuilder.getFactory("Hobby");
        rf.createRocket("BigTrack");
        rf.createRocket("Hero");
        rf.createRocket("Estates");
        
        System.out.println("=====================");
        System.out.println("Professional Rockets");
        System.out.println("=====================");

    	RocketFactory rf1 = RocketFaactoryBuilder.getFactory("Professional");
        rf1.createRocket("Construction");
        rf1.createRocket("Model");
        rf1.createRocket("Inspection");
        
        System.out.println("=====================");
        System.out.println("Hobby Rockets Creation");
        System.out.println("=====================");  
        RocketFaactoryBuilder.makeHRocket();
        
        System.out.println("=====================");
        System.out.println("Professional Rockets Creation");
        System.out.println("=====================");  
        RocketFaactoryBuilder.makePRocket();

	 }    

}
