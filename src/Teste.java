public class Teste {

	public static void main(String[] args){
		
		Editora editora = new Editora();
		
		editora.addObserver(new Maria());
		editora.addObserver(new Jose());
		editora.addObserver(new Joao());
	

		try {
			editora.iniciar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
