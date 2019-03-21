package br.edu.ctup.model;

public class Jogador {
	private String nomeJogador, login, senha;
	private Long rg, cpf;
	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String toString(){
		return "---\n Nome do Jogador: "+this.nomeJogador+"\nLogin: "+this.login+"\nCPF: "+this.cpf+"\nRG: "+this.rg;
	}

	
}
