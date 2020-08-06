package jogodavelha;

public class Tabuleiro {
	private String jogada[] = new String [9];
	private int jogado[] = new int [9];
	private boolean empate = false;
	private boolean inacabado  = false;
	private boolean ganhou = false;
	private int rodada = 0;
	
	public String[] getJogada() {
		return jogada;
	}

	public void setJogada(String[] jogada) {
		this.jogada = jogada;
	}

	public int[] getJogado() {
		return jogado;
	}

	public void setJogado(int[] jogado) {
		this.jogado = jogado;
	}

	public boolean getEmpate() {
		return empate;
	}

	public void setEmpate(boolean empate) {
		this.empate = empate;
	}

	public boolean getInacabado() {
		return inacabado;
	}

	public void setInacabado(boolean inacabado) {
		this.inacabado = inacabado;
	}

	public boolean getGanhou() {
		return ganhou;
	}

	public void setGanhou(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public Tabuleiro() {
		super();
	}
	
	public void novoJogo() { //Método que implementa os dados  para iniciar um jogo
		
		jogada[0] = "1"; jogada[1] = "2"; jogada[2] = "3";	jogada[3] = "4";	jogada[4] = "5";
		jogada[5] = "6";	jogada[6] = "7";	jogada[7] = "8";	jogada[8] = "9";
		
		jogado[0] = 0; jogado[1] = 0; jogado[2] = 0; jogado[3] = 0; jogado[4] = 0;
		jogado[5] = 0; jogado[6] = 0; jogado[7] = 0; jogado[8] = 0;
		
		this.setRodada(0);
		this.setEmpate(false);
		this.setGanhou(false);
		this.setInacabado(false);
	}
	
	public void mostraTabuleiro() { //Apresenta o tabuleiro na tela
		System.out.println("   ----------JOGO DA VELHA----------");
		System.out.println(" ");
		System.out.println("             " + jogada[0] + " / " + jogada[1] + " / " + jogada[2]);
		System.out.println("         ---------------");
		System.out.println("            " + jogada[3] + " / " + jogada[4] + " / " + jogada[5]);
		System.out.println("         ----------------");
		System.out.println("           " + jogada[6] + " / " + jogada[7] + " / " + jogada[8]);
	}
	
	
	public boolean jaJogado(int num) { //verifica se o a coordenada ja foi jogada;
		int verifica = num;
		boolean jajogado = false;
		int i =0;
		while (i < 9) {
			if (jogado[i] == verifica) {
				jajogado = true;
			}
			i++;
		}
		return(jajogado);
	}
	
	public void verificaGanhou() { //verificação se há ganhador
		if ((jogada[0] == jogada[1] && jogada[1] == jogada[2]) || (jogada[3] == jogada[4] && jogada[4] == jogada[5]) || (jogada[6] == jogada[7] && jogada[7] == jogada[8])) { //verifica linha
			this.setGanhou(true);
		}
		if ((jogada[0] == jogada[3] && jogada[3] == jogada[6] )|| (jogada[1] == jogada[4] && jogada[4] == jogada[7]) || (jogada[2] == jogada[5] && jogada[5] == jogada[8])) { //verifica coluna
			this.setGanhou(true);
		}
		if ((jogada[0].equals(jogada[4]) && jogada[4].equals(jogada[8]))|| (jogada[2] == jogada[4] && jogada[4] == jogada[6])) { //verifica diagonal
			this.setGanhou(true);
			
		}
	}
	
	public boolean statusDoJogo() { //verificação do status do jogo
		int i = 0;
		verificaGanhou();
		if(this.getGanhou() == false) {
			while (i < 9) { //verifica se encontrar um "0" no vetor é sinal que não foram preenchidos todos os espaços
				if (this.getJogado()[i] == 0 ) {
					this.setInacabado(true);
				}
				i++;	
			}
				if (this.getGanhou() == false && this.getInacabado() == false) { // se ninguem ganhou e nao esta inacabado, entao esta empatado
					this.setEmpate(true);
				}
		}
		return(this.getGanhou());
	}
	
	public void implementaTabuleiro(int x, int num) { // implementa os dados no tabuleiro
		String implementa = "X";
		if (x == 1) {
			implementa = "O";
		}
		jogado[this.getRodada()] = num; //até o momento nao consegui utilizar o metodo set de um vetor.
		jogada[num - 1] = implementa;
		this.setRodada(getRodada() + 1 );
	}

}
