package component;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


import java.awt.*;
import classi.LayoutManager;
import eccezioni.ErroreInput;

/**
 * @author Marina Cirillo
 *
 */
public class NuovaCorsa extends JDialog {

	
	private static final long serialVersionUID = 3L;

	private JTextField txtNomeEvento;
	private JTextField txtDataEvento;
	private JButton btnOk;
	private JButton btnAnnulla;
	
	private JTextField txtCavallo1;
	private JTextField txtCavallo2;
	private JTextField txtCavallo3;
	private JTextField txtCavallo4;
	private JTextField txtCavallo5;
	private JTextField txtQuota1;
	private JTextField txtQuota2;
	private JTextField txtQuota3;
	private JTextField txtQuota4;
	private JTextField txtQuota5;
	private JTextField txtQuota1p;
	private JTextField txtQuota2p;
	private JTextField txtQuota3p;
	private JTextField txtQuota4p;
	private JTextField txtQuota5p;
	
	
	
	public String nome;
	public String data;
	public String cavallo1;
	public String cavallo2;
	public String cavallo3;
	public String cavallo4;
	public String cavallo5;
	public double quota1;
	public double quota2;
	public double quota3;
	public double quota4;
	public double quota5;
	public double quota1p;
	public double quota2p;
	public double quota3p;
	public double quota4p;
	public double quota5p;
	
	
	/**
	 * 
	 * @param parent = root
	 * @param title = titolo della finestra
	 */
	
	public NuovaCorsa(JFrame parent, String title){
		super(parent, title, true);
		this.Initialize();
	}
	
	/**
	 * Inizializzazione
	 */
	
	private void Initialize(){
	
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		
		
		JLabel lblNomeEvento = new JLabel("Nome evento");
		lblNomeEvento.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(0, 0, 1, 1, new Insets(10,10,10,10));
		this.add(lblNomeEvento, c);


		this.txtNomeEvento = new JTextField(10);
		txtNomeEvento.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(0, 1, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtNomeEvento, c);
		
		JLabel lblData = new JLabel("Data Evento");
		lblData.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(0, 2, 1, 1, new Insets(10,10,10,10));
		this.add(lblData, c);

		this.txtDataEvento = new JTextField(10);
		txtDataEvento.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(0, 3, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtDataEvento, c);
		
		
		JLabel lblCavallo1 = new JLabel("Cavallo 1");
		lblCavallo1.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 0, 1, 1);
		this.add(lblCavallo1, c);

		this.txtCavallo1 = new JTextField(10);
		txtCavallo1.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 1, 1, 1);
		this.add(this.txtCavallo1, c);
		
		
		JLabel lblQuota1 = new JLabel("Quota vincente 1");
		lblQuota1.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 2, 1, 1);
		this.add(lblQuota1, c);

		this.txtQuota1 = new JTextField(10);
		txtQuota1.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 3, 1, 1);
		this.add(this.txtQuota1, c);
		
		
		JLabel lblQuota1p = new JLabel("Quota piazzato 1");
		lblQuota1p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 4, 1, 1, new Insets(10,10,10,10));
		this.add(lblQuota1p, c);

		this.txtQuota1p = new JTextField(10);
		txtQuota1p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(1, 5, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtQuota1p, c);
	
		
		JLabel lblCavallo2 = new JLabel("Cavallo 2");
		lblCavallo2.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 0, 1, 1, new Insets(10,10,10,10));
		this.add(lblCavallo2, c);

		this.txtCavallo2 = new JTextField(10);
		txtCavallo2.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 1, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtCavallo2, c);
		
		
		JLabel lblQuota2 = new JLabel("Quota vincente 2");
		lblQuota2.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 2, 1, 1, new Insets(10,10,10,10));
		this.add(lblQuota2, c);

		this.txtQuota2 = new JTextField(10);
		txtQuota2.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 3, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtQuota2, c);
		
		
		JLabel lblQuota2p = new JLabel("Quota piazzato 2");
		lblQuota2p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 4, 1, 1);
		this.add(lblQuota2p, c);

		this.txtQuota2p = new JTextField(10);
		txtQuota2p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(2, 5, 1, 1);
		this.add(this.txtQuota2p, c);
		
		
		JLabel lblCavallo3 = new JLabel("Cavallo 3");
		lblCavallo3.setMinimumSize(new Dimension(100,30));	
		c = LayoutManager.constraints(3, 0, 1, 1);
		this.add(lblCavallo3, c);	

		this.txtCavallo3 = new JTextField(10);
		txtCavallo3.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(3, 1, 1, 1);
		this.add(this.txtCavallo3, c);
		
		
		JLabel lblQuota3 = new JLabel("Quota vincente 3");
		lblQuota3.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(3, 2, 1, 1);
		this.add(lblQuota3, c);

		this.txtQuota3 = new JTextField(10);
		txtQuota3.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(3, 3, 1, 1);
		this.add(this.txtQuota3, c);
		
		
		JLabel lblQuota3p = new JLabel("Quota piazzato 3");
		lblQuota3p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(3, 4, 1, 1, new Insets(10,10,10,10));
		this.add(lblQuota3p, c);

		this.txtQuota3p = new JTextField(10);
		txtQuota3p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(3, 5, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtQuota3p, c);
		
		
		JLabel lblCavallo4 = new JLabel("Cavallo 4");
		lblCavallo4.setMinimumSize(new Dimension(100,30));	
		c = LayoutManager.constraints(4, 0, 1, 1, new Insets(10,10,10,10));	
		this.add(lblCavallo4, c);

		this.txtCavallo4 = new JTextField(10);
		txtCavallo4.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(4, 1, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtCavallo4, c);
		
		
		JLabel lblQuota4 = new JLabel("Quota vincente 4");
		lblQuota4.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(4, 2, 1, 1, new Insets(10,10,10,10));
		this.add(lblQuota4, c);

		this.txtQuota4 = new JTextField(10);
		txtQuota4.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(4, 3, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtQuota4, c);
		
		
		JLabel lblQuota4p = new JLabel("Quota piazzato 4");
		lblQuota4p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(4, 4, 1, 1);
		this.add(lblQuota4p, c);

		this.txtQuota4p = new JTextField(10);
		txtQuota4p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(4, 5, 1, 1);
		this.add(this.txtQuota4p, c);
		
		JLabel lblCavallo5 = new JLabel("Cavallo 5");
		lblCavallo5.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(5, 0, 1, 1);	
		this.add(lblCavallo5, c);	

		this.txtCavallo5 = new JTextField(10);
		txtCavallo5.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(5, 1, 1, 1);
		this.add(this.txtCavallo5, c);
		
		
		JLabel lblQuota5 = new JLabel("Quota vincente 5");
		lblQuota5.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(5, 2, 1, 1);
		this.add(lblQuota5, c);

		this.txtQuota5 = new JTextField(10);
		txtQuota5.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(5, 3, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtQuota5, c);
		
		
		JLabel lblQuota5p = new JLabel("Quota piazzato 5");
		lblQuota5p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(5, 4, 1, 1, new Insets(10,10,10,10));
		this.add(lblQuota5p, c);

		this.txtQuota5p = new JTextField(10);
		txtQuota5p.setMinimumSize(new Dimension(100,30));
		c = LayoutManager.constraints(5, 5, 1, 1, new Insets(10,10,10,10));
		this.add(this.txtQuota5p, c);
		
		
		
		this.btnOk = new JButton("Ok");
		btnOk.setMinimumSize(new Dimension(150,30));
		this.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try{
				nome = txtNomeEvento.getText();
				data = txtDataEvento.getText();
				  cavallo1 = txtCavallo1.getText();
				  cavallo2 = txtCavallo2.getText();
				  cavallo3 = txtCavallo3.getText();
				  cavallo4 = txtCavallo4.getText();
				  cavallo5 = txtCavallo5.getText();
				  quota1 = Double.parseDouble(txtQuota1.getText());
				  quota2 = Double.parseDouble(txtQuota2.getText());
				  quota3 = Double.parseDouble(txtQuota3.getText());
				  quota4 = Double.parseDouble(txtQuota4.getText());
				  quota5 = Double.parseDouble(txtQuota5.getText());
				  quota1p = Double.parseDouble(txtQuota1p.getText());
				  quota2p = Double.parseDouble(txtQuota2p.getText());
				  quota3p = Double.parseDouble(txtQuota3p.getText());
				  quota4p = Double.parseDouble(txtQuota4p.getText());
				  quota5p = Double.parseDouble(txtQuota5p.getText());
				dispose();
				}
				
				catch(NumberFormatException e){
					ErroreInput i;
					i = new ErroreInput(null, getTitle());
					
				}
			}
			
		});
		c = LayoutManager.constraints(6, 1, 1, 1, new Insets(10,10,10,10));
		this.add(this.btnOk, c);
		
		this.btnAnnulla = new JButton("Annulla");
		btnAnnulla.setMinimumSize(new Dimension(150,30));
		this.btnAnnulla.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
			
		});
		c = LayoutManager.constraints(6, 4, 1, 1);
		this.add(this.btnAnnulla, c);
	
		
		

		this.setTitle("Nuova corsa");
		this.setResizable(false);
		this.setBounds(140, 180, 750, 400);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Rendo visibile
		this.setVisible(true);
		
		
	}
}
