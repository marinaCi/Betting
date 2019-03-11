package gui;

import javax.swing.*;

import component.*;
import classi.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Marina Cirillo
 *
 */
public class ScommesseGUI extends JFrame{

	private static final long serialVersionUID = 2L;

	public Archivio betSystem;

	private JButton bLogin;
	private JButton bRSuperUtente;
	private JButton bUtente;

	private JMenuItem mInserisciEventiQuote;
	private JMenuItem mInserisciEsiti;
	private JMenuItem mVisualizzaEventi;
	private JMenuItem mAcquistaCredito;
	private JMenuItem mSfogliaEventi;
	private JMenuItem mScommetti;
	private JMenuItem mVisualizzaScommesse;
	private JMenuItem mEsci;

	private JMenu submSuperUtente;
	private JMenu submUtente;

	private TextArea txtArea;





	public ScommesseGUI(){

		betSystem = new Archivio();

		inizializza();
	}
	
	/**
	 * Inizializzazione
	 */

	public void inizializza(){

		this.creaMenu();
		JPanel pSinistro = creaLatoSinistro();
		setTitle("Scommesse");
		setBounds(100, 100, 237, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(pSinistro);
		setVisible(true);

	}
	
	/**
	 * Creazione del menù
	 */

	public void creaMenu(){

		JMenuBar menuBar = new JMenuBar();

		submSuperUtente = new JMenu("Menù super utente");
		submSuperUtente.setEnabled(false);
		submUtente = new JMenu("Menù utente");
		submUtente.setEnabled(false);
		JMenu mnuFile = new JMenu("File");
		menuBar.add(mnuFile);


		this.mInserisciEventiQuote = new JMenuItem("Inserisci eventi e quote");
		this.mInserisciEventiQuote.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JMenuItem btn = (JMenuItem) arg0.getSource();
				SceltaEvento inserisci = new SceltaEvento((JFrame) SwingUtilities.getRoot(btn), "Inserisci eventi e quote");
				if(inserisci.sceltaCalcio){
					JMenuItem bp = (JMenuItem) arg0.getSource();
					NuovaPartita nPartita = new NuovaPartita((JFrame) SwingUtilities.getRoot(bp), "Nuova Partita");
					QuotePartita nQuote = new QuotePartita(nPartita.nome, nPartita.data, "non inserito", "non inserito", nPartita.quotaX, nPartita.uno, nPartita.due, nPartita.zeroZero, nPartita.zeroUno, nPartita.zeroDue, nPartita.unoZero, nPartita.dueZero, nPartita.unoUno, nPartita.unoDueP, nPartita.dueUno, nPartita.dueDue, nPartita.unoX, nPartita.unoDueS, nPartita.xDue);
					betSystem.arrPartita.add(nQuote);

				}
				if(inserisci.sceltaIppica){
					JMenuItem bc = (JMenuItem) arg0.getSource();
					NuovaCorsa cQuote = new NuovaCorsa((JFrame) SwingUtilities.getRoot(bc), "Nuova Corsa");
					QuoteCorsa nCorsa = new QuoteCorsa(cQuote.nome, cQuote.data, cQuote.cavallo1, cQuote.cavallo2, cQuote.cavallo3, cQuote.cavallo4, cQuote.cavallo5, "non inserito", "non inserito", "non inserito", cQuote.quota1, cQuote.quota2, cQuote.quota3, cQuote.quota4, cQuote.quota5, cQuote.quota1p, cQuote.quota2p, cQuote.quota3p, cQuote.quota4p, cQuote.quota5p);
					betSystem.arrIppica.add(nCorsa);
				}
			}
		});


		this.mInserisciEsiti = new JMenuItem("Inserisci esiti");
		this.mInserisciEsiti.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JMenuItem btn = (JMenuItem) arg0.getSource();
				SceltaEvento esiti = new SceltaEvento((JFrame) SwingUtilities.getRoot(btn), "Inserisci esiti");
				if(esiti.sceltaCalcio){
					SceltaPartita nomePartita = new SceltaPartita((JFrame) SwingUtilities.getRoot(btn), "Scegli partita");
					InserisciEsitoPartita esito = new InserisciEsitoPartita((JFrame) SwingUtilities.getRoot(btn), "Inserisci esito");
					for(QuotePartita pT : betSystem.arrPartita){
						if(pT.getNome().equals(nomePartita.nome)){
							pT.setPrimoTempo(esito.primoTempo);
							pT.setSecondoTempo(esito.secondoTempo);
						}
						for(Utente ut : betSystem.arrUtente){
							for(ScommessaCalcio sc : betSystem.scommesseCalcio){
								if(ut.getUsername().equals(sc.getUserUtente())){

									if((pT.getPrimoTempo().equals("0-0")||pT.getPrimoTempo().equals("1-1")||pT.getPrimoTempo().equals("2-2"))&&sc.getRisultatoPT().equals("X")){
										sc.setVincita(sc.getImporto()*pT.getX());
										ut.versaCredito(sc.getImporto()*pT.getX());
									}

									if((pT.getPrimoTempo().equals("1-0")||pT.getPrimoTempo().equals("2-1")||pT.getPrimoTempo().equals("2-0"))&&sc.getRisultatoPT().equals("1"))
										sc.setVincita(sc.getImporto()*pT.getUno());
									ut.versaCredito(sc.getImporto()*pT.getUno());
								}

								if((pT.getPrimoTempo().equals("0-1")||pT.getPrimoTempo().equals("1-2")||pT.getPrimoTempo().equals("2-2"))&&sc.getRisultatoPT().equals("2")){
									sc.setVincita(sc.getImporto()*pT.getDue());
									ut.versaCredito(sc.getImporto()*pT.getDue());
								}

								if((pT.getPrimoTempo().equals("0-0")||pT.getPrimoTempo().equals("1-1")||pT.getPrimoTempo().equals("2-2")||pT.getPrimoTempo().equals("1-0")||pT.getPrimoTempo().equals("2-1")||pT.getPrimoTempo().equals("2-0"))&&sc.getRisultatoPT().equals("1-X")){
									sc.setVincita(sc.getImporto()*pT.getUnoX());
									ut.versaCredito(sc.getImporto()*pT.getUnoX());
								}

								if((pT.getPrimoTempo().equals("0-0")||pT.getPrimoTempo().equals("1-1")||pT.getPrimoTempo().equals("2-2")||pT.getPrimoTempo().equals("0-1")||pT.getPrimoTempo().equals("0-2")||pT.getPrimoTempo().equals("1-2"))&&sc.getRisultatoPT().equals("X-2")){
									sc.setVincita(sc.getImporto()*pT.getDueX());
									ut.versaCredito(sc.getImporto()*pT.getDueX());
								}	

								if((pT.getPrimoTempo().equals("1-0")||pT.getPrimoTempo().equals("2-1")||pT.getPrimoTempo().equals("2-0")||pT.getPrimoTempo().equals("0-1")||pT.getPrimoTempo().equals("0-2")||pT.getPrimoTempo().equals("1-2"))&&sc.getRisultatoPT().equals("1-2")){
									sc.setVincita(sc.getImporto()*pT.getUnoDueS());
									ut.versaCredito(sc.getImporto()*pT.getUnoDueS());
								}

								if((pT.getSecondoTempo().equals("0-0")||pT.getSecondoTempo().equals("1-1")||pT.getSecondoTempo().equals("2-2"))&&sc.getRisultatoST().equals("X")){
									sc.setVincita(sc.getImporto()*pT.getX());
									ut.versaCredito(sc.getImporto()*pT.getX());
								}

								if((pT.getSecondoTempo().equals("1-0")||pT.getSecondoTempo().equals("2-1")||pT.getSecondoTempo().equals("2-0"))&&sc.getRisultatoST().equals("1")){
									sc.setVincita(sc.getImporto()*pT.getUno());
									ut.versaCredito(sc.getImporto()*pT.getUno());
								}

								if((pT.getSecondoTempo().equals("0-1")||pT.getSecondoTempo().equals("1-2")||pT.getSecondoTempo().equals("2-2"))&&sc.getRisultatoST().equals("2")){
									sc.setVincita(sc.getImporto()*pT.getDue());
									ut.versaCredito(sc.getImporto()*pT.getDue());
								}

								if((pT.getSecondoTempo().equals("0-0")||pT.getSecondoTempo().equals("1-1")||pT.getSecondoTempo().equals("2-2")||pT.getSecondoTempo().equals("1-0")||pT.getSecondoTempo().equals("2-1")||pT.getSecondoTempo().equals("2-0"))&&sc.getRisultatoPT().equals("1-X")){
									sc.setVincita(sc.getImporto()*pT.getUnoX());
									ut.versaCredito(sc.getImporto()*pT.getUnoX());
								}

								if((pT.getSecondoTempo().equals("0-0")||pT.getSecondoTempo().equals("1-1")||pT.getSecondoTempo().equals("2-2")||pT.getSecondoTempo().equals("0-1")||pT.getSecondoTempo().equals("0-2")||pT.getSecondoTempo().equals("1-2"))&&sc.getRisultatoPT().equals("X-2")){
									sc.setVincita(sc.getImporto()*pT.getDueX());
									ut.versaCredito(sc.getImporto()*pT.getDueX());
								}

								if((pT.getSecondoTempo().equals("1-0")||pT.getSecondoTempo().equals("2-1")||pT.getSecondoTempo().equals("2-0")||pT.getSecondoTempo().equals("0-1")||pT.getSecondoTempo().equals("0-2")||pT.getSecondoTempo().equals("1-2"))&&sc.getRisultatoPT().equals("1-2")){
									sc.setVincita(sc.getImporto()*pT.getUnoDueS());
									ut.versaCredito(sc.getImporto()*pT.getUnoDueS());
								}


								if(pT.getPrimoTempo().equals(sc.getRisultatoPT())){
									if(sc.getRisultatoPT().equals("0-0")){
										sc.setVincita(sc.getImporto()*pT.getZeroZero());
										ut.versaCredito(sc.getImporto()*pT.getZeroZero());
									}
									if(sc.getRisultatoPT().equals("0-1")){
										sc.setVincita(sc.getImporto()*pT.getZeroUno());
										ut.versaCredito(sc.getImporto()*pT.getZeroUno());
									}
									if(sc.getRisultatoPT().equals("0-2")){
										sc.setVincita(sc.getImporto()*pT.getZeroDue());
										ut.versaCredito(sc.getImporto()*pT.getZeroDue());
									}
									if(sc.getRisultatoPT().equals("1-0")){
										sc.setVincita(sc.getImporto()*pT.getUnoZero());
										ut.versaCredito(sc.getImporto()*pT.getUnoZero());
									}
									if(sc.getRisultatoPT().equals("2-0")){
										sc.setVincita(sc.getImporto()*pT.getDueZero());
										ut.versaCredito(sc.getImporto()*pT.getDueZero());
									}
									if(sc.getRisultatoPT().equals("1-1")){
										sc.setVincita(sc.getImporto()*pT.getUnoUno());
										ut.versaCredito(sc.getImporto()*pT.getUnoUno());
									}
									if(sc.getRisultatoPT().equals("1-2")){
										sc.setVincita(sc.getImporto()*pT.getUnoDueP());
										ut.versaCredito(sc.getImporto()*pT.getUnoDueP());
									}
									if(sc.getRisultatoPT().equals("2-0")){
										sc.setVincita(sc.getImporto()*pT.getDueZero());
										ut.versaCredito(sc.getImporto()*pT.getDueZero());
									}
									if(sc.getRisultatoPT().equals("2-1")){
										sc.setVincita(sc.getImporto()*pT.getDueUno());
										ut.versaCredito(sc.getImporto()*pT.getDueUno());
									}
									if(sc.getRisultatoPT().equals("2-2")){
										sc.setVincita(sc.getImporto()*pT.getDueDue());
										ut.versaCredito(sc.getImporto()*pT.getDueDue());
									}


									if(pT.getSecondoTempo().equals(sc.getRisultatoST())){
										if(sc.getRisultatoST().equals("0-0")){
											sc.setVincita(sc.getImporto()*pT.getZeroZero());
											ut.versaCredito(sc.getImporto()*pT.getZeroZero());
										}
										if(sc.getRisultatoST().equals("0-1")){
											sc.setVincita(sc.getImporto()*pT.getZeroUno());
											ut.versaCredito(sc.getImporto()*pT.getZeroUno());
										}
										if(sc.getRisultatoST().equals("0-2")){
											sc.setVincita(sc.getImporto()*pT.getZeroDue());
											ut.versaCredito(sc.getImporto()*pT.getZeroDue());
										}
										if(sc.getRisultatoST().equals("1-0")){
											sc.setVincita(sc.getImporto()*pT.getUnoZero());
											ut.versaCredito(sc.getImporto()*pT.getUnoZero());
										}
										if(sc.getRisultatoST().equals("2-0")){
											sc.setVincita(sc.getImporto()*pT.getDueZero());
											ut.versaCredito(sc.getImporto()*pT.getDueZero());
										}
										if(sc.getRisultatoST().equals("1-1")){
											sc.setVincita(sc.getImporto()*pT.getUnoUno());
											ut.versaCredito(sc.getImporto()*pT.getUnoUno());
										}
										if(sc.getRisultatoST().equals("1-2")){
											sc.setVincita(sc.getImporto()*pT.getUnoDueP());
											ut.versaCredito(sc.getImporto()*pT.getUnoDueP());
										}
										if(sc.getRisultatoST().equals("2-0")){
											sc.setVincita(sc.getImporto()*pT.getDueZero());
											ut.versaCredito(sc.getImporto()*pT.getDueZero());
										}
										if(sc.getRisultatoST().equals("2-1")){
											sc.setVincita(sc.getImporto()*pT.getDueUno());
											ut.versaCredito(sc.getImporto()*pT.getDueUno());
										}
										if(sc.getRisultatoST().equals("2-2")){
											sc.setVincita(sc.getImporto()*pT.getDueDue());
											ut.versaCredito(sc.getImporto()*pT.getDueDue());

										}
									}
								}
									}
								}

							}

							}
							if(esiti.sceltaIppica){
								SceltaCorsa nomeCorsa = new SceltaCorsa((JFrame) SwingUtilities.getRoot(btn), "Scegli corsa");
								InserisciEsitoCorsa esitoCorsa = new InserisciEsitoCorsa((JFrame) SwingUtilities.getRoot(btn), "Inserisci esito");
								for(QuoteCorsa qC : betSystem.arrIppica){
									if(qC.getNome().equals(nomeCorsa.nome)){
										qC.setPrimo(esitoCorsa.primo);
										qC.setSecondo(esitoCorsa.secondo);
										qC.setTerzo(esitoCorsa.terzo);
									}
									for(Utente u : betSystem.arrUtente){
										for(ScommessaIppica si : betSystem.scommesseIppica){
											if(u.getUsername().equals(si.getUserUtente())){
												if(si.isCavalloVincente()){
													if(si.getRisultato().equals(qC.getPrimo())){
														if(qC.getPrimo().equals(qC.getCavallo1())){
															si.setVincita(si.getImporto()*qC.getQuota1());
															u.versaCredito(si.getImporto()*qC.getQuota1());
														}
														if(qC.getPrimo().equals(qC.getCavallo2())){
															si.setVincita(si.getImporto()*qC.getQuota2());
															u.versaCredito(si.getImporto()*qC.getQuota2());
														}
														if(qC.getPrimo().equals(qC.getCavallo3())){
															si.setVincita(si.getImporto()*qC.getQuota3());
															u.versaCredito(si.getImporto()*qC.getQuota3());
														}
														if(qC.getPrimo().equals(qC.getCavallo4())){
															si.setVincita(si.getImporto()*qC.getQuota4());
															u.versaCredito(si.getImporto()*qC.getQuota4());
														}
														if(qC.getPrimo().equals(qC.getCavallo5())){
															si.setVincita(si.getImporto()*qC.getQuota5());
															u.versaCredito(si.getImporto()*qC.getQuota5());
														}

													

												}
											}
												if(si.isCavalloPiazzato()){
													if((si.getRisultato().equals(qC.getPrimo())||(si.getRisultato().equals(qC.getSecondo()))||(si.getRisultato().equals(qC.getTerzo())))){
														if(si.getRisultato().equals(qC.getCavallo1())){
															si.setVincita(si.getImporto()*qC.getQuota1p());
															u.versaCredito(si.getImporto()*qC.getQuota1p());
														}
														if(si.getRisultato().equals(qC.getCavallo2())){
															si.setVincita(si.getImporto()*qC.getQuota2p());
															u.versaCredito(si.getImporto()*qC.getQuota2p());
														}
														if(si.getRisultato().equals(qC.getCavallo3())){
															si.setVincita(si.getImporto()*qC.getQuota3p());
															u.versaCredito(si.getImporto()*qC.getQuota3p());
														}
														if(si.getRisultato().equals(qC.getCavallo4())){
															si.setVincita(si.getImporto()*qC.getQuota4p());
															u.versaCredito(si.getImporto()*qC.getQuota4p());
														}
														if(si.getRisultato().equals(qC.getCavallo5())){
															si.setVincita(si.getImporto()*qC.getQuota5p());
															u.versaCredito(si.getImporto()*qC.getQuota5p());
														}
													}
												}
											}
										}

									}

								}
							
						}
					

				
			}
		});



		this.mVisualizzaEventi = new JMenuItem("Visualizza eventi");
		this.mVisualizzaEventi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				JFrame pannello = new JFrame();
				pannello.setTitle("Visualizza eventi");
				pannello.setSize(400, 375);
				int x = (Toolkit.getDefaultToolkit().getScreenSize().width - pannello.getSize().width) / 2;
				int y = (Toolkit.getDefaultToolkit().getScreenSize().height - pannello.getSize().height) / 2;
				pannello.setLocation(x,y);
				pannello.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pannello.setResizable(false);

				pannello.setLayout(new GridLayout(1,1));

				JMenuItem btn = (JMenuItem) arg0.getSource();
				SceltaEvento ev = new SceltaEvento((JFrame) SwingUtilities.getRoot(btn), "Scegli evento");
				if(ev.sceltaCalcio){
					JPanel pnlOne = new JPanel();
					txtArea = new TextArea("", 20, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
					String listaPartite = betSystem.listaPartite();
					txtArea.setText(listaPartite);

					pnlOne.add(txtArea);
					pannello.add(pnlOne);
				}

				else if(ev.sceltaIppica){
					JPanel pnlTwo = new JPanel();
					txtArea = new TextArea("", 20, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
					String listaIppica = betSystem.listaIppica();
					txtArea.setText(listaIppica);

					pnlTwo.add(txtArea);
					pannello.add(pnlTwo);
				}

				pannello.setVisible(true);

			}
		});


		this.mAcquistaCredito = new JMenuItem("Acquista credito");
		this.mAcquistaCredito.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JMenuItem btn = (JMenuItem) arg0.getSource();
				AcquistaCredito acquista = new AcquistaCredito((JFrame) SwingUtilities.getRoot(btn), "Inserisci eventi e quote");
				betSystem.ULogged.versaCredito(acquista.credito);
			}
		});

		this.mSfogliaEventi = new JMenuItem("Sfoglia Eventi");
		this.mSfogliaEventi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				JFrame pannello = new JFrame();
				pannello.setTitle("Sfoglia eventi");
				pannello.setSize(400, 375);
				int x = (Toolkit.getDefaultToolkit().getScreenSize().width - pannello.getSize().width) / 2;
				int y = (Toolkit.getDefaultToolkit().getScreenSize().height - pannello.getSize().height) / 2;
				pannello.setLocation(x,y);
				pannello.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pannello.setResizable(false);

				pannello.setLayout(new GridLayout(1,1));

				JMenuItem btn = (JMenuItem) arg0.getSource();
				SceltaEvento ev = new SceltaEvento((JFrame) SwingUtilities.getRoot(btn), "Scegli evento");
				if(ev.sceltaCalcio){
					JPanel pnlOne = new JPanel();
					txtArea = new TextArea("", 20, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
					String listaPartite = betSystem.listaPartite();
					txtArea.setText(listaPartite);

					pnlOne.add(txtArea);
					pannello.add(pnlOne);
				}

				else if(ev.sceltaIppica){
					JPanel pnlTwo = new JPanel();
					txtArea = new TextArea("", 20, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
					String listaIppica = betSystem.listaIppica();
					txtArea.setText(listaIppica);

					pnlTwo.add(txtArea);
					pannello.add(pnlTwo);
				}

				pannello.setVisible(true);

			}
		});


		this.mScommetti = new JMenuItem("Scommetti");
		this.mScommetti.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){

				JMenuItem btn = (JMenuItem) arg0.getSource();
				SceltaEvento ev = new SceltaEvento((JFrame) SwingUtilities.getRoot(btn), "Scegli evento");
				if(ev.sceltaCalcio){
					JMenuItem bt = (JMenuItem) arg0.getSource();
					SceltaTempo tp = new SceltaTempo((JFrame) SwingUtilities.getRoot(bt), "Scegli tempo");
					JMenuItem b = (JMenuItem) arg0.getSource();
					Scommetti scomm = new Scommetti((JFrame) SwingUtilities.getRoot(b), "Scegli evento");
					if(scomm.importo>betSystem.ULogged.getCredito()){
						CreditoInsufficiente c = new CreditoInsufficiente(null, getTitle());
					}
					else betSystem.ULogged.prelevaCredito(scomm.importo);
					if(tp.sceltaPrimoTempo == true){
						ScommessaCalcio nuovaScommessa = new ScommessaCalcio(betSystem.ULogged.getUsername(), scomm.nome, scomm.risultato, " ", scomm.importo, 0);
						betSystem.addScommessaCalcio(nuovaScommessa);
					}
					else if(tp.sceltaSecondoTempo == true){
						ScommessaCalcio nuovaScommessa = new ScommessaCalcio(betSystem.ULogged.getUsername(), scomm.nome, " ", scomm.risultato, scomm.importo, 0);
						betSystem.addScommessaCalcio(nuovaScommessa);
					}
				}


				else if(ev.sceltaIppica){
					JMenuItem bt = (JMenuItem) arg0.getSource();
					ScegliScommessaIppica ipp = new ScegliScommessaIppica ((JFrame) SwingUtilities.getRoot(bt), "Scegli scommessa");
					JMenuItem b = (JMenuItem) arg0.getSource();
					Scommetti scomm = new Scommetti((JFrame) SwingUtilities.getRoot(b), "Scegli evento");
					if(scomm.importo>betSystem.ULogged.getCredito()){
						CreditoInsufficiente c = new CreditoInsufficiente(null, getTitle());
					}
					else betSystem.ULogged.prelevaCredito(scomm.importo);
					if(ipp.sceltaVincente == true){
						ScommessaIppica nuovaScommessa = new ScommessaIppica(betSystem.ULogged.getUsername(), scomm.nome, scomm.risultato, false, true, scomm.importo, 0);
						betSystem.addScommessaIppica(nuovaScommessa);
					}
					else if(ipp.sceltaPiazzato == true){
						ScommessaIppica nuovaScommessa = new ScommessaIppica(betSystem.ULogged.getUsername(), scomm.nome, scomm.risultato, true, false, scomm.importo, 0);
						betSystem.addScommessaIppica(nuovaScommessa);

					}
				}
			}

		});


		this.mVisualizzaScommesse = new JMenuItem("Storico scommesse");
		mVisualizzaScommesse.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){

				JFrame pannello = new JFrame();
				pannello.setTitle("Storico scommesse");
				pannello.setSize(400, 375);
				int x = (Toolkit.getDefaultToolkit().getScreenSize().width - pannello.getSize().width) / 2;
				int y = (Toolkit.getDefaultToolkit().getScreenSize().height - pannello.getSize().height) / 2;
				pannello.setLocation(x,y);
				pannello.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pannello.setResizable(false);

				pannello.setLayout(new GridLayout(1,1));

				JMenuItem btn = (JMenuItem) arg0.getSource();
				SceltaEvento ev = new SceltaEvento((JFrame) SwingUtilities.getRoot(btn), "Scegli evento");
				if(ev.sceltaCalcio){
					for(Utente ut : betSystem.arrUtente){
						for(ScommessaCalcio sc : betSystem.scommesseCalcio){
							if(ut.equals(betSystem.ULogged)&&ut.getUsername().equals(sc.getUserUtente())){
								JPanel pnlOne = new JPanel();
								txtArea = new TextArea("", 20, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
								String listaPartite = betSystem.listaScommesseCalcio();
								txtArea.setText(listaPartite);

								pnlOne.add(txtArea);
								pannello.add(pnlOne);
							}
						}
					}
				}

				else if(ev.sceltaIppica){
					JPanel pnlTwo = new JPanel();
					txtArea = new TextArea("", 20, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
					String listaIppica = betSystem.listaScommesseIppica();
					txtArea.setText(listaIppica);

					pnlTwo.add(txtArea);
					pannello.add(pnlTwo);
				}

				pannello.setVisible(true);

			}
		});



		this.mEsci = new JMenuItem("Esci");
		mEsci.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});





		submSuperUtente.add(mInserisciEventiQuote);
		submSuperUtente.add(mInserisciEsiti);
		submSuperUtente.add(mVisualizzaEventi);
		submUtente.add(mAcquistaCredito);
		submUtente.add(mSfogliaEventi);
		submUtente.add(mScommetti);
		submUtente.add(mVisualizzaScommesse);



		mnuFile.add(submSuperUtente);
		mnuFile.add(submUtente);
		mnuFile.add(mEsci);

		this.setJMenuBar(menuBar);

	}
	
	/**
	 * 
	 * @return finestra inizializzata
	 */

	public JPanel creaLatoSinistro(){


		JPanel pGeneral = new JPanel();
		pGeneral.setLayout(null);

		bLogin = new JButton("Login");
		bLogin.setPreferredSize(new Dimension(150,30));
		bLogin.setMinimumSize(new Dimension(150,30));
		bLogin.setBounds(10, 60, 200, 30);
		bLogin.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent arg0) {
				JButton b = (JButton) arg0.getSource();
				if(b.getText().equals("Login")){
					//Login
					Login login = new Login((JFrame) SwingUtilities.getRoot(b), "Login");

					//Check se è un super utente
					boolean check = betSystem.loginSuperUtente(login.username, login.password);
					boolean check2 = betSystem.loginUtente(login.username, login.password);

					if(check || check2){
						b.setText("Logout");
						if(check){
							submSuperUtente.setEnabled(true);
						}
						else{
							submUtente.setEnabled(true);

						}
					}
				}else{
					b.setText("Login");
					betSystem.logoutSuperUtente();

					submSuperUtente.setEnabled(false);
					submUtente.setEnabled(false);
				}
			}

		});
		pGeneral.add(bLogin);

		bRSuperUtente = new JButton("Registra super utente");
		bRSuperUtente.setPreferredSize(new Dimension(150,30));
		bRSuperUtente.setMinimumSize(new Dimension(150,30));
		bRSuperUtente.setBounds(10, 100, 200, 30);
		bRSuperUtente.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {

				JButton b1 = (JButton) arg0.getSource();
				if(b1.getText().equals("Registra super utente")){
					RegistraSuperUtente registrazione = new RegistraSuperUtente((JFrame) SwingUtilities.getRoot(b1), "Registrazione");
					if(registrazione.superUtente != null){
						betSystem.addSuperUtente(registrazione.superUtente);
					}


				}

			}
		});
		pGeneral.add(bRSuperUtente);

		bUtente = new JButton("Registra utente");
		bUtente.setPreferredSize(new Dimension(150,30));
		bUtente.setMinimumSize(new Dimension(150,30));
		bUtente.setBounds(10, 140, 200, 30);
		bUtente.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				JButton b2 = (JButton) arg0.getSource();
				if(b2.getText().equals("Registra utente")){
					RegistraUtente registrazione = new RegistraUtente((JFrame) SwingUtilities.getRoot(b2), "Registrazione");
					if(registrazione.utente != null){
						betSystem.addUtente(registrazione.utente);
					}

				}
			}

		});
		pGeneral.add(bUtente);


		return pGeneral;
	}


}

