package org.afcepf.ai.interfaces;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.afcepf.ai.internal.Chat;
import org.afcepf.ai.internal.Chien;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class AnimalTest {

	@Test
	void bacASable() {
		Animal monAnimal = new Chat();
		
		Animal monAnimal2 = new Animal() {
			
			@Override
			public String espece() {
				// TODO Auto-generated method stub
				return "Nouvelle espece";
			}
		};
		
		System.out.println(monAnimal2.getClass());
		System.out.println(monAnimal2.espece());
		
		assertThrows(IllegalArgumentException.class, () -> {monAnimal2.nombreSpecimen();});
	}
}
