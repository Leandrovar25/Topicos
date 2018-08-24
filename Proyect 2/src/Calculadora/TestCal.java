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

@Test
public void testMultiplicar() {
	int result= Calculadora.multiplicar(7,7);
	int esp= 49;
	assertEquals(esp,result);
}

@Test
public void testDivide() {
	int result= Calculadora.dividir(14,2);
	int esp= 7;
	assertEquals(esp,result);
}

}
