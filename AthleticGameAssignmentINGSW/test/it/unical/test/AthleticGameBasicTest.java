package it.unical.test;

import java.time.Instant;

import org.junit.Test;

import it.unical.asde.AthleticGame;
import junit.framework.Assert;

public class AthleticGameBasicTest {
	
	
	@Test
	public void addArrivalsWork(){
		
		AthleticGame a = new AthleticGame("Test");
		
		a.addArrival("Cciovanno", Instant.now().plusMillis(1000));
		
		Assert.assertEquals(1, a.getArrivals().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getPartecipantTimeWork(){
		
		AthleticGame a = new AthleticGame("Test");
		
		a.getParecipiantTime("Pinko");	
	}

}
