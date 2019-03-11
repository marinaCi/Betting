package component;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Marina Cirillo
 *
 */
public class InserisciEsitoCorsa extends JDialog{


	private static final long serialVersionUID = 6L;

	private JTextField txtPrimo;
	private JTextField txtSecondo;
	private JTextField txtTerzo;
	private JButton btnOk;
	
	public String primo;
	public String secondo;
	public String terzo;
	
	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	
	public InserisciEsitoCorsa(JFrame parent, String title){
		super(parent, title, true);
		this.Initialize();
	}
	
	/**
	 * Inizializzazione
	 */
	
	private void Initialize(){
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		this.setSize(300, 350);
		int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
		int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		
	
		this.setLayout(new GridLayout(3,1));
		
		
		JPanel pnlOne = new JPanel();
		JLabel lblPrimo = new JLabel("Primo");
		this.txtPrimo = new JTextField(10);
		pnlOne.add(lblPrimo);
		pnlOne.add(this.txtPrimo);
		
		
		JPanel pnlTwo = new JPanel();
		JLabel lblSecondo = new JLabel("Secondo");
		this.txtSecondo = new JTextField(10);
		pnlTwo.add(lblSecondo);
		pnlTwo.add(this.txtSecondo);
		
		JPanel pnlFour = new JPanel();
		JLabel lblTerzo = new JLabel("Terzo");
		this.txtTerzo = new JTextField(10);
		pnlTwo.add(lblTerzo);
		pnlTwo.add(this.txtTerzo);
		
		
		JPanel pnlThree = new JPanel();
		this.btnOk = new JButton("Ok");
		this.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				primo = txtPrimo.getText();
				secondo= txtSecondo.getText();
				terzo= txtTerzo.getText();
				dispose();
			}
			
		});
		pnlThree.add(this.btnOk);
		
	
		this.add(pnlOne);
		this.add(pnlTwo);
		this.add(pnlFour);
		this.add(pnlThree);
		
		
		this.setVisible(true);
	}


}


