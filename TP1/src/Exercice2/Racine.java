package Exercice2;

public class Racine {

	private double precision;	
	
	Racine(double precision)	{		
		this.precision=precision;	
		}	
	
	double racine(double operande) 
			throws NombreNegatif	{		
		double solution, carre, a, b;		
		a=0;		
		if (operande >= 0) {			
			b=operande;		
			}		
		else {			
			throw new NombreNegatif(operande);		
			}		
		solution=(a+b)/2;		
		while(b-a>precision){
			carre=solution*solution;
			if (carre>operande) b=solution;
			else a=solution;
			solution=(a+b)/2;		
			}		
		return solution;	
		}	
	double getPrecision() { 
		return precision; 
		}	
	
	void setPrecision(double precision) { 
		this.precision=precision; 
		}
}
