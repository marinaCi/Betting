package classi;

/**
 * 
 * @author Marina Cirillo
 *
 */

public class ScommessaCalcio {
	
	private String userUtente;
	private String nome;
	private String risultatoPT;
	private String risultatoST;
	private double importo;
	private double vincita;
	
	/**
	 * 
	 * @param user = username dell'utente
	 * @param n = nome dell'evento
	 * @param rP = risultato scommesso primo tempo
	 * @param rS = risultato scommesso secondo tempo
	 * @param i = somma scommessa
	 * @param v = eventuale vincita
	 */
	

	public ScommessaCalcio(String user,String n, String rP, String rS, double i, double v){
		userUtente = user;
		nome = n;
		risultatoPT = rP;
		risultatoST = rS;
		importo = i;
		vincita = v;
	}

	
	/**
	 * @return dati della scommessa
	 */
	
	@Override
	public String toString() {
		return "ScommessaCalcio: Nome: " + nome+ ", Risultato primo tempo: " + risultatoPT + ", Risultato secondo tempo: "
				+ risultatoST + ", Importo scommesso" + importo + ", Vincita: " + vincita;
	}
	
	/**
	 * 
	 * @return username dell'utente
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
	 * @return risultato scommesso primo tempo
	 */

	public String getRisultatoPT() {
		return risultatoPT;
	}
	
	/**
	 * 
	 * @param risultatoPT = risultato scommesso primo tempo
	 */

	public void setRisultatoPT(String risultatoPT) {
		this.risultatoPT = risultatoPT;
	}
	
	/**
	 * 
	 * @return risultato scommesso secondo tempo
	 */

	public String getRisultatoST() {
		return risultatoST;
	}
	
	/**
	 * 
	 * @param risultatoST = risultato scommesso secondo tempo
	 */

	public void setRisultatoST(String risultatoST) {
		this.risultatoST = risultatoST;
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
	 * @return importo scommesso
	 */

	public double getImporto() {
		return importo;
	}

	/**
	 * 
	 * @param importo nuovo scommesso
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
	 * @param vincita = importo vinto
	 */

	public void setVincita(double vincita) {
		this.vincita = vincita;
	}


}
