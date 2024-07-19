package Com;

public class TestMatch {
	public static void main(String[] args) {
		
		Campionato c = new Campionato();              //istanzio un nuovo campionato
		c.setNome("calcio 2024 - 2025");
		
		Partita p = new Partita();                      //istanzio una nuova partita 
		 
		Squadra s = new Squadra();      // qui inserisco il nome della prima squadra in quella partita  
		s.setNameSquadra("Napoli");
		
		Squadra s1 = new Squadra();
		s1.setNameSquadra("Inter");
		
		
		p.setSquadraCasa(s);                    //qui settiamo quale quadra gioca in casa e in trasferta 
		p.setSquadraTrasferta(s1);
		
	   	c.getPartite().add(p);       // qui aggiungiamo nell'arrayList del campionato la partita 
		
		
	   	c.infoSquadra(s);
	   	c.infoSquadra(s1);
	   	
		
	}
	

}
