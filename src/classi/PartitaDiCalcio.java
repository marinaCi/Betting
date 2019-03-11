package classi;



/**
 * @author Marina Cirillo
 *
 */

public class PartitaDiCalcio{
	
	/**
	 * 
	 * @param n1 = nome dell'evento
	 * @param d = data dell'evento
	 * @param pt = risultato del primo tempo
	 * @param st = risultato del secondo tempo
	 */
	
	public PartitaDiCalcio(String n1, String d, String pt, String st){
		nome = n1;
		data = d;
		primoTempo = pt;
		secondoTempo = st;
	}
	
	/**
	 * @return tutti i dati della partita
	 */
	
	@Override
	public String toString() {
		return "PartitaDiCalcio : Nome: " + nome + ", Data: " + data
				+ ", Primo Tempo: " + primoTempo + ", Secondo Tempo: "
				+ secondoTempo;
	}
	
	/**
	 * 
	 * @param nome nuovo dell'evento
	 */
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return data dell'evento
	 */
	
	public String getData() {
		return data;
	}
	
	/**
	 * 
	 * @param data nuova dell'evento
	 */

	public void setData(String data) {
		this.data = data;
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
	 * @return risultato del primo tempo
	 */
	
	public String getPrimoTempo() {
		return primoTempo;
	}
	
	/**
	 * 
	 * @param primoTempo = risultato del primo tempo
	 */
	
	public void setPrimoTempo(String primoTempo) {
		this.primoTempo = primoTempo;
	}
	
	/**
	 * 
	 * @return risultato del secondo tempo
	 */
	
	public String getSecondoTempo() {
		return secondoTempo;
	}
	
	/**
	 * 
	 * @param secondoTempo = risultato del secondo tempo
	 */
	
	public void setSecondoTempo(String secondoTempo) {
		this.secondoTempo = secondoTempo;
	}


	private String nome;
	private String data;
	private String primoTempo;
	private String secondoTempo;
	
	

	
	
	

}
