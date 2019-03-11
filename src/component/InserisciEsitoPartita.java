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
public class InserisciEsitoPartita extends JDialog{


		private static final long serialVersionUID = 6L;

		private JTextField txtPrimoTempo;
		private JTextField txtSecondoTempo;
		private JButton btnOk;
		
		public String primoTempo;
		public String secondoTempo;
		
		/**
		 * 
		 * @param parent = root
		 * @param title = titolo della finestra
		 */
		
		public InserisciEsitoPartita(JFrame parent, String title){
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
			JLabel lblPrimoTempo = new JLabel("Primo tempo");
			this.txtPrimoTempo = new JTextField(10);
			pnlOne.add(lblPrimoTempo);
			pnlOne.add(this.txtPrimoTempo);
			
			
			JPanel pnlTwo = new JPanel();
			JLabel lblSecondoTempo = new JLabel("Secondo tempo");
			this.txtSecondoTempo = new JTextField(10);
			pnlTwo.add(lblSecondoTempo);
			pnlTwo.add(this.txtSecondoTempo);
			
			
			JPanel pnlThree = new JPanel();
			this.btnOk = new JButton("Ok");
			this.btnOk.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					primoTempo = txtPrimoTempo.getText();
					secondoTempo = txtSecondoTempo.getText();
					dispose();
				}
				
			});
			pnlThree.add(this.btnOk);
			
		
			this.add(pnlOne);
			this.add(pnlTwo);
			this.add(pnlThree);
			
			
			this.setVisible(true);
		}
	}

