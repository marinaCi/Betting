package classi;

/**
 * @author Marina Cirillo
 *
 */
public class Ippica {
	
	private String nome;
	private String data;
	private String cavallo1;
	private String cavallo2;
	public String cavallo3;
	private String cavallo4;
	private String cavallo5;
	private String primo;
	private String secondo;
	private String terzo;
	
	/**
	 * 
	 * @param nome dell'evento
	 * @param data dell'evento
	 * @param cavallo1 = nome del primo cavallo
	 * @param cavallo2 = nome del secondo cavallo
	 * @param cavallo3 = nome del terzo cavallo
	 * @param cavallo4 = nome del quarto cavallo
	 * @param cavallo5 = nome del quinto cavallo
	 * @param primo = nome del primo classificato
	 * @param secondo = nome del secondo classificato
	 * @param terzo = nome del terzo classificato
	 */
	
	public Ippica(String nome, String data, String cavallo1, String cavallo2,
			String cavallo3, String cavallo4, String cavallo5, String primo, String secondo, String terzo) {
		super();
		this.nome = nome;
		this.data = data;
		this.cavallo1 = cavallo1;
		this.cavallo2 = cavallo2;
		this.cavallo3 = cavallo3;
		this.cavallo4 = cavallo4;
		this.cavallo5 = cavallo5;
		this.primo = primo;
		this.secondo = secondo;
		this.terzo = terzo;
	}
	
	/**
	 * 
	 * @return primo classificato
	 */
	
	public String getPrimo() {
		return primo;
	}
	
	/**
	 * 
	 * @param primo = nome del primo classificato
	 */

	public void setPrimo(String primo) {
		this.primo = primo;
	}

	/**
	 * 
	 * @return secondo classificato
	 */
	
	public String getSecondo() {
		return secondo;
	}
	
	/**
	 * 
	 * @param secondo = nome del secondo classificato
	 */

	public void setSecondo(String secondo) {
		this.secondo = secondo;
	}
	
	/**
	 * 
	 * @return terzo classificato
	 */

	public String getTerzo() {
		return terzo;
	}
	
	/**
	 * 
	 * @param terzo = nome del terzo classificato
	 */

	public void setTerzo(String terzo) {
		this.terzo = terzo;
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
	 * @return nome del primo cavallo
	 */

	public String getCavallo1() {
		return cavallo1;
	}
	
	/**
	 * 
	 * @param cavallo1 = nome del primo cavallo
	 */

	public void setCavallo1(String cavallo1) {
		this.cavallo1 = cavallo1;
	}
	
	/**
	 * 
	 * @return nome del secondo cavallo
	 */

	public String getCavallo2() {
		return cavallo2;
	}
	
	/**
	 * 
	 * @param cavallo2 = nome del secondo cavallo
	 */

	public void setCavallo2(String cavallo2) {
		this.cavallo2 = cavallo2;
	}
	
	/**
	 * 
	 * @return nome del terzo cavallo
	 */

	public String getCavallo3() {
		return cavallo3;
	}
	
	/**
	 * 
	 * @param cavallo3 = nome del terzo cavallo
	 */

	public void setCavallo3(String cavallo3) {
		this.cavallo3 = cavallo3;
	}
	
	/**
	 * 
	 * @return nome del quarto cavallo
	 */

	public String getCavallo4() {
		return cavallo4;
	}
	
	/**
	 * 
	 * @param cavallo4 = nome del quarto cavallo
	 */

	public void setCavallo4(String cavallo4) {
		this.cavallo4 = cavallo4;
	}
	
	/**
	 * 
	 * @return nome del quinto cavallo
	 */

	public String getCavallo5() {
		return cavallo5;
	}
	
	/**
	 * 
	 * @param cavallo5 = nome del quinto cavallo
	 */

	public void setCavallo5(String cavallo5) {
		this.cavallo5 = cavallo5;
	}

}
