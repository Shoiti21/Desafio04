package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	private String Marca;
	private String Modelo;
	private boolean isUsado;
	
	//construtor
	public VideoGame(String nome, double preco,int qtd,String marca,String modelo,boolean isUsado) {
		super(nome,preco,qtd);
		this.Marca=marca;
		this.Modelo=modelo;
		this.isUsado=isUsado;
	}
	
	//m�todos
	public double calcularImposto() { //calcula o imposto do video-game (usado 25% e n�o usado 45%)
		if(this.isUsado==true) {
			double varImpostoVG=0.25*super.getPreco();	
			return varImpostoVG;
		}
		else {
			double varImpostoVG=0.45*super.getPreco();	
			return varImpostoVG;
		}
	}
	
	//get e set
	public String getMarca() {
		return Marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
}
