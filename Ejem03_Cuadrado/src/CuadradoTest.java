
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 */

/**
 * @author victorvergel
 * 
 */
public class CuadradoTest {

	/**
	 * Test method for {@link Cuadrado#calcularSuperficie(int, int)}.
	 */
	@Test(timeout=500)
	public void testCalcularSuperficie() {
		System.out.println("Principio de testCalcularSuperficie");
		Cuadrado cuadraTest=null;
		for (int i = 0; i < 9999999; i++) {
			cuadraTest = new Cuadrado(8, 8, 8, 8);
		}
		
		Assert.assertEquals(64,
				cuadraTest.calcularSuperficie(cuadraTest.getL1(),cuadraTest.getL2()));
		System.out.println("final de testCalcularSuperficie");

	}
	
	@Before
	public void preparacionMetodo()
	{
		System.out.println("preparacionMetodo");
		
	}
	
	@After
	public void limpiezaMetodo()
	{
		System.out.println("limpiezaMetodo");
		
	}
	
	@AfterClass
	public static void limpiezaMetodoClase()
	{
		System.out.println("limpiezaMetodoClase");
		
	}
	
	
	@BeforeClass
	public static void preparacionClase()
	{
		System.out.println("preparacionClase");
	}
	
	

	/**
	 * Test method for {@link Cuadrado#perimetro()}.
	 */
	@Test(expected=java.lang.ArithmeticException.class ) 
	public void testPerimetro() {
		 int valor=5/0;
		 System.out.println(5/0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
