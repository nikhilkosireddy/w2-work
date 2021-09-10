package com.rocket.afm;

public class RocketFaactoryBuilder {
	
	
	
	public static RocketFactory getFactory(String choice){
	        
	        if("Hobby".equalsIgnoreCase(choice)){
	            return new HRFactory();
	        }
	        else if("Professional".equalsIgnoreCase(choice)){
	            return new PRFactory();
	        }
	        
	        return null;
	    }
	 
	public static void makeHRocket()
		{
	    HobbyRocket estates = new EstatesHR();
		HobbyRocket hero = new HeroHR();
		HobbyRocket bigtrack = new BigTrackHR();

			estates.create();
			hero.create();
			bigtrack.create();

		}

	public static void makePRocket() {
		// TODO Auto-generated method stub
	    ProfessionalRocket inspection = new InspectionPR();
		ProfessionalRocket construction = new ConstructionPR();
		ProfessionalRocket model= new ModelPR();
		
		inspection.create();
		construction.create();
		model.create();
	}
}
