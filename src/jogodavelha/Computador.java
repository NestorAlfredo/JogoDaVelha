package jogodavelha;

import java.util.Scanner;

public class Computador {
	private int vitoria;
	protected int jogada;
	private int caracter;
	private int nivel;
	protected int passada;
	private int empate;
	
	
	public Computador() {
		super();
		this.vitoria = 0;
		this.jogada = 0;
		this.caracter = 0;
		this.passada = 0;
		this.empate = 0;
	}
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
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}	
	public int getPassada() {
		return passada;
	}
	public void setPassada(int passada) {
		this.passada = passada;
	}

	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}


	Scanner Entrada = new Scanner (System.in);
	
	public void nivel() { // escolha do nivel de dificuldade
		System.out.println("Digite o Numero que corresponde ao nivel do jogo contra o computador");
		System.out.println("1 --> Nível 1");
		System.out.println("2 --> Nível 2");
		System.out.println("3 --> Nível 3");
		this.setNivel(Entrada.nextInt());
	}
	
	public void setaCaracter(int num) { // dependendo da escolha do jogador, o outro caracter é do computador
		if (num == 2) {
			this.setCaracter(1);
		}
		if(num == 1 ) {
			this.setCaracter(2);
		}
	}
	public void ressetaPassada() { //metodo subscrito
		
	}
	public int jogadaComputador() { //metodo subscrito
		return 0;
	}
}
