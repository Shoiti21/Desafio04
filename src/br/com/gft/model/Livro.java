package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	private String Autor, Tema;
	private int qtdPag;
	
	//construtor
	public Livro(String nome, double preco,int qtd, String autor,String tema, int qtdPag) {
		super(nome,preco,qtd);
		this.Autor=autor;
		this.Tema=tema;
		this.qtdPag=qtdPag;
	}
	
	//métodos
	public double calcularImposto() { //calcula o imposto do livro (livro educativo 0% e livros não educativos 10%)
		if(this.Tema=="educativo") {
			return 0;
		}
		else {
			double varImpostoLi=0.1*super.getPreco();		
			return  varImpostoLi;
		}
	}

	//get e set
	public String getAutor() {
		return Autor;
	}

	public String getTema() {
		return Tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
}
