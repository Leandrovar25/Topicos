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
}
