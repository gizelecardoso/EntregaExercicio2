
public class Joao extends Pessoas {

	@Override
	public void assinar(Entregavel e) {
		if(e.getConteudo() == "FINAIS DE SEMANA") {
			System.out.println("Assinante aos Finais de Semana");
		}
			
	}

}
