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

import eccezioni.ErroreInput;

/**
 * @author Marina Cirillo
 *
 */
public class NuovaPartita extends JDialog {


	private static final long serialVersionUID = 3L;

	private JTextField txtNomeEvento;
	private JTextField txtDataEvento;
	
	private JTextField txtUno;
	private JTextField txtX;
	private JTextField txtDue;
	
	private JTextField txtZeroZero;
	private JTextField txtZeroUno;
	private JTextField txtZeroDue;
	private JTextField txtUnoZero;
	private JTextField txtDueZero;
	private JTextField txtUnoUno;
	private JTextField txtUnoDueP;
	private JTextField txtDueUno;
	private JTextField txtDueDue;
	
	private JTextField txtUnoX;
	private JTextField txtUnoDueS;
	private JTextField txtXDue;
	
	
	private JButton btnOk;
	
	public String nome;
	public String data;
	
	public double uno;
	public double quotaX;
	public double due;
		
	public double zeroZero;
	public double zeroUno;
	public double zeroDue;
	public double unoZero;
	public double dueZero;
	public double unoUno;
	public double unoDueP;
	public double dueUno;
	public double dueDue;
		
	public double unoX;
	public double unoDueS;
	public double xDue;
	
	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	
	public NuovaPartita(JFrame parent, String title){
		super(parent, title, true);
		this.Initialize();
	}
	
	/**
	 * Inizializzazione
	 */
	
	private void Initialize(){
	
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	
		this.setSize(600, 600);
		int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
		int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		
		
		this.setLayout(new GridLayout(12,2));
		
		
		JPanel pnlOne = new JPanel();
		JLabel lblUsername = new JLabel("Nome evento");
		this.txtNomeEvento = new JTextField(10);
		pnlOne.add(lblUsername);
		pnlOne.add(this.txtNomeEvento);
		
		
		JPanel pnlTwo = new JPanel();
		JLabel lblDataEvento = new JLabel("Data Evento");
		this.txtDataEvento = new JTextField(10);
		pnlTwo.add(lblDataEvento);
		pnlTwo.add(this.txtDataEvento);
		
		JPanel pnlThree = new JPanel();
		JLabel lbl1x2 = new JLabel("Quote 1x2");
		pnlThree.add(lbl1x2);
		
		JPanel pnlFour = new JPanel();
		JLabel lblUno = new JLabel("1");
		this.txtUno = new JTextField(5);
		pnlFour.add(lblUno);
		pnlFour.add(this.txtUno);
		
		JPanel pnlFive = new JPanel();
		JLabel lblX = new JLabel("X");
		this.txtX = new JTextField(5);
		pnlFive.add(lblX);
		pnlFive.add(this.txtX);
		
		JPanel pnlSix = new JPanel();
		JLabel lblDue = new JLabel("2");
		this.txtDue = new JTextField(5);
		pnlSix.add(lblDue);
		pnlSix.add(this.txtDue);
		
		
		JPanel pnlSeven = new JPanel();
		JLabel lblPunteggioEsatto = new JLabel("Quote punteggio esatto");
		pnlSeven.add(lblPunteggioEsatto);
		
		JPanel pnlEight = new JPanel();
		JLabel lblZeroZero = new JLabel("0-0");
		this.txtZeroZero = new JTextField(5);
		pnlEight.add(lblZeroZero);
		pnlEight.add(txtZeroZero);
		
		JPanel pnlNine = new JPanel();
		JLabel lblZeroUno = new JLabel("0-1");
		this.txtZeroUno = new JTextField(5);
		pnlNine.add(lblZeroUno);
		pnlNine.add(txtZeroUno);
		
		JPanel pnlTen = new JPanel();
		JLabel lblZeroDue = new JLabel("0-2");
		this.txtZeroDue = new JTextField(5);
		pnlTen.add(lblZeroDue);
		pnlTen.add(txtZeroDue);
		
		JPanel pnlEleven = new JPanel();
		JLabel lblUnoZero = new JLabel("1-0");
		this.txtUnoZero = new JTextField(5);
		pnlEleven.add(lblUnoZero);
		pnlEleven.add(txtUnoZero);
		
		JPanel pnlTwelve = new JPanel();
		JLabel lblDueZero = new JLabel("2-0");
		this.txtDueZero = new JTextField(5);
		pnlTwelve.add(lblDueZero);
		pnlTwelve.add(txtDueZero);
		
		JPanel pnlThirteen = new JPanel();
		JLabel lblUnoUno = new JLabel("1-1");
		this.txtUnoUno = new JTextField(5);
		pnlThirteen.add(lblUnoUno);
		pnlThirteen.add(txtUnoUno);
		
		JPanel pnlFourteen = new JPanel();
		JLabel lblUnoDueP = new JLabel("1-2");
		this.txtUnoDueP = new JTextField(5);
		pnlFourteen.add(lblUnoDueP);
		pnlFourteen.add(txtUnoDueP);
		
		JPanel pnlFifteen = new JPanel();
		JLabel lblDueUno = new JLabel("2-1");
		this.txtDueUno = new JTextField(5);
		pnlFifteen.add(lblDueUno);
		pnlFifteen.add(txtDueUno);
		
		JPanel pnlSixteen = new JPanel();
		JLabel lblDueDue = new JLabel("2-2");
		this.txtDueDue = new JTextField(5);
		pnlSixteen.add(lblDueDue);
		pnlSixteen.add(txtDueDue);
		
		
		JPanel pnlEighteen = new JPanel();
		JLabel lblScommessaMultipla = new JLabel("Quote scommessa multipla");
		pnlEighteen.add(lblScommessaMultipla);
		
		
		JPanel pnlNineteen = new JPanel();
		JLabel lblUnoX = new JLabel("1-X");
		this.txtUnoX = new JTextField(5);
		pnlNineteen.add(lblUnoX);
		pnlNineteen.add(txtUnoX);
		
		JPanel pnlTwenty = new JPanel();
		JLabel lblUnoDueS = new JLabel("1-2");
		this.txtUnoDueS = new JTextField(5);
		pnlTwenty.add(lblUnoDueS);
		pnlTwenty.add(txtUnoDueS);
		
		JPanel pnlTwentyOne = new JPanel();
		JLabel lblXDue = new JLabel("2-X");
		this.txtXDue = new JTextField(5);
		pnlTwentyOne.add(lblXDue);
		pnlTwentyOne.add(txtXDue);
		
		JPanel pnlTwentyTwo = new JPanel();
		this.btnOk = new JButton("Ok");
		this.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try{
				nome = txtNomeEvento.getText();
				data = txtDataEvento.getText();
				 
				uno = Double.parseDouble(txtUno.getText());
				 quotaX = Double.parseDouble(txtX.getText());
				 due = Double.parseDouble(txtDue.getText());
					
				 zeroZero = Double.parseDouble(txtZeroZero.getText());
				 zeroUno = Double.parseDouble(txtZeroUno.getText());
				 zeroDue = Double.parseDouble(txtZeroDue.getText());
				 unoZero = Double.parseDouble(txtUnoZero.getText());
				 dueZero = Double.parseDouble(txtDueZero.getText());
				 unoUno = Double.parseDouble(txtUnoUno.getText());
				 unoDueP = Double.parseDouble(txtUnoDueP.getText());
				 dueUno = Double.parseDouble(txtDueUno.getText());
				 dueDue = Double.parseDouble(txtDueDue.getText());
					
				 unoX = Double.parseDouble(txtUnoX.getText());
				 unoDueS = Double.parseDouble(txtUnoDueS.getText());
				 xDue = Double.parseDouble(txtXDue.getText());
				dispose();
			}
				
				catch(NumberFormatException e){
					ErroreInput i;
					i = new ErroreInput(null, getTitle());
					
				}
			}
			
		});
		pnlTwentyTwo.add(this.btnOk);
		
		
		this.add(pnlOne);
		this.add(pnlTwo);
		this.add(pnlThree);
		this.add(pnlFour);
		this.add(pnlFive);
		this.add(pnlSix);
		this.add(pnlSeven);
		this.add(pnlEight);
		this.add(pnlNine);
		this.add(pnlTen);
		this.add(pnlEleven);
		this.add(pnlTwelve);
		this.add(pnlThirteen);
		this.add(pnlFourteen);
		this.add(pnlFifteen);
		this.add(pnlSixteen);
		this.add(pnlEighteen);
		this.add(pnlNineteen);
		this.add(pnlTwenty);
		this.add(pnlTwentyOne);
		this.add(pnlTwentyTwo);
		
		
		this.setVisible(true);
	}
}
