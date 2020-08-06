package jogodavelha;

public class ComputadorDois extends Computador {
	
	@Override
	public int jogadaComputador() {
		this.setPassada(this.getPassada() -1 );
		this.setJogada(this.getPassada());
		int jogada = this.getPassada();
		return jogada;
	}
	
	@Override
	public void ressetaPassada() {
		this.setPassada(10);
	}

}
