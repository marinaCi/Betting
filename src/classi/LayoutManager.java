package classi;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LayoutManager {
	
	/**
	 * 
	 * @param row = nomero di righe
	 * @param col = numero di colonne
	 * @param gridW = numero di celle in una riga
	 * @param gridH = numero di celle in una colonna
	 * @return oggetto di tipo GridBagConstraints
	 */

	public static GridBagConstraints constraints(int row, int col, int gridW, int gridH){
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = col;
		c.gridy = row;
		c.gridwidth = gridW;
		c.gridheight = gridH;
		return c;
	}
	
	/**
	 * 
	* @param row = nomero di righe
	 * @param col = numero di colonne
	 * @param gridW = numero di celle in una riga
	 * @param gridH = numero di celle in una colonna
	 * @param ins = spazio minimo tra i componenti
	 * @return oggetto di tipo GridBagConstraints
	 */
	
	public static GridBagConstraints constraints(int row, int col, int gridW, int gridH, Insets ins){
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = col;
		c.gridy = row;
		c.gridwidth = gridW;
		c.gridheight = gridH;
		c.insets = ins;
		return c;
	}
}