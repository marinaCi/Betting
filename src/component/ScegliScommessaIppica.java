package component;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author Marina Cirillo
 *
 */
public class ScegliScommessaIppica extends JDialog {
	
	private static final long serialVersionUID = 4L;
	
	public boolean sceltaVincente = false;
	public boolean sceltaPiazzato = false;
	
	private JButton ok;
	private JButton annulla;
	
	private JRadioButton vincente = new JRadioButton();
	private JRadioButton piazzato = new JRadioButton();
	private ButtonGroup bg = new ButtonGroup();
	
	{
	this.bg.add(vincente);
	this.bg.add(piazzato);
	}
	
	


	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	
	public ScegliScommessaIppica(JFrame root, String string) {
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
		JLabel lblVincente = new JLabel("Scommessa sul vincente");
		pnlOne.add(lblVincente);
		
		JPanel pnlTwo = new JPanel();
		JLabel lblPiazzato = new JLabel("Scommessa sul piazzato");
		pnlTwo.add(lblPiazzato);
		
		JPanel pnlThree = new JPanel();
		pnlThree.add(vincente);
		
		JPanel pnlFour = new JPanel();
		pnlFour.add(piazzato);
		
		
		JPanel pnlFive = new JPanel();
		this.ok = new JButton("Ok");
		ok.setMinimumSize(new Dimension(150,30));
		this.ok.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				JButton b = (JButton) arg0.getSource();
				if(b.getText().equals("Ok")){
						if(vincente.isSelected())
							sceltaVincente = true;
						else if(piazzato.isSelected())
							sceltaPiazzato = true;
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
