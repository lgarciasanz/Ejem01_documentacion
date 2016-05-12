
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado c1=new Cuadrado(2,2,2,2);
		Cuadrado c2=new Cuadrado();
		c2.setL1(2);
		c2.setL2(2);
		c2.setL3(2);
		c2.setL4(2);
		
		if (c1.equals(c2))
		//if (c1==c2)
			System.out.println("son iguales");
		else
			System.out.println("No son iguales");
		
		System.out.println(c1);
		System.out.println(c2.toString());
		
		
		
	}

}
