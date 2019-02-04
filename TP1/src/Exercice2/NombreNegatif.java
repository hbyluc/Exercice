package Exercice2;


@SuppressWarnings("serial")
public class NombreNegatif extends Exception {
	private double num;
	public NombreNegatif(double nomber) {
		this.num=nomber;
	}
	public double getNum()
	{
		return num;
	}
	
}
