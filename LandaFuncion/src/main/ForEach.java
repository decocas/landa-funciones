package main;

import java.util.ArrayList;

import java.util.Comparator;

import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Double> listad= new ArrayList<>();
		listad.add(1.0);
		listad.add(2.0);
		listad.add(4.0);
		listad.add(5.0);
		listad.sort(Comparator.reverseOrder());// comparator
		listad.sort((a,b)->a.compareTo(b)); //landa
		for (Double double1 : listad) {
			if(double1 % 2==0) {
				System.out.println(double1);
			}
		}
		
		listad.forEach(d->{
			if(d%2==0) {
				System.out.println(d);
			}
		});
		
		listad.forEach(System.out::println);
		
	}

}
