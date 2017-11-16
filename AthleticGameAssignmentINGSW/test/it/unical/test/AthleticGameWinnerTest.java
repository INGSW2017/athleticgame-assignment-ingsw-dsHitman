package it.unical.test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnerTest {
	
	
	private static AthleticGame a;
	
	@BeforeClass
	public static void istanzia(){
		
		a = new AthleticGame("Test");
	}
	
	@After
	public void reset(){
		
		a.reset();
	}
	
	@Before
	public void start(){
		
		a.start();
	}
	
	
	
	

}
