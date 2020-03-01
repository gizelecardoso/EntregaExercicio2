import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Editora implements Subject{
	
	List<Observer> observers = new ArrayList<>();
	
	Entregavel entregavel = new Entregavel();
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void notifyObserver() {
		
		List<Observer> aux = new ArrayList<>();
		
		for (Observer o : observers) {
			o.update(entregavel);
			
			if(!((Pessoas)o).cancelarAssinatura()){
				aux.add(o);
			}
			
			System.out.println();
		}
		
		observers.clear();
		observers.addAll(aux);
		
		if(aux.isEmpty()) {
			System.out.println("Falimos !!!!!!!");
		}

		
	}
	
	public void iniciar() {
		
		while(true) {
		
		
		Calendar c = new GregorianCalendar(); 
		
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
				c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				entregavel.setConteudo("FINAIS DE SEMANA");
				notifyObserver();
				
				
				
			}
			
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY ||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
				entregavel.setConteudo("SEMANA");
				notifyObserver();
				
			}
			
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY ||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY ||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
					c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				entregavel.setConteudo("DIARIO");
				notifyObserver();
				
				
			}
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("================================");

		
		}
		
		
	
		
	}
	
	

}
