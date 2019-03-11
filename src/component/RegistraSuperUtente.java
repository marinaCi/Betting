package component;

import javax.swing.*;

import classi.*;
import classi.LayoutManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Marina Cirillo
 *
 */
public class RegistraSuperUtente extends JDialog{
	
	private static final long serialVersionUID = 3L;
	
	public SuperUtente superUtente;
	
	private JTextField txtCognome;
	private JTextField txtNome;
	private JTextField txtUsername;
	private JTextField txtPassword;
	
	private JButton btnOk;
	private JButton btnAnnulla;
	
	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */

	public RegistraSuperUtente(JFrame root, String string) {
		super(root,string,true);
		
		
		this.superUtente = null;
		
		this.Initialize();
	}
	
	/**
	 * Inizializzazione
	 */

	private void Initialize(){
		
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel lblCognome = new JLabel("Cognome: ");
		lblCognome.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(0, 0, 1, 1, new Insets(10,10,10,10));
		this.add(lblCognome,c);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 0, 1, 1);
		this.add(lblNome, c);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 0, 1, 1, new Insets(10,10,10,10));
		this.add(lblUsername, c);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(3, 0, 1, 1);
		this.add(lblPassword, c);
		
		this.txtCognome = new JTextField(10);
		txtCognome.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(0, 1, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtCognome, c);
		
		this.txtNome = new JTextField(10);
		txtNome.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 1, 1, 1);
		this.add(this.txtNome, c);
		
		this.txtUsername= new JTextField(10);
		txtUsername.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 1, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtUsername, c);
		
		this.txtPassword = new JTextField(10);
		txtPassword.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(3, 1, 1, 1);
		this.add(this.txtPassword, c);
		
		this.btnOk = new JButton("Ok");
		btnOk.setMinimumSize(new Dimension(150,30));
		this.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				superUtente = new SuperUtente (txtCognome.getText(), txtNome.getText(), txtUsername.getText(), txtPassword.getText());
				
				dispose();
			}
			
		});
		c = LayoutManager.constraints(4, 0, 1, 1, new Insets(10,10,10,10));
		this.add(this.btnOk, c);
		
		this.btnAnnulla = new JButton("Annulla");
		btnAnnulla.setMinimumSize(new Dimension(150,30));
		this.btnAnnulla.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
			
		});
		c = LayoutManager.constraints(4, 1, 1, 1);
		this.add(this.btnAnnulla, c);
		
		
		this.setTitle("Registrazione super utente");
		this.setResizable(false);
		this.setBounds(140, 180, 270, 220);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		this.setVisible(true);
	}
	
}