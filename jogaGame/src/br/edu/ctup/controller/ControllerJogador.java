package br.edu.ctup.controller;
import java.util.ArrayList;
import java.util.List;
import br.edu.ctup.model.Jogador;
public class ControllerJogador {
	List<Jogador> listaJogador = new ArrayList<Jogador>();
	public void cadastroJogador(Jogador jogador) {
		listaJogador.add(jogador);
	}
	public List<Jogador> listarJogador() {
		return listaJogador;
	}
}
