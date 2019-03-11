package classi;


/**
 * @author Marina Cirillo
 *
 */


public class Utente {
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private double credito;
	
/**
 * 	
 * @param n1 = nome dell'utente
 * @param c1 = cognome dell'utente
 * @param u1 = username dell'utente
 * @param p1 = password dell'utente
 * @param cr = credito dell'utente
 */
	
	public Utente(String c1, String n1, String u1, String p1, double cr){
		
		cognome = c1;
		nome = n1;
		username = u1;
		password = p1;
		credito = cr;	
	
	}
	
	/**
	 * 
	 * @return nome dell'utente
	 */

	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome nuovo dell'utente
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return cognome dell'utente
	 */

	public String getCognome() {
		return cognome;
	}
	
	/**
	 * 
	 * @param cognome nuovo dell'utente
	 */

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * 
	 * @return username dell'utente
	 */
	
	public String getUsername() {
		return username;
	}
	
	/**
	 * 
	 * @param username nuovo dell'utente
	 */

	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * 
	 * @return password dell'utente
	 */

	public String getPassword() {
		return password;
	}
	
	/**
	 * 
	 * @param password nuova dell'utente
	 */

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @param importo da versare
	 */
	
	public void versaCredito(double importo){
		credito+=importo;
	}
	
	/**
	 * 
	 * @param importo da prelevare
	 */
	
	public void prelevaCredito(double importo){
		credito-=importo;
	}
	
	/**
	 * 
	 * @return credito dell'utente
	 */

	public double getCredito() {
		return credito;
	}
	


}
