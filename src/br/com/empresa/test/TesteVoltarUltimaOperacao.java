package br.com.empresa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.empresa.lib.Calculadora;

public class TesteVoltarUltimaOperacao {
	@Test
	public void voltaUltimaOperacaoSoma() {
		Calculadora calculadora = new Calculadora(30);
		calculadora.Somar(10);
		assertEquals(true, calculadora.VoltarOperacao());
		assertEquals(calculadora.getResultado(), 30, 0);
	}	

	@Test
	public void voltaUltimaOperacaoMultiplicacao() {
		Calculadora calculadora = new Calculadora(10);
		calculadora.Multiplicar(3);
		assertEquals(calculadora.getResultado(), 30, 0);
		calculadora.Multiplicar(3);
		assertEquals(calculadora.getResultado(), 90, 0);
		assertEquals(true, calculadora.VoltarOperacao());
		assertEquals(calculadora.getResultado(), 30, 0);
	}	
	
	@Test
	public void naoVoltarSemOperacao() {
		Calculadora calculadora = new Calculadora(10);
		assertEquals(false, calculadora.VoltarOperacao());
		assertEquals(calculadora.getResultado(), 10, 0);
	}	

	@Test
	public void voltarOperacaoComResultadoZerado() {
		Calculadora calculadora = new Calculadora(10);
		calculadora.Subtrair(10);
		calculadora.Somar(10);
		assertEquals(true, calculadora.VoltarOperacao());
		assertEquals(calculadora.getResultado(), 0, 0);
	}	
	
	
}
