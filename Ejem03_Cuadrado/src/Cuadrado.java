
public class Cuadrado {

	private int l1,l2,l3,l4;
	
	



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
	
		return this.l1==((Cuadrado)obj).l1;
	}


	public Cuadrado(int l1, int l2, int l3, int l4) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}


	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getL1() {
		return l1;
	}


	public void setL1(int l1) {
		this.l1 = l1;
	}


	public int getL2() {
		return l2;
	}


	public void setL2(int l2) {
		this.l2 = l2;
	}


	public int getL3() {
		return l3;
	}


	public void setL3(int l3) {
		this.l3 = l3;
	}


	public int getL4() {
		return l4;
	}


	public void setL4(int l4) {
		this.l4 = l4;
	}


	public int calcularSuperficie(int lado1,int lado2)
	{
		return lado1*lado2;
	}

	public int perimetro()
	{
		return 4*l1;
	}

	@Override
	public String toString() {
		return "Cuadrado [l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + ", l4="
				+ l4 + "]";
	}
	


}
