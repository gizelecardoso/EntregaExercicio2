import java.util.Random;

public abstract class Pessoas implements Observer{
	
	private boolean cancelarAssinatura;
	
	Random gerador = new Random();
	
	@Override
	public void update(Entregavel e) {
		assinar(e);
		cancelarAssinatura = gerador.nextDouble() <= 0.1;
		
	}
	
	public abstract void assinar(Entregavel e);

	public boolean cancelarAssinatura() {
		return cancelarAssinatura;
	}

}
