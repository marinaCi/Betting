package classi;

import java.util.ArrayList;


/**
 * @author Marina Cirillo
 *
 */

public class Archivio {
	
	public ArrayList<SuperUtente> arrSuperUtente;
	public ArrayList<Utente> arrUtente;
	public ArrayList<QuotePartita> arrPartita;
	public ArrayList<QuoteCorsa> arrIppica;
	public ArrayList<ScommessaCalcio> scommesseCalcio;
	public ArrayList<ScommessaIppica> scommesseIppica;
	public SuperUtente SLogged;
	public Utente ULogged;
	
	
	
	public Archivio(){
		arrSuperUtente = new ArrayList<SuperUtente>();
		arrUtente = new ArrayList<Utente>();
		arrPartita = new ArrayList<QuotePartita>();
		arrIppica = new ArrayList<QuoteCorsa>();
		scommesseCalcio = new ArrayList<ScommessaCalcio>();
		scommesseIppica = new ArrayList<ScommessaIppica>();
		this.SLogged = null;
		this.ULogged = null;
	}
	
	/**
	 * 
	 * @param user = username dell'utente
	 * @param pass = password dell'utente
	 * @return true se username e password sono corretti
	 */
	
	public boolean loginUtente(String user, String pass){
		for(Utente u : arrUtente){
			if(u.getUsername().equals(user)&&u.getPassword().equals(pass)){
				this.ULogged = u;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param user = username del super utente
	 * @param pass = password del super utente
	 * @return true se username e password sono corretti
	 */
	
	
	public boolean loginSuperUtente(String user, String pass){
		for(SuperUtente su : arrSuperUtente){
			if(su.getUsername().equals(user)&&su.getPassword().equals(pass)){
				this.SLogged = su;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * logout del super utente
	 */
	
	public void logoutSuperUtente(){
		this.SLogged = null;
	}
	
	/**
	 * logout del super utente
	 */
	
	public void logoutUtente(){
		this.ULogged = null;
	}
	
	/**
	 * 
	 * @param nuovo = nuovo super utente da registrare
	 */
	
	public void addSuperUtente(SuperUtente nuovo){
		arrSuperUtente.add(nuovo);
	}
	
	/**
	 * 
	 * @param nuovo = nuovo utente da registrare
	 */
	
	public void addUtente(Utente nuovo){
		arrUtente.add(nuovo);
	}
	
	/**
	 * 
	 * @param nuovo = nuova partita di calcio 
	 */
	
	public void addPartita(QuotePartita nuovo){
		arrPartita.add(nuovo);
	}
	
	/**
	 * 
	 * @param nuovo = nuova corsa ippica
	 */
	
	public void addCorsa(QuoteCorsa nuovo){
		arrIppica.add(nuovo);
	}
	
	/**
	 * 
	 * @return la  lista di tutte le partite
	 */
	
	public String listaPartite(){
		String print = "";
		for(QuotePartita pc:this.arrPartita)
			print += pc.toString() + "\n";
		return print;
	}
	
	/**
	 * 
	 * @return la lista di tutte le corse ippiche
	 */
	
	public String listaIppica(){
		String print = "";
		for(QuoteCorsa ip: this.arrIppica)
			print += ip.toString() + "\n";
		return print;
	}
	
	/**
	 * 
	 * @return la lista di tutte le scommesse di calcio di un utente
	 */
	
	public String listaScommesseCalcio(){
		String print = "";
		for(ScommessaCalcio sc: this.scommesseCalcio)
			print += sc.toString() + "\n";
		return print;
	}
	
	/**
	 * 
	 * @param nuova = nuova scommessa di calcio
	 */
	
	public void addScommessaCalcio(ScommessaCalcio nuova){
		scommesseCalcio.add(nuova);
	}
	
	/**
	 * 
	 * @param nuova = nuova scommessa ippica
	 */
	
	public void addScommessaIppica(ScommessaIppica nuova){
		scommesseIppica.add(nuova);
		
	}
	
	/**
	 * 
	 * @return lista di tutte le scommesse ippiche di un utente
	 */
	
	public String listaScommesseIppica(){
		String print = "";
		for(ScommessaIppica sc: this.scommesseIppica)
			print += sc.toString() + "\n";
		return print;
	}
	
}
