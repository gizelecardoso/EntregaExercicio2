public class Teste {

	public static void main(String[] args) {
		
		Editora editora = new Editora();
		
		editora.addObserver(new Maria());
		editora.addObserver(new José());
		editora.addObserver(new João());
	

		editora.iniciar();

	}

}
