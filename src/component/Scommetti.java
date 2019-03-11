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
public class Scommetti extends JDialog {

	private static final long serialVersionUID = 1L;

	private JTextField txtNomeEvento;
	private JTextField txtRisultato;
	private JTextField txtImporto;
	private JButton btnOk;
	
	public String nome;
	public String risultato;
	public double importo;
	
	
	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	public Scommetti(JFrame parent, String title){
		super(parent, title, true);
		this.Initialize();
	}
	
	private void Initialize(){
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		this.setSize(300, 600);
		int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
		int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		
		
		this.setLayout(new GridLayout(3,1));
		
		
		JPanel pnlOne = new JPanel();
		JLabel lblNomeEvento = new JLabel("Nome evento");
		this.txtNomeEvento = new JTextField(10);
		pnlOne.add(lblNomeEvento);
		pnlOne.add(this.txtNomeEvento);
		
		
		JPanel pnlTwo = new JPanel();
		JLabel lblRisultato = new JLabel("Risultato");
		this.txtRisultato = new JTextField(10);
		pnlTwo.add(lblRisultato);
		pnlTwo.add(this.txtRisultato);
		
		
		JPanel pnlThree = new JPanel();
		JLabel lblImporto = new JLabel("Importo");
		this.txtImporto = new JTextField(10);
		pnlTwo.add(lblImporto);
		pnlTwo.add(this.txtImporto);
		
		
		JPanel pnlFour = new JPanel();
		this.btnOk = new JButton("Ok");
		this.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				nome = txtNomeEvento.getText();
				importo = Double.parseDouble(txtImporto.getText());
				risultato = txtRisultato.getText();
				dispose();
			}
			
		});
		pnlFour.add(this.btnOk);
		
		
		this.add(pnlOne);
		this.add(pnlTwo);
		this.add(pnlThree);
		this.add(pnlFour);
		
		
		this.setVisible(true);
	}
}


