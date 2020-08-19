package main;

import java.util.ArrayList;
import java.util.List;

public class Strem {

	public static void main(String[] args) {
		
		List<Double> listad= new ArrayList<>();
		listad.add(1.0);
		listad.add(2.0);
		listad.add(4.0);
		listad.add(5.0);
		//filter ayuda a filtrar
		//map ayuda a transformar
listad.stream().filter((a)->a.floatValue()%2==0).forEach(System.out::println);// filtrar solo los pares
listad.stream().sorted().forEach(System.out::println);//ordenar de menor amayor
listad.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);//inverso
listad.stream().map((a)->a.doubleValue()+1).forEach(System.out::println);// sumarle 1
listad.stream().map((a)->a.intValue()).forEach(System.out::println);		
	}

}
