
public class Maria extends Pessoas {


	@Override
	public void assinar(Entregavel e) {
		if(e.getConteudo() == "SEMANA") {
			System.out.println("Assinante Marie Claire");
		}
		
	}

}
