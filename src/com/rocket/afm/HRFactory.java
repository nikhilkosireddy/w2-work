package com.rocket.afm;

public class HRFactory implements RocketFactory<HobbyRocket> {

	  
	  @Override
	    public HobbyRocket createRocket(String type) {
	        if ("BigTrack".equalsIgnoreCase(type)) {
	            return new BigTrackHR();
	        } else if ("Hero".equalsIgnoreCase(type)) {
	            return new HeroHR();
	        } else if ("Estates".equalsIgnoreCase(type)) {
	            return new EstatesHR();
	        }
	        return null;
	    }
}
