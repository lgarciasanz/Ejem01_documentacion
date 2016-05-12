
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;



public class TestCuadrado{

	Cuadrado c=new Cuadrado();;

	@Test 
	public void testGettersSetters()
	{
		assertEquals(c.getL1(),1);
		assertEquals(c.getL2(),2);
		assertEquals(c.getL3(),3);
		assertEquals(c.getL4(),4);
	}

	@Before
	public void inicializacion() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Estoy en el setUp");
		c.setL1(1);
		c.setL2(2);
		c.setL3(3);
		c.setL4(4);
	}

	@After
	public void liberacion() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Estoy en el tearDown");
		c=null;
	}
	
	
}
