package component;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Marina Cirillo
 *
 */
public class SceltaTempo extends JDialog {
	
	private static final long serialVersionUID = 4L;
	
	public boolean sceltaPrimoTempo = false;
	public boolean sceltaSecondoTempo = false;
	
	private JButton ok;
	private JButton annulla;
	
	private JRadioButton primoTempo = new JRadioButton();
	private JRadioButton secondoTempo = new JRadioButton();
	private ButtonGroup bg = new ButtonGroup();
	
	{
	this.bg.add(primoTempo);
	this.bg.add(secondoTempo);
	}

	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	
	public SceltaTempo(JFrame root, String string) {
		super(root,string,true);
		
		this.inizializza();
	}
	
	/**
	 * Inizializzazione
	 */
	
	private void inizializza(){
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.setSize(300, 150);
		int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
		int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		
		this.setLayout(new GridLayout(3,1));
		
		JPanel pnlOne = new JPanel();
		JLabel lblPrimoTempo = new JLabel("Primo tempo");
		pnlOne.add(lblPrimoTempo);
		
		JPanel pnlTwo = new JPanel();
		JLabel lblSecondoTempo = new JLabel("Secondo tempo");
		pnlTwo.add(lblSecondoTempo);
		
		JPanel pnlThree = new JPanel();
		pnlThree.add(primoTempo);
		
		JPanel pnlFour = new JPanel();
		pnlFour.add(secondoTempo);
		
		
		JPanel pnlFive = new JPanel();
		this.ok = new JButton("Ok");
		ok.setMinimumSize(new Dimension(150,30));
		this.ok.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				JButton b = (JButton) arg0.getSource();
				if(b.getText().equals("Ok")){
						if(primoTempo.isSelected())
							sceltaPrimoTempo = true;
						else if(secondoTempo.isSelected())
							sceltaSecondoTempo = true;
					}
					
				
				
				dispose();
				
			}
		
		});
		
	
		pnlFive.add(ok);
		
		
		
		
		JPanel pnlSix = new JPanel();
		this.annulla = new JButton("Annulla");
		annulla.setMinimumSize(new Dimension(150,30));
		this.annulla.addActionListener(new ActionListener(){

	
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
			
		});
		
	
		pnlSix.add(this.annulla);
		
		
		this.add(pnlOne);
		this.add(pnlTwo);
		this.add(pnlThree);
		this.add(pnlFour);
		this.add(pnlFive);
		this.add(pnlSix);

		
		this.setVisible(true);
		
	}
	

	

}
