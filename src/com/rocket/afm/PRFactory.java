package com.rocket.afm;

public class PRFactory implements RocketFactory<ProfessionalRocket> {

	  @Override
	    public ProfessionalRocket createRocket(String type) {
	        if ("Construction".equalsIgnoreCase(type)) {
	            return new ConstructionPR();
	        } else if ("Model".equalsIgnoreCase(type)) {
	            return new ModelPR();
	        } else if ("Inspection".equalsIgnoreCase(type)) {
	            return new InspectionPR();
	        }
	        return null;
	    }
}
