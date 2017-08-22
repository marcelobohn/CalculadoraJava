package br.com.empresa.lib;

public class Calculadora {
	private double resultado;
	private double resultadoAnterior;
	private int operacoes;
	
	public Calculadora() {
		this.operacoes = 0;
		this.resultadoAnterior = 0;
	}
	
	public Calculadora(double valor) {
		this.operacoes = 0;
		this.resultado = valor;
		this.resultadoAnterior = 0;
	}
	
	private void incremetaOperacao() {
		this.operacoes += 1;
	}
	
	private void GravaResultadoAnterior() {
		this.resultadoAnterior = this.resultado;
	}
	
	public int getOperacoes() {
		return this.operacoes;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public double Somar(double valor) {
		this.incremetaOperacao();
		this.GravaResultadoAnterior(); 
		return this.resultado += valor;		
	}
	
	public double Subtrair(double valor) {
		this.incremetaOperacao();
		this.GravaResultadoAnterior();
		return this.resultado -= valor;
	}
	
	public double Dividir(double valor) {
		this.incremetaOperacao();
		this.GravaResultadoAnterior();
		return this.resultado /= valor;
	}

	public double Multiplicar(double valor) {
		this.incremetaOperacao();
		this.GravaResultadoAnterior();
		return this.resultado *= valor;
	}
	
	public boolean VoltarOperacao() {
		if (this.operacoes > 0) {
		this.resultado = this.resultadoAnterior;
			return true;
		} else {
			return false;
		}		
	}	
}
