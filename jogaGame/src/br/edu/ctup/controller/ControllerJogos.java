package br.edu.ctup.controller;
import java.util.ArrayList;
import java.util.List;
import br.edu.ctup.model.Jogos;
public class ControllerJogos {
	List<Jogos> listaJogos = new ArrayList<Jogos>();
	public void cadastroJogos(Jogos jogos) {
		listaJogos.add(jogos);
	}
	public List<Jogos> listarJogos() {
		return listaJogos;
	}
	
	public Jogos buscarjogos(String jogo) {
		Jogos achado;
		for(int i =0; i < listaJogos.size();i++) {
			if (listaJogos.get(i).getNomeJogo().equals(jogo)) {
				achado = listaJogos.get(i);
			return achado;
			}
		}
		return null;
	}
}
