package org.afcepf.ai.interfaces;

public interface Animal {
	
	public static final String constante = "";
	
	String espece();
	
	default int nombreSpecimen() {
		throw new IllegalArgumentException("No implementation");
	}

}
