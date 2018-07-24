package org.afcepf.ai.interfaces;

import org.afcepf.ai.internal.BigLauncher;
import org.junit.jupiter.api.Test;

public class LaunchableTest {

	@Test
	void test1() {
		Launchable launchable = new BigLauncher();
		launchable.launch();
	}
	
	@Test
	void test2() {
		Launchable launchable = new Launchable() {
			
			@Override
			public void launch() {
				System.out.println("from inner class");
				
			}
		};
		
		launchable.launch();
		
	}
	
	@Test
	void test3() {
		
		Launchable launchable = () -> System.out.println("Lamba launch !!!!");
		launchable.launch();
	}
}
