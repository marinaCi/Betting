package classi;

/**
 * @author Marina Cirillo
 *
 */
public class QuoteCorsa extends Ippica{
	


	private double quota1;
	private double quota2;
	private double quota3;
	private double quota4;
	private double quota5;
	private double quota1p;
	private double quota2p;
	private double quota3p;
	private double quota4p;
	private double quota5p;
	
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
	 * @param quota1 = quota del primo cavallo vincente
	 * @param quota2 = quota del secondo cavallo vincente
	 * @param quota3 = quota del terzo cavallo vincente
	 * @param quota4 = quota del quarto cavallo vincente
	 * @param quota5 = quota del quinto cavallo vincente
	 * @param quota1p = quota del primo cavallo piazzato
	 * @param quota2p = quota del secondo cavallo piazzato
	 * @param quota3p = quota del terzo cavallo piazzato
	 * @param quota4p = quota del quarto cavallo piazzato
	 * @param quota5p = quota del quinto cavallo piazzato
	 */
	
	public QuoteCorsa(String nome, String data, String cavallo1,
			String cavallo2, String cavallo3, String cavallo4, String cavallo5,
			String primo, String secondo, String terzo, double quota1,
			double quota2, double quota3, double quota4, double quota5, double quota1p,
			double quota2p, double quota3p, double quota4p, double quota5p) {
		super(nome, data, cavallo1, cavallo2, cavallo3, cavallo4, cavallo5,
				primo, secondo, terzo);
		this.quota1 = quota1;
		this.quota2 = quota2;
		this.quota3 = quota3;
		this.quota4 = quota4;
		this.quota5 = quota5;
		this.quota1p = quota1p;
		this.quota2p = quota2p;
		this.quota3p = quota3p;
		this.quota4p = quota4p;
		this.quota5p = quota5p;
		
	}

	/**
	 * 
	 * @return quota del primo cavallo piazzato
	 */
	
	public double getQuota1p() {
		return quota1p;
	}

	/**
	 * 
	 * @param quota1p = quota del primo cavallo piazzato
	 */
	
	public void setQuota1p(double quota1p) {
		this.quota1p = quota1p;
	}

	/**
	 * 
	 * @return quota del secondo cavallo piazzato
	 */
	
	public double getQuota2p() {
		return quota2p;
	}
	
	/**
	 * 
	 * @param quota2p = quota del secondo cavallo piazzato
	 */

	public void setQuota2p(double quota2p) {
		this.quota2p = quota2p;
	}

	/**
	 * 
	 * @return quota del terzo cavallo piazzato
	 */
	
	public double getQuota3p() {
		return quota3p;
	}


	/**
	 * 
	 * @param quota3p = quota del terzo cavallo piazzato
	 */
	
	public void setQuota3p(double quota3p) {
		this.quota3p = quota3p;
	}

	/**
	 * 
	 * @return quota del quarto cavallo piazzato
	 */
	
	public double getQuota4p() {
		return quota4p;
	}

	/**
	 * 
	 * @param quota4p = quota del quarto cavallo piazzato
	 */

	public void setQuota4p(double quota4p) {
		this.quota4p = quota4p;
	}
	
	/**
	 * 
	 * @return quota del quinto cavallo piazzato
	 */


	public double getQuota5p() {
		return quota5p;
	}

	/**
	 * 
	 * @param quota5p = quota del quinto cavallo piazzato
	 */

	public void setQuota5p(double quota5p) {
		this.quota5p = quota5p;
	}

	/**
	 * 
	 * @return quota del primo cavallo vincente
	 */
	
	public double getQuota1() {
		return quota1;
	}

	/**
	 * 
	 * @param quota1 = quota del primo cavallo vincente
	 */
	
	public void setQuota1(double quota1) {
		this.quota1 = quota1;
	}
	
	/**
	 * 
	 * @return quota del secondo cavallo vincente
	 */
	
	public double getQuota2() {
		return quota2;
	}
	
	/**
	 * 
	 * @param quota2 = quota del secondo cavallo vincente
	 */

	public void setQuota2(double quota2) {
		this.quota2 = quota2;
	}
	
	/**
	 * 
	 * @return quota del terzo cavallo vincente
	 */

	public double getQuota3() {
		return quota3;
	}
	
	/**
	 * 
	 * @param quota3 = quota del terzo cavallo vincente
	 */

	public void setQuota3(double quota3) {
		this.quota3 = quota3;
	}
	
	/**
	 * 
	 * @return quota del quarto cavallo vincente
	 */

	public double getQuota4() {
		return quota4;
	}
	
	/**
	 * 
	 * @param quota4 = quota del quarto cavallo vincente
	 */

	public void setQuota4(double quota4) {
		this.quota4 = quota4;
	}
	
	/**
	 * 
	 * @return quota del quinto cavallo vincente
	 */

	public double getQuota5() {
		return quota5;
	}
	
	/**
	 * 
	 * @param quota5 = quota del quinto cavallo vincente
	 */

	public void setQuota5(double quota5) {
		this.quota5 = quota5;
	}

	/**
	 * @return dati e quote dell'evento
	 */
	
	@Override
	public String toString() {
		return "Ippica: Nome: " + super.getNome() + ", Data: " + super.getData() + ", Partecipanti: "
				+ super.getCavallo1() + ", quota vincente:  " +quota1+ ", quota piazzato" + quota1p + ", " +super.getCavallo2() + ", quota vincente:  " +quota2+ ", quota piazzato: " + quota2p +
				", "+ super.getCavallo3() + ", quota vincente: " + quota3 + ", quota piazzato: " + quota3p + ", " + super.getCavallo4() + ", quota vincente: " +quota4 + ", quota piazzato: " + quota4p + ", "
				+ super.getCavallo5()+ ", quota vincente: " + quota5+ ", quota piazzato: " + quota5p + "Podio: " + super.getPrimo() +", " + super.getSecondo() +", "+ super.getTerzo();
	}
	
	
}
