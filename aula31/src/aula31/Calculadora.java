package aula31;

/**
 * Classe com métodos de cálculo. <br>
 * Representa uma <b>calculadora</b>. 
 * 
 * @author newton
 * @since 2021
 * @version 0.1
 *
 */

public class Calculadora {
	
	/**
	 * Faz soma. <br>
	 * Exemplo de uso: {@code Calculadora.soma(5, 3)}
	 * 
	 * @param a Um número a ser somado.
	 * @param b Outro número a ser somado.
	 * @return A soma de <b>a</b> e <b>b</b>.
	 * 
	 */
	
	public static double soma(double a, double b)
	{
		return (a+b);
	}
	
	
	/**
	 * Faz soma de números absolutos. <br>
	 * Exemplo de uso: {@code Calculadora.somaAbs(-2, 3)}
	 * 
	 * @param a Um número a ser somado.
	 * @param b Outro número a ser somado.
	 * @return A soma absoluta de <b>a</b> e <b>b</b>.
	 * 
	 */
	
	
	public static double somaAbs(double a, double b)
	{
		return (Math.abs(a) + Math.abs(b));
	}	
	
	/**
	 * Faz potenciação. <br>
	 * Exemplo de uso: {@code Calculadora.potenciacao(3, 2)}
	 * 
	 * @param a Número base (número que se repete)
	 * @param b Número expoente (número de repetições)
	 * @return A potência de <b>a</b> elevado a <b>b</b>.
	 * 
	 */
	
	public static double potenciacao(double a, double b)
	{
		return Math.pow(a, b);
	}
}
