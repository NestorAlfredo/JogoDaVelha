package jogodavelha;

import java.util.Scanner;

public class Jogador {
	private int vitoria;
	private int jogada;
	private int caracter;
	private String nome;
	private int empate;
	
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getJogada() {
		return jogada;
	}
	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	public int getCaracter() {
		return caracter;
	}
	public void setCaracter(int caracter) {
		this.caracter = caracter;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	public Jogador(String nome) {
		super();
		this.vitoria = 0;
		this.jogada = 0;
		this.caracter = 0;
		this.nome = nome;
		this.empate = 0;
	}

	Scanner Entrada = new Scanner (System.in);
	
	
	public void setaCaracter() { //Escolha do caracter no jogo
		System.out.println(this.getNome() +  " Digite o Numero que corresponde ao Caracter que deseja jogar");
		System.out.println(" 1 --> O ");
		System.out.println(" 2 --> X ");
		this.setCaracter(Entrada.nextInt());
	}
	
	public int jogada() { //jogada do jogador
		System.out.println("Digite a cordenada onde deseja jogar");
		this.setJogada(Entrada.nextInt());
		return(this.getJogada());
	}
	
}
