
public class João extends Pessoas {

	@Override
	public void assinar(Entregavel e) {
		if(e.getConteudo() == "FINAL DE SEMANA") {
			System.out.println("Assinante aos Finais de Semana");
		}
			
	}

}
