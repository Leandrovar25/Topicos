package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

@Test
public void testSuma() {
	int resultado = Calculadora.suma(7, 7);
	int esperado = 14;
	assertEquals(esperado,resultado);
	}

@Test
public void testResta() {
	int resultado = Calculadora.resta(7, 7);
	int esperado = 0;
	assertEquals(esperado,resultado);
	}

@Test
public void testMultiplcacion() {
	int resultado = Calculadora.multiplicar(2,7);
	int esperado = 14;
	assertEquals(esperado,resultado);
	}

@Test
public void testDivision() {
	int resultado = Calculadora.division(14,2);
	int esperado = 7;
	assertEquals(esperado,resultado);
	}

@Test
public void testDivisionCero() {
	int resultado = Calculadora.division(14,0);
	int esperado = 0;
	assertEquals(esperado,resultado);
	}

@Test (expected=ArithmeticException.class)
public void testDivideCero2(){
	int resultado = Calculadora.division(14,0);
	int esperado = 0;
	assertEquals(esperado,resultado);
}
}
