package br.com.gft.model;

abstract class Produto {
	private String Nome;
	private double Preco;
	private int qtd;
	
	//construtor
	public Produto(String nome, double preco, int qtd){
		this.Nome=nome;
		this.Preco=preco;
		this.qtd=qtd;
	}
	
	//get e set
	public String getNome() {
		return Nome;
	}
	public double getPreco() {
		return Preco;
	}
	public int getQtd() {
		return qtd;
	}
}
