package br.edu.ctup.model;

public class Jogos {
	private String nomeJogo;
	private int quantEstoque, preco;
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public int getQuantEstoque() {
		return quantEstoque;
	}
	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String toString() {
		return "---\nNome do jogo: "+this.nomeJogo+"\nPreço do jogo: "+this.preco+"\nQuantidae em estoque: "+this.quantEstoque;
	}

}
