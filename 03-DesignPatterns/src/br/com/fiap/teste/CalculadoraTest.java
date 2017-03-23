package br.com.fiap.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.fiap.util.Calculadora;

public class CalculadoraTest {

	@Test
	public void somaTest() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10,10);
		Assert.assertEquals(soma, 20);
	}

}