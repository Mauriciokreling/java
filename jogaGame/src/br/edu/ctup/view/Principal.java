package br.edu.ctup.view;
import java.util.Scanner;
import br.edu.ctup.model.Jogador;
import br.edu.ctup.model.Jogos;
import br.edu.ctup.controller.ControllerJogador;
import br.edu.ctup.controller.ControllerJogos;
public class Principal {
	static ControllerJogador controllerJogador = new ControllerJogador();
	static ControllerJogos controllerJogos = new ControllerJogos();
	static Jogador jogador = new Jogador();
	static Jogos jogos = new Jogos();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		do {
		menu();
		}while(op!=6);
	}
	public static void menu() {
		System.out.println("****MENU****");
		System.out.println("1 -- CAD JOGADOR: ");
		System.out.println("2 -- LISTAR JOGADORES: ");
		System.out.println("3 -- CAD JOGOS: ");
		System.out.println("4 -- LISTAR JOGOS: ");
		System.out.println("5 -- PESQUISAR JOGO: ");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			cadastroJogador();
			break;
		case 2:
			listarJogadores();
			break;
		case 3:
			cadastroJogos();
			break;
		case 4:
			listarJogos();
			break;
		case 5:
			buscarJogos();
			break;
		default:
			System.out.println("OPÇÃO INVALIDA!");
			menu();
			break;
		
		}
	}
	
	public static void cadastroJogador() {
		jogador = new Jogador();
		System.out.println("Informe o seu nome: ");
		String nomeJogador = sc.next();
		jogador.setNomeJogador(nomeJogador);
		System.out.println("Informe um Login");
		String login = sc.next();
		jogador.setLogin(login);
		System.out.println("Informe uma senha: ");
		String senha = sc.next();
		jogador.setSenha(senha);
		System.out.println("Informe o seu CPF: ");
		Long cpf = sc.nextLong();
		jogador.setCpf(cpf);
		System.out.println("Informe seu RG: ");
		Long rg = sc.nextLong();
		jogador.setRg(rg);
		controllerJogador.cadastroJogador(jogador);
	}
	
	public static void cadastroJogos() {
		jogos = new Jogos();
		System.out.println("Insira o nome do jogo: ");
		String nomeJogo = sc.next();
		jogos.setNomeJogo(nomeJogo);
		System.out.println("Insira o preço do jogo: ");
		int preco = sc.nextInt();
		jogos.setPreco(preco);
		System.out.println("Informe a quantidade de jogos no estoque: ");
		int quantEstoque = sc.nextInt();
		jogos.setQuantEstoque(quantEstoque);
		controllerJogos.cadastroJogos(jogos);
	}
	
	public static void listarJogos() {
		System.out.println(controllerJogos.listarJogos());
	}
	
	public static void listarJogadores() {
		System.out.println(controllerJogador.listarJogador());
	}
	public static void buscarJogos() {
		System.out.println("Informe o nome a ser pesquisado: ");
		String jogo = sc.next();
		controllerJogos.buscarjogos(jogo);
		Jogos achados = controllerJogos.buscarjogos(jogo);
				if(achados == null) {
					System.out.println("Nenhum jogo encontrado!!!");
				}
				else {
					System.out.println(achados);
				}
	}

	
	

}



































