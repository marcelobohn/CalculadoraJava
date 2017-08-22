package br.com.empresa;

import java.util.ArrayList;

import br.com.empresa.lib.*;


public class Main {
	public static void main(String[] args) {
		System.out.println("Calculadora Java");
		ArrayList<Calculadora> listaCalculadora = new ArrayList<Calculadora>();
		listaCalculadora.add(new Calculadora(100));
		listaCalculadora.add(new Calculadora(200));
//		System.out.println(listaCalculadora.get(0).getResultado()); //100
		listaCalculadora.get(0).Somar(150);
//		System.out.println(listaCalculadora.get(0).getResultado()); //250
		for (Calculadora object: listaCalculadora) {
//		    System.out.println(object.getResultado());
		}
//		listaCalculadora.forEach((a)->System.out.println(a.getResultado()));
		
		
		Calculadora calc = new Calculadora(20);
		System.out.println(calc.getResultado());
		calc.Somar(40);
		System.out.println(calc.getResultado());
	}
}
