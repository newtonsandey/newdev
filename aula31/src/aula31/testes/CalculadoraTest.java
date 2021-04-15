package aula31.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import aula31.Calculadora;

class CalculadoraTest {

	@Test
	void somaTest() 
	{
		double resultado = Calculadora.soma(5, 3);
		double resultado_esperado = 8;
		
		Assert.assertEquals(resultado_esperado, resultado, 0);
	}
	
	@Test
	void somaAbsTestSimples()
	{
		double resultado = Calculadora.somaAbs(-2, 2);
		double resultado_esperado = 4;
		
		Assert.assertEquals(resultado_esperado, resultado, 0);					
	}
	
	@Test
	void somaAbsTestIgualSomaNegativa()
	{
		double resultado_esperado = Calculadora.soma(-2, -3);
		double resultado = -Calculadora.somaAbs(-2, -3);
		
		Assert.assertEquals(resultado_esperado, resultado, 0);
	}
	
	@Test
	void potenciacaoTest()
	{
		double resultado = Calculadora.potenciacao(3, 3);
		double resultado_esperado = 27;
		
		Assert.assertEquals(resultado_esperado, resultado, 0);
	}

}
