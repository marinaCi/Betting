package classi;


/**
 * @author Marina Cirillo
 *
 */

public class QuotePartita extends PartitaDiCalcio{
	
	 	 private double x;
		 private double uno;
		 private double due;
		 private double zeroZero;
		 private double  zeroUno;
		 private double  zeroDue;
		 private double unoZero;
		 private double dueZero;
		 private double unoUno;
		 private double unoDueP;
		 private double dueUno;
		 private double dueDue;
		 					
		 private double unoX;
		 private double unoDueS;
		 private double dueX;
	

		 /**
		  * 
		  * @param n1 = nome dell'evento
		  * @param d = data dell'evento
		  * @param pt = risultato del primo tempo
		  * @param st = risultato del secondo tempo
		  * @param x = quota del pareggio
		  * @param uno = quota vittoria della prima squadra
		  * @param due = quota vittoria della seconda squadra
		  * @param zeroZero = quota risultato 0-0
		  * @param zeroUno = quota risultato 0-1
		  * @param zeroDue = quota risultato 0-2
		  * @param unoZero = quota risultato 1-0
		  * @param dueZero = quota risultato 2-0
		  * @param unoUno = quota risultato 1-1
		  * @param unoDueP = quota risultato 1-2
		  * @param dueUno = quota risultato 2-1
		  * @param dueDue = quota risultato 1-2
		  * @param unoX = quota risultato vittoria della prima squadra o del pareggio
		  * @param unoDueS = quota risultato vittoria della prima o della seconda squadra
		  * @param dueX = quota risultato pareggio o vittoria della seconda squadra
		  */

	public QuotePartita(String n1, String d, String pt, String st, double x,
			double uno, double due, double zeroZero, double zeroUno, double zeroDue,
			double unoZero, double dueZero, double unoUno, double unoDueP,
			double dueUno, double dueDue, double unoX,
			double unoDueS, double dueX) {
		
		super(n1, d, pt, st);
		this.x = x;
		this.uno = uno;
		this.due = due;
		this.zeroZero = zeroZero;
		this.zeroUno = zeroUno;
		this.zeroDue = zeroDue;
		this.unoZero = unoZero;
		this.dueZero = dueZero;
		this.unoUno = unoUno;
		this.unoDueP = unoDueP;
		this.dueUno = dueUno;
		this.dueDue = dueDue;
	
		this.unoX = unoX;
		this.unoDueS = unoDueS;
		this.dueX = dueX;
	}



	/**
	 * 
	 * @return quota risultato 0-0
	 */
	
	public double getZeroZero() {
		return zeroZero;
	}


	/**
	 * 
	 * @param zeroZero = quota risultato 0-0
	 */
	
	public void setZeroZero(double zeroZero) {
		this.zeroZero = zeroZero;
	}


	/**
	 * 
	 * @return quota pareggio o vittoria della seconda squadra
	 */
	
	public double getDueX() {
		return dueX;
	}


	/**
	 * 
	 * @param dueX = quota pareggio o vittoria della seconda squadra
	 */

	public void setDueX(double dueX) {
		this.dueX = dueX;
	}


	/**
	 * 
	 * @return quota pareggio
	 */

	public double getX() {
		return x;
	}


	/**
	 * 
	 * @param x = quota pareggio
	 */

	public void setX(double x) {
		this.x = x;
	}

	/**
	 * 
	 * @return quota vittoria della prima squadra
	 */

	public double getUno() {
		return uno;
	}

	/**
	 * 
	 * @param uno = quota vittoria della prima squadra
	 */

	public void setUno(double uno) {
		this.uno = uno;
	}

	/**
	 * 
	 * @return quota vittoria della seconda squadra
	 */

	public double getDue() {
		return due;
	}

	/**
	 * 
	 * @param due = quota vittoria della seconda squadra
	 */

	public void setDue(double due) {
		this.due = due;
	}


	/**
	 * 
	 * @return quota risultato 0-1
	 */

	public double getZeroUno() {
		return zeroUno;
	}


	/**
	 * 
	 * @param zeroUno = quota risultato 0-1
	 */

	public void setZeroUno(double zeroUno) {
		this.zeroUno = zeroUno;
	}


	/**
	 * 
	 * @return quota risultato 0-2
	 */

	public double getZeroDue() {
		return zeroDue;
	}


	/**
	 * 
	 * @param zeroDue = quota risultato 0-2
	 */

	public void setZeroDue(double zeroDue) {
		this.zeroDue = zeroDue;
	}


	/**
	 * 
	 * @return quota risultato 1-0
	 */

	public double getUnoZero() {
		return unoZero;
	}


	/**
	 * 
	 * @param unoZero = quota risultato 1-0
	 */

	public void setUnoZero(double unoZero) {
		this.unoZero = unoZero;
	}


	/**
	 * 
	 * @return quota risultato 2-0
	 */

	public double getDueZero() {
		return dueZero;
	}


	/**
	 * 
	 * @param dueZero = quota risultato 2-0
	 */

	public void setDueZero(double dueZero) {
		this.dueZero = dueZero;
	}


	/**
	 * 
	 * @return quota risultato 1-1
	 */

	public double getUnoUno() {
		return unoUno;
	}

	/**
	 * 
	 * @param unoUno = quota risultato 1-1
	 */


	public void setUnoUno(double unoUno) {
		this.unoUno = unoUno;
	}

	
	/**
	 * 
	 * @return quota risultato 1-2
	 */

	public double getUnoDueP() {
		return unoDueP;
	}


	/**
	 * 
	 * @param unoDueP = quota risultato 1-2
	 */

	public void setUnoDueP(double unoDueP) {
		this.unoDueP = unoDueP;
	}


	/**
	 * 
	 * @return quota risultato 2-1
	 */

	public double getDueUno() {
		return dueUno;
	}

	/**
	 * 
	 * @param dueUno = quota risultato 2-1
	 */


	public void setDueUno(double dueUno) {
		this.dueUno = dueUno;
	}

	/**
	 * 
	 * @return quota risultato 2-2
	 */

	public double getDueDue() {
		return dueDue;
	}


	/**
	 * 
	 * @param dueDue = quota risultato 2-2
	 */

	public void setDueDue(double dueDue) {
		this.dueDue = dueDue;
	}

	/**
	 * 
	 * @return quota vittoria della prima squadra o pareggio
	 */

	public double getUnoX() {
		return unoX;
	}


	/**
	 * 
	 * @param unoX = quota vittoria della prima squadra o pareggio
	 */

	public void setUnoX(double unoX) {
		this.unoX = unoX;
	}


	/**
	 * 
	 * @return quota vittoria della prima o della seconda squadra
	 */

	public double getUnoDueS() {
		return unoDueS;
	}

	/**
	 * 
	 * @param unoDueS = quota vittoria della prima o della seconda squadra
	 */


	public void setUnoDueS(double unoDueS) {
		this.unoDueS = unoDueS;
	}

	
	/**
	 * @return dati e quote dell'evento
	 */

	@Override
	public String toString() {
		return super.toString()+ " Quote partita: 1: " + uno + ", X: " + uno + ", 2: " + due
				+ ", 0-0: " +zeroZero+  ", 0-1: " + zeroUno + ", 0-2: " + zeroDue
				+ ", 1-0: " + unoZero + ", 2-0: " + dueZero + ", 1-1: "
				+ unoUno + ", 1-2: " + unoDueP + ", 2-1: " + dueUno
				+ ", 2-2: " + dueDue + ", 1-X: " + unoX
				+ ", 1-2: " + unoDueS + ", 2-X: " + dueX;
	}
	
}
