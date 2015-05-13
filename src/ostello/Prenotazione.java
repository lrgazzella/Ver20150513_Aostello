package ostello;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Vector;

public class Prenotazione {
	
	private LocalDateTime arrivo;
	private LocalDateTime partenza;
	private Vector<Stanza> stanze;
	private Cliente cliente;
	
	public Prenotazione(LocalDateTime arrivo, LocalDateTime partenza) {
		this.arrivo = arrivo;
		this.partenza = partenza;
		stanze = new Vector<Stanza>(1,1);
	}

	public LocalDateTime getArrivo() {
		return arrivo;
	}
	public LocalDateTime getPartenza() {
		return partenza;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Vector<Stanza> getStanze() {
		return stanze;
	}
	public Vector<Stanza> getStanzeDisponibili(){
		Vector<Stanza> stanzeDisponibili = new Vector<Stanza>(1,1);
		
		for( Stanza q: stanze){
			if( q.getCapienza() > q.getPostiPrenotati() ){
				stanzeDisponibili.add(q);
			}
		}
		return stanzeDisponibili;
		
	}	
	public int getNumeroGiorni(){
		
		Period giorno = Period.between(arrivo.toLocalDate(), partenza.toLocalDate());
		return giorno.getDays();
	}	
	public double getRicavo(){
		double ricavo = 0;
		for( Stanza q: stanze){
			ricavo =+ q.getCosto();
		}
		return ricavo;
		
	}
	public void addCliente(Cliente c){
		if(c != null){
			this.cliente = c;
		}else{
			throw new IllegalArgumentException("Il cliente non può essere null");
		}
	}

	@Override
	public String toString() {
		return "Prenotazione [arrivo=" + arrivo + ", partenza=" + partenza
				+ ", stanze=" + stanze + ", cliente=" + cliente + "]";
	}

	

}