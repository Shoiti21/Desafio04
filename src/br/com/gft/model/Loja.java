package br.com.gft.model;

import java.util.List;

public class Loja {
	private String Nome;
	private String CNPJ;
	private List<Livro> livros;
	private List<VideoGame> videogames;
	
	//construtor
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videogames) {
		this.Nome=nome;
		this.CNPJ=cnpj;
		this.livros=livros;
		this.videogames=videogames;
	}

	//métodos
	public void listaLivros() { //print da lista de livros
		if(this.livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		}
		else {
			System.out.println("A loja "+this.Nome+" possui estes livros para venda:");
			for(Livro livro:this.livros) {
				System.out.println("Titulo: "+livro.getNome()+", Preço: R$ "+livro.getPreco()+", Quantidade de páginas: "+livro.getQtdPag()+", Quantidade no estoque: "+livro.getQtd());
			}
			System.out.println("---------------------------------------------------------------");
		}
	}
	public void listaVideoGames(){ //print da lista de video-games
		if(this.videogames==null) {
			System.out.println("A loja não tem video-games no seu estoque.");
		}
		else {
			System.out.println("A loja "+this.Nome+" possui estes video-games para venda:");
			for(VideoGame game : this.videogames) {
				System.out.println("Video-game: "+game.getNome()+" "+game.getModelo()+" - "+game.getMarca()+", Preço: R$ "+game.getPreco()+", Quantidade no estoque: "+game.getQtd());
			}
			System.out.println("---------------------------------------------------------------");
		}
	}
	public double calculaPatrimonio() {
		double valorPatri = 0;
		for(VideoGame game:this.videogames) {
			valorPatri+=game.getPreco()*game.getQtd();
		}
		for(Livro livro:this.livros) {
			valorPatri+=livro.getPreco()*livro.getQtd();
		}
		return valorPatri;
	}
	
	//get e set
	public String getNome() {
		return Nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
}
