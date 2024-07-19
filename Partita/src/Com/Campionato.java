package Com;

import java.util.ArrayList;
import java.util.List;

public class Campionato {
	private String nome;
	private List<Squadra> squadre;
	private List<Partita> partite = new ArrayList<Partita>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Squadra> getSquadre() {
		return squadre;
	}

	public void setSquadre(List<Squadra> squadre) {
		this.squadre = squadre;
	}

	public List<Partita> getPartite() {
		return partite;
	}

	public void setPartite(List<Partita> partite) {
		this.partite = partite;
	}

	public void infoSquadra(Squadra sq) {

		for (Partita partita : partite) {
			if (partita.getSquadraCasa().getNameSquadra().equals(sq.getNameSquadra())) {

				System.out.println(sq.getNameSquadra() + " - " + partita.getSquadraTrasferta().getNameSquadra()
						+ " questa partita è stata giocata in casa");
			}
               
			if (partita.getSquadraTrasferta().getNameSquadra().equals(sq.getNameSquadra())) {

				System.out.println(sq.getNameSquadra() + " - " + partita.getSquadraCasa().getNameSquadra()
						+ " questa partita è stata giocata in trasferta");
			}
		}

	}

}
