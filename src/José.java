
public class José extends Pessoas {

	@Override
	public void assinar(Entregavel e) {
		if(e.getConteudo() == "DIARIO") {
			System.out.println("Assinante Estadão");
		}
		
	}

}
