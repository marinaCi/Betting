package classi;

/**
 * @author Marina Cirillo
 *
 */

public class ScommessaIppica {
	
	private String userUtente;
	private String nome;
	private String risultato;
	private boolean cavalloPiazzato;
	private boolean cavalloVincente;
	private double importo;
	private double vincita;
	
	/**
	 * 
	 * @param userUtente = username utente
	 * @param nome = nome dell'evento
	 * @param risultato = nome del cavallo su cui si vuole puntare
	 * @param piazzato = true se la scommessa è sul piazzato
	 * @param vincente = true se la scommessa è sul vincente
	 * @param importo = somma scommessa
	 * @param vincita = eventuale vincita
	 */
	
	public ScommessaIppica(String userUtente, String nome, String risultato, boolean piazzato,
			boolean vincente, double importo, double vincita) {
		super();
		this.userUtente = userUtente;
		this.nome = nome;
		this.risultato = risultato;
		this.cavalloPiazzato = piazzato;
		this.cavalloVincente = vincente;
		this.importo = importo;
		this.vincita = vincita;
	}
	
	/**
	 * 
	 * @return username utente
	 */
	
	public String getUserUtente() {
		return userUtente;
	}
	
	/**
	 * 
	 * @param userUtente = username utente
	 */
	
	public void setUserUtente(String userUtente) {
		this.userUtente = userUtente;
	}
	
	/**
	 * 
	 * @return nome dell'evento
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * 
	 * @param nome nuovo dell'evento
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return cavallo su cui si è scommesso
	 */
	
	public String getRisultato() {
		return risultato;
	}
	
	/**
	 * 
	 * @param risultato
	 */
	
	public void setRisultato(String risultato) {
		this.risultato = risultato;
	}
	
	/**
	 * 
	 * @return true se la scommessa è sul cavallo piazzato
	 */
	
	public boolean isCavalloPiazzato() {
		return cavalloPiazzato;
	}
	
	/**
	 * 
	 * @param cavalloPiazzato = true se la scommessa è sul cavallo piazzato
	 */
	
	public void setCavalloPiazzato(boolean cavalloPiazzato) {
		this.cavalloPiazzato = cavalloPiazzato;
	}
	
	/**
	 * 
	 * @return true se la scommessa è sul cavallo vincente
	 */
	
	public boolean isCavalloVincente() {
		return cavalloVincente;
	}
	
	/**
	 * 
	 * @param cavalloVincente = true se la scommessa è sul cavallo vincente
	 */
	
	public void setCavalloVincente(boolean cavalloVincente) {
		this.cavalloVincente = cavalloVincente;
	}
	
	/**
	 * 
	 * @return importo scommesso
	 */
	
	public double getImporto() {
		return importo;
	}
	
	/**
	 * 
	 * @param importo = somma scommessa
	 */
	
	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	/**
	 * 
	 * @return vincita
	 */
	
	public double getVincita() {
		return vincita;
	}
	
	/**
	 * 
	 * @param vincita = somma vinta
	 */
	
	public void setVincita(double vincita) {
		this.vincita = vincita;
	}
	

	
}
