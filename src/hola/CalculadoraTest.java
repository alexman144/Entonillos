package hola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		double resulEsperado=17;
		Calculadora calcul1=new Calculadora(10, 7);
		double resulReal=calcul1.suma();
		assertEquals(resulEsperado,resulReal,"tus muertos");
	}

	@Test
	void testResta() {
		double resulEsperado=3;
		Calculadora calcul1=new Calculadora(10, 7);
		double resulReal=calcul1.resta();
		assertEquals(resulEsperado,resulReal,"tus muertos");
	}

	@Test
	void testMultiplica() {
		double resulEsperado=70;
		Calculadora calcul1=new Calculadora(10, 7);
		double resulReal=calcul1.multiplica();
		assertEquals(resulEsperado,resulReal,"tus muertos");
	}

	@Test
	void testDivide() {
		double resulEsperado=5;
		Calculadora calcul1=new Calculadora(10, 2);
		double resulReal=calcul1.divide();
		assertEquals(resulEsperado,resulReal,"tus muertos");
	}

}
