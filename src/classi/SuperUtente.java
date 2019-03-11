package classi;

/**
 * 
 * @author Marina Cirillo
 *
 */

public class SuperUtente{
	

	/**
	 * 
	 * @param c = cognome del super utente
	 * @param n = nome del super utente
	 * @param u = username del super utente
	 * @param p = password del super utente
	 */
	
	public SuperUtente(String c, String n, String u, String p){
		
		cognome = c;
		nome = n;
		username = u;
		password = p;
	}
	
	/**
	 * 
	 * @return nome del super utente
	 */
	
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome nuovo del super utente
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return cognome del super utente
	 */

	public String getCognome() {
		return cognome;
	}

	/**
	 * 
	 * @param cognome nuovo del super utente
	 */

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * 
	 * @return username del super utente
	 */

	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username nuovo del super utente
	 */

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return password del super utente
	 */

	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password nuova del super utente
	 */

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	private String cognome;
	private String nome;
	private String username;
	private String password;

}
