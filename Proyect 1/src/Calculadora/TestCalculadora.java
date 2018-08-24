package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

@Test
public void testsuma() {
	int resultado = Calculadora.suma(7, 7);
	assertEquals(14,resultado);
	}

}
