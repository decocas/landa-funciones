package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	
	
	/*public double test(double a, double b) { metodo1
		IOperacion p= (a1,b1) -> {
			return (a1*b1);
		};
		 return p.sumatoria(a, b);
	}*/
	
	public  double test(double a, double b) {
	
	 return a+b;
}

	public String mensaje() {
		//System.out.println("pprurha"); metodo2
		
		return "asdad";
	}
	
	public double otro() {// referencia static
		//IOperacion op=(a,b)-> Principal.test(0.2 , 1.2);
		//IOperacion op=Principal::test; //solo se menciona el metodo sin parametros
				
		//return op.sumatoria(0.2 , 1.2);
	return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<String> lista=new ArrayList<>();
				List<Double> listad= new ArrayList<>();
				listad.add(1.0);
				listad.add(2.0);
				listad.add(4.0);
				lista.add("Car");
				lista.add("aar");
				lista.add("bar");
				double d=0;
				Collections.sort(lista, ( c1,  c2)->c1.compareToIgnoreCase(c2)); // decoracion de paramatros es opcional
				for (String s : lista) {
					System.out.println(s);
		
				}Principal p=new Principal();
			//System.out.println(p.test(listad.get(0),listad.get(2)));  metodo1 
				
			/*	IOperacion op=(n1,n2)->{
					return n1+n2;
				};								forma dos de metodo1
				d=op.sumatoria(0,1.2);
				System.out.println(d);
				*/
			/*Principal p=new Principal(); referencia a un metodo
				IOperacion op=p::mensaje;  metodo2
				System.out.println(op.publicar());
				*/
				
				/*Principal p=new Principal();
				IOperacion op=p::test;  refferencia arbitraria
				op.sumatoria(listad.get(0),listad.get(2));*/
				//System.out.println(p.otro());	
				IOperacion op=p::test;
				System.out.println(op.sumatoria(listad.get(0),listad.get(1)));// referencia particular
	}
	
	
}
