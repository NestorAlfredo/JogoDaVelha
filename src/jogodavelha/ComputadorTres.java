package jogodavelha;

import java.util.Random;

public class ComputadorTres extends Computador{
	Random sorteia = new Random();
	
	@Override
	public int jogadaComputador() {
		int jogada = sorteia.nextInt(9)+1;
		this.setJogada(jogada);
		return this.getJogada();
	}

}
