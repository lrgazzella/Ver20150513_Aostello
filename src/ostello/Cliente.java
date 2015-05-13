package ostello;

import java.util.Vector;

public class Cliente {
	private String nome;
	private String cognome;
	private String numeroTelefono;
	private Vector<Prenotazione> prenotazioni;
	
	public Cliente(String nome, String cognome, String numeroTelefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.numeroTelefono = numeroTelefono;
		prenotazioni = new Vector<Prenotazione>(1,1);
	}
	
	public double getRicavo(){
		double ricavo = 0;
		for( Prenotazione q: prenotazioni){
			for( Stanza s: q.getStanze()){
				ricavo =+ s.getCosto();
			}
		}
		return ricavo;
	}	
	public int getNumeroGiorni(){
		int numeroGiorni = 0;
		for( Prenotazione q: prenotazioni){
			numeroGiorni =+ q.getNumeroGiorni();
		}
		return numeroGiorni;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome
				+ ", numeroTelefono=" + numeroTelefono + ", prenotazioni="
				+ prenotazioni + "]";
	}
	
}
