package br.com.empresa.lib;

public class Calculadora {
	private double resultado;
	private int operacoes;
	
	public Calculadora() {
		this.operacoes = 0;
	}
	
	public Calculadora(double valor) {
		this.operacoes = 0;
		this.resultado = valor;
	}
	
	private void incremetaOperacao() {
		this.operacoes += 1;
	}
	
	public int getOperacoes() {
		return this.operacoes;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public double Somar(double valor) {
		this.incremetaOperacao();
		return this.resultado += valor;		
	}
	
	public double Subtrair(double valor) {
		this.incremetaOperacao();
		return this.resultado -= valor;
	}
	
	public double Dividir(double valor) {
		this.incremetaOperacao();
		return this.resultado /= valor;
	}
	
	//# implementações a serem realizadas
	// - teste com multiplicação
	// - armazenar o quantidade de operações realizadas
	// - armazenar a última operação realizada e permitir voltar
}
