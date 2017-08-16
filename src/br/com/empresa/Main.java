package br.com.empresa;

import java.util.ArrayList;

import br.com.empresa.lib.*;


public class Main {
	public static void main(String[] args) {
		System.out.println("Calculadora Java");
		//todas operações
		//última operação
		//quantidade de operações
		//mais de uma calculadora
		//nome da calculadora
		//lista de calculadoras
		ArrayList<Calculadora> listaCalculadora = new ArrayList<Calculadora>();
		listaCalculadora.add(new Calculadora(100));
		listaCalculadora.add(new Calculadora(200));
//		System.out.println(listaCalculadora.get(0).getResultado());
		listaCalculadora.get(0).Somar(150);
//		System.out.println(listaCalculadora.get(0).getResultado());
		for (Calculadora object: listaCalculadora) {
//		    System.out.println(object.getResultado());
		}
		listaCalculadora.forEach((a)->System.out.println(a.getResultado()));
	}
}
