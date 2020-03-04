package fr.uvsq.pglp.exercise_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UneclasseMetierTest {
	UneclasseMetier metier;
	
	@Before
	public void setMetier() {
		this.metier = new UneclasseMetier();;
	}

	@Test
	public void test() {
		metier.UneMethodeMetier();
	}

}
