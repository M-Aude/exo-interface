package org.afcepf.ai.internal;

import org.afcepf.ai.interfaces.Animal;

public class Chien implements Animal{

	public String ESPECE = "Chien";
	
	public String espece() {
		return ESPECE;
	}

	@Override
	public int nombreSpecimen() {
		// TODO Auto-generated method stub
		return 0;
	}

}
