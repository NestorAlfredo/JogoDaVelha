package jogodavelha;

import java.util.Scanner;

public class Jogo {
	static int entrada;

	public static void main(String[] args) {
		int i = 0;
		int jogos = 0;
		String nome;
		Scanner Entrada = new Scanner (System.in);
		Computador c = new Computador();
		ComputadorUm c1 = new ComputadorUm();
		ComputadorDois c2 = new ComputadorDois();
		ComputadorTres c3 = new ComputadorTres();
		Tabuleiro t1 = new Tabuleiro();
		System.out.println("Jogador 1 digite seu nome");
		Jogador j1 = new Jogador(nome = Entrada.nextLine());
		System.out.println("Desja iniciar o JOGO DA VELHA [1 = Sim ou 2 = Não]");
		entrada = Entrada.nextInt();
		j1.setaCaracter();//pede para o jogador se ele joga com "X" ou  "O"
		c.setaCaracter(j1.getCaracter()); // de acordo com o caracter do jogador, implementa o caracter do computador
		while (entrada == 1) {
			t1.novoJogo(); // reestabelece o tabuleiro
			c.nivel(); // Seleção do nivel do computador
			c1.ressetaPassada();
			c2.ressetaPassada();
			jogos ++;
			if (jogos %2 != 0 ) { //Jogos impares o jogador inicia, e jogos pares o computador inicia
				System.out.println(j1.getNome() + " Nesta rodada voce começa");
				while( i < 9 ) {
					t1.mostraTabuleiro();
					while(true) {
						j1.jogada();
						boolean jogadojogador = t1.jaJogado(j1.getJogada()); // verifica se essa jogada é possivel
						if (jogadojogador == false) {
						break;
						}
						else {
							System.out.println("Já jogada, escolha outro numero");
						}
					}
					t1.implementaTabuleiro(j1.getCaracter(), j1.getJogada()); //verifica se ha ganhador
					boolean temosganhador = t1.statusDoJogo();
					if (temosganhador) {
						t1.mostraTabuleiro();
						j1.setVitoria(j1.getVitoria()+1);
						System.out.println(" ");
						System.out.println("    --->TEMOS UM GANHADOR<---");
						System.out.println("PARABÉNS " + j1.getNome() + " VOCÊ VENCEU");
						break;
					}
					if(c.getNivel() == 1) { //computador nivel 1
						while(true) {
							c1.jogadaComputador();
							boolean jogadocomputador = t1.jaJogado(c1.getJogada());
							if (jogadocomputador == false) {
							break;
							}
						}
						t1.implementaTabuleiro(c.getCaracter(), c1.getJogada());
						boolean temosganhadorc = t1.statusDoJogo();
						if (temosganhadorc) {
							t1.mostraTabuleiro();
							c.setVitoria(c.getVitoria()+1);
							System.out.println(" ");
							System.out.println("    --->TEMOS UM GANHADOR<---");
							System.out.println("WOW, Não foi desta vez, o computador venceu...");
							break;
						}
					}
					else if(c.getNivel() == 2) {
						while(true) {
							c2.jogadaComputador();
							boolean jogadocomputador = t1.jaJogado(c2.getJogada());
							if (jogadocomputador == false) {
							break;
							}
						}
						t1.implementaTabuleiro(c.getCaracter(), c2.getJogada());
						boolean temosganhadorc = t1.statusDoJogo();
						if (temosganhadorc) {
							t1.mostraTabuleiro();
							c.setVitoria(c.getVitoria()+1);
							System.out.println(" ");
							System.out.println("    --->TEMOS UM GANHADOR<---");
							System.out.println("WOW, Não foi desta vez, o computador venceu...");
							break;
						}
					}
					else if(c.getNivel() == 3) {
						while(true) {
							c3.jogadaComputador();
							boolean jogadocomputador = t1.jaJogado(c3.getJogada());
							if (jogadocomputador == false) {
							break;
							}
						}
						t1.implementaTabuleiro(c.getCaracter(), c3.getJogada());
						boolean temosganhadorc = t1.statusDoJogo();
						if (temosganhadorc) {
							t1.mostraTabuleiro();
							c.setVitoria(c.getVitoria()+1);
							System.out.println(" ");
							System.out.println("    --->TEMOS UM GANHADOR<---");
							System.out.println("WOW, Não foi desta vez, o computador venceu...");
							break;
						}
					}
				}
			}
			else {  //Jogos impares o jogador inicia, e jogos pares o computador inicia
				System.out.println("O COMPUTADOR já iniciou o jogo.");
				while( i < 9 ) {
					if(c.getNivel() == 1) { //computador nivel 1
						while(true) {
							c1.jogadaComputador();
							boolean jogadocomputador = t1.jaJogado(c1.getJogada());
							if (jogadocomputador == false) {
							break;
							}
						}
						t1.implementaTabuleiro(c.getCaracter(), c1.getJogada());
						boolean temosganhadorc = t1.statusDoJogo();
						if (temosganhadorc) {
							t1.mostraTabuleiro();
							c.setVitoria(c.getVitoria()+1);
							System.out.println(" ");
							System.out.println("    --->TEMOS UM GANHADOR<---");
							System.out.println("WOW, Não foi desta vez, o computador venceu...");
							break;
						}
					}
					else if(c.getNivel() == 2) {
						while(true) {
							c2.jogadaComputador();
							boolean jogadocomputador = t1.jaJogado(c2.getJogada());
							if (jogadocomputador == false) {
							break;
							}
						}
						t1.implementaTabuleiro(c.getCaracter(), c2.getJogada());
						boolean temosganhadorc = t1.statusDoJogo();
						if (temosganhadorc) {
							t1.mostraTabuleiro();
							c.setVitoria(c.getVitoria()+1);
							System.out.println(" ");
							System.out.println("    --->TEMOS UM GANHADOR<---");
							System.out.println("WOW, Não foi desta vez, o computador venceu...");
							break;
						}
					}
					else if(c.getNivel() == 3) {
						while(true) {
							c3.jogadaComputador();
							boolean jogadocomputador = t1.jaJogado(c3.getJogada());
							if (jogadocomputador == false) {
							break;
							}
						}
						t1.implementaTabuleiro(c.getCaracter(), c3.getJogada());
						boolean temosganhadorc = t1.statusDoJogo();
						if (temosganhadorc) {
							t1.mostraTabuleiro();
							c.setVitoria(c.getVitoria()+1);
							System.out.println(" ");
							System.out.println("    --->TEMOS UM GANHADOR<---");
							System.out.println("WOW, Não foi desta vez, o computador venceu...");
							break;
						}
					}
					t1.mostraTabuleiro();
					while(true) {
						j1.jogada();
						boolean jogadojogador = t1.jaJogado(j1.getJogada()); // verifica se essa jogada é possivel
						if (jogadojogador == false) {
						break;
						}
						else {
							System.out.println("Já jogada, escolha outro numero");
						}
					}
					t1.implementaTabuleiro(j1.getCaracter(), j1.getJogada()); //verifica se ha ganhador
					boolean temosganhador = t1.statusDoJogo();
					if (temosganhador) {
						t1.mostraTabuleiro();
						j1.setVitoria(j1.getVitoria()+1);
						System.out.println(" ");
						System.out.println("    --->TEMOS UM GANHADOR<---");
						System.out.println("PARABÉNS " + j1.getNome() + " VOCÊ VENCEU");
						break;
					}
				}
			}
			System.out.println("Deseja jogar novamente [1 = Sim ou 2 = Não]");
			entrada = Entrada.nextInt();
		}
			
			if (t1.getInacabado() && t1.getGanhou() == false) {
				System.out.println("Jogo inacabado");
			}
			if (t1.getEmpate()) {
				System.out.println("Jogo Empatado");
				c.setEmpate(c.getEmpate()+1);
				j1.setEmpate(j1.getEmpate()+1);
			}
			if (t1.getGanhou()) {
				System.out.println("TEMOS UM GANHADOR");
			}
			System.out.println(" ");
			System.out.println("    ---> ESTATÍSTICAS <---");
			System.out.println(" ");
			System.out.println("Computador venceu " + c.getVitoria() + " vezes");
			System.out.println(" ");
			System.out.println(j1.getNome()+ " voce venceu " + j1.getVitoria() + " vezes");
			System.out.println(" ");
			System.out.println("Vocês empataram " + j1.getEmpate() + " veses");
	}

}
