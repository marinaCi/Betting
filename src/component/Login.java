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

public class Login extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtUsername;
	private JTextField txtPassword;
	private JButton btnOk;
	
	public String username;
	public String password;
	
	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	
	public Login(JFrame parent, String title){
		super(parent, title, true);
		this.Initialize();
	}
	
	/**
	 * Inizlializzazione
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
		JLabel lblUsername = new JLabel("Username:");
		this.txtUsername = new JTextField(10);
		pnlOne.add(lblUsername);
		pnlOne.add(this.txtUsername);
		
		
		JPanel pnlTwo = new JPanel();
		JLabel lblPassword = new JLabel("Password:");
		this.txtPassword = new JTextField(10);
		pnlTwo.add(lblPassword);
		pnlTwo.add(this.txtPassword);
		
		
		JPanel pnlThree = new JPanel();
		this.btnOk = new JButton("Login");
		this.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				username = txtUsername.getText();
				password = txtPassword.getText();
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
