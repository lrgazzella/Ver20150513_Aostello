package ostello;
import java.util.Vector;

public class Stanza {
	private String numero;
	private Vector<Prenotazione> prenotazioni;
	private int postiPrenotati;
	private int capienza;
	private double costo;
	
	public Stanza(String numero){
		this.numero = numero;
		prenotazioni = new Vector<Prenotazione>(1,1);
		postiPrenotati = 0;
	}

	public String getNumero() {
		return numero;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	
	public void addPrenotazione(Prenotazione p){
		if(p != null){
			this.prenotazioni.add(p);
		}else{
			throw new IllegalArgumentException("La prenotazione non può essere null");
		}
		
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Stanza [numero=" + numero + ", prenotazioni=" + prenotazioni
				+ ", postiPrenotati=" + postiPrenotati + ", capienza="
				+ capienza + ", costo=" + costo + "]";
	}

	
}