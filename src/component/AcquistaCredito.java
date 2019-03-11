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

public class AcquistaCredito extends JDialog {
	
	private static final long serialVersionUID = 1L;

	private JTextField txtCredito;
	private JButton btnOk;
	
	public double credito;
	
	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	
	public AcquistaCredito(JFrame parent, String title){
		super(parent, title, true);
		this.Initialize();
	}
	
	/**
	 * Inizializzazione
	 */
	
	
	private void Initialize(){
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		this.setSize(300, 130);
		int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
		int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		
		
		this.setLayout(new GridLayout(3,1));
		
		
		JPanel pnlOne = new JPanel();
		JLabel lblCredito = new JLabel("Credito da acquistare");
		this.txtCredito = new JTextField(10);
		pnlOne.add(lblCredito);
		pnlOne.add(this.txtCredito);
		
		
		JPanel pnlThree = new JPanel();
		this.btnOk = new JButton("Ok");
		this.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				credito = Double.parseDouble(txtCredito.getText());
				dispose();
			}
			
		});
		pnlThree.add(this.btnOk);
		
		
		this.add(pnlOne);
		this.add(pnlThree);
		
		
		this.setVisible(true);
	}
}



