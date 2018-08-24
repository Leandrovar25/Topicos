package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {
	
@Test 
public void testSumar () {
	int result = Calculadora.suma(7,7);
	int esp = 14;
	assertEquals (esp,result);
}

@Test
public void testRestar() {
	int result= Calculadora.resta(7,7);
	int esp= 0;
	assertEquals(esp,result);
}
}
