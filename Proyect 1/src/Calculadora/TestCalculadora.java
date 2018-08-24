package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

@Test
public void testsuma() {
	int resultado = Calculadora.suma(7, 7);
	assertEquals(14,resultado);
	}

@Test
public void testresta() {
	int resultado = Calculadora.resta(7, 7);
	assertEquals(0,resultado);
	}

@Test
public void testmultiplcacion() {
	int resultado = Calculadora.multiplicar(2,7);
	assertEquals(14,resultado);
	}

@Test
public void testdivision() {
	int resultado = Calculadora.division(14,2);
	assertEquals(7,resultado);
	}


}
