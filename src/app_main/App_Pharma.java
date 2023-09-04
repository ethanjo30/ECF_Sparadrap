package app_main;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classe_métier.Medecin;
import classe_métier.Medicament;
import classe_métier.Mutuelle;
import classe_métier.Ordonance;
import classe_métier.Patients;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;

public class App_Pharma extends JFrame {

	static ArrayList<Patients>listpatient= new ArrayList<>();
	static ArrayList<Medecin>listmed= new ArrayList<>();
	static ArrayList<Medicament>ListMedi= new ArrayList<>();
	static ArrayList<Ordonance>Listordo= new ArrayList<>();
	static ArrayList<Mutuelle>ListMut= new ArrayList<>();
	
	private JPanel contentPane;
	private JTable table_Ordo_Med;
	private JTable table;
	private JTextField textField;
	private JTable table_1;

	int total = 0;

/**
 *  instanciation de tout les objets
 */
		
	public static void InitList() {
		
		Patients pat1 = new Patients("Martin","Pierre",123,"rue de la Fictivité","Paris",75000,603487571,
				"Martin.Pierre@gmail.com","01/01/1997","197017512348622");		
		Patients pat2 = new Patients("Durand","Marie",456," avenue de la Fiction","Paris",75000,611824977,
				"Durant.Marie@gmail.com","05/12/2000","200057533277804");
		Patients pat3 = new Patients("Petit","Jonathan",10,"chemin des clous","Paris",75000,622030849,
				"Petit.Jonathan@gmail.com","31/01/1990","190017559644898");
		Patients pat4 = new Patients("Duvet","Honorine",12,"rue de la liberté","Paris",75000,615084926,
				"Duvet.Honorine@gmail.com","27/06/1993","293087510237157");
		Patients pat5 = new Patients("Pierard","Laetitia",32,"boulevard mozard","Paris",75000,648596120,
				"Pierrard.Laetitia@gmail.com","13/11/1985","285117511247862");
	
		listpatient.add(pat1);
		listpatient.add(pat2);
		listpatient.add(pat3);
		listpatient.add(pat4);
		listpatient.add(pat5);
		
		Medecin med1 = new Medecin("Gallet","Anne",11,"place de la nation","Paris",75011,622487594,
				"Gallet.Anne@gmail.com","10123456789","endocrinologue");
		Medecin med2 = new Medecin("Malka","Michel",10,"rue anatole de la forge","Paris",75017,628497557,
				"Malka.Michel@gmail.com","15847754886","pneumologue");
		Medecin med3 = new Medecin("Khebichat","Omar",21,"rue faidherbe","Paris",75011,603518774,
				"Khebichat.Omar@gmail.com","35148774956","generaliste");
		Medecin med4 = new Medecin("Burseaux","Sarah",133,"avenue de suffren","Paris",75007,623351554,
				"Burseaux.Sarah@gmail.com","31547848875","pediatre");
		Medecin med5 = new Medecin("Rabah","Nacera",59,"rue geoffroy-saint-hilaire","Paris",75005,659889589,
				"Rabah.Nacera@gmail.com","84975989571","cardiologue");
		
		listmed.add(med1);
		listmed.add(med2);
		listmed.add(med3);
		listmed.add(med4);
		listmed.add(med5);
	
		Medicament medi1 = new Medicament("Analgésique",15,"02/2023",50);
		Medicament medi2 = new Medicament("Antispasmodiques",26,"9/2020",36);
		Medicament medi3 = new Medicament("Corticoïdes",15,"07/2021",23);
		Medicament medi4 = new Medicament("antibactériens",12,"02/2023",12);
		Medicament medi5 = new Medicament("Polymyxines",24,"06/2022",24);
		Medicament medi6 = new Medicament("Tétracyclines",30,"01/2021",6);
		Medicament medi7 = new Medicament("Antituberculeux",36,"12/2022",14);
		Medicament medi8 = new Medicament("Antifongiques",11,"11/2020",62);
		Medicament medi9 = new Medicament("Bêta-bloquants",24,"8/2023",24);
		Medicament medi10 = new Medicament("Correcteurs des bradycardies",15,"6/2021",100);
		Medicament medi11 = new Medicament("Diurétiques",38,"02/2022",70);
		Medicament medi12 = new Medicament("Antiacnéiques",52,"06/2022",24);
		Medicament medi13 = new Medicament("Antiseptiques ",26,"06/2021",83);
		Medicament medi14 = new Medicament("Hormones thyroïdiennes",27,"06/2023",6);
		Medicament medi15 = new Medicament("Androgènes",33,"9/2022",2);
		Medicament medi16 = new Medicament("Antidiarrhéiques",12,"3/2023",54);
		
		ListMedi.add(medi1);
		ListMedi.add(medi2);
		ListMedi.add(medi3);
		ListMedi.add(medi4);
		ListMedi.add(medi5);
		ListMedi.add(medi6);
		ListMedi.add(medi7);
		ListMedi.add(medi8);
		ListMedi.add(medi9);
		ListMedi.add(medi10);
		ListMedi.add(medi11);
		ListMedi.add(medi12);
		ListMedi.add(medi13);
		ListMedi.add(medi14);
		ListMedi.add(medi15);
		ListMedi.add(medi16);
		
		Ordonance ordo1 = new Ordonance("22/08/23","Gallet","Anne","Martin","Pierre","Hormones", "thyroïdiennes","Androgènes"," ");
		Ordonance ordo2 = new Ordonance("12/07/23","Gallet","Anne","Durand","Marie","Antidiarrhéiques"," "," "," ");
		Ordonance ordo3 = new Ordonance("03/001/22","Malka","Michel","Duvet","Honorine","Polymyxines","Diurétiques","Tétracyclines"," ");
		Ordonance ordo4 = new Ordonance("22/08/23","Malka","Michel","Petit","Jonathan","Antifongiques","Analgésique"," "," ");
		Ordonance ordo5 = new Ordonance("26/005/23","Khebichat","Omar","Pierard","Laetitia","Antidiarrhéiques","Analgésique"," "," ");
		Ordonance ordo6 = new Ordonance("22/08/23","Khebichat","Omar","Durand","Marie","Analgésique"," "," "," ");
		Ordonance ordo7 = new Ordonance("22/08/23","Khebichat","Omar","Duvet","Honorine","Antituberculeux","Corticoïde","Antiacnéiques","Antispasmodiques");
		Ordonance ordo8 = new Ordonance("22/08/23","Burseaux","Sarah","Pierard","Laetitia","Antituberculeux"," "," "," ");
		Ordonance ordo9 = new Ordonance("22/08/23","Burseaux","Sarah","Petit","Jonathan","Antiseptique","Diurétiques","antibactériens"," ");
		Ordonance ordo10 = new Ordonance("22/08/23","Rabah","Nacera","Martin","Pierre","Correcteurs des bradycardies","Bêta-bloquant"," "," ");
		
		Listordo.add(ordo1);
		Listordo.add(ordo2);
		Listordo.add(ordo3);
		Listordo.add(ordo4);
		Listordo.add(ordo5);
		Listordo.add(ordo6);
		Listordo.add(ordo7);
		Listordo.add(ordo8);
		Listordo.add(ordo9);
		Listordo.add(ordo10);
		
		Mutuelle mut1 = new Mutuelle ("Axa", 1953, "charle le roi", "strasbourg",67000, 619858875,"axa.serviceClients@gmail.com",67,68);
		Mutuelle mut2 = new Mutuelle ("Mgen",20, "footix", "paris",75000, 600235898,"mgen.serviceClients@gmail.com",75,90);
		Mutuelle mut3 = new Mutuelle ("Maaf", 975, "baudelmaire","havre",76600, 698598748,"maaf.serviceClients@gmail.com",76,100);
		Mutuelle mut4 = new Mutuelle ("Alianz", 57, "place michelin", "lille",59000, 612457849,"alianz.serviceClients@gmail.com",67,68);
		
		ListMut.add(mut3);
		ListMut.add(mut4);
		ListMut.add(mut2);
		ListMut.add(mut1);
	}

	/**
	 * Create the frame.
	 */
	
	public static void main(String[] args){
		App_Pharma.InitList();
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					App_Pharma frame = new App_Pharma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
		public  App_Pharma() {
		
			/**
			 * creation de toute les fenêtre pour le visuel swing
			 */
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		
		//menu principal deroulant
		JComboBox comboBox = new JComboBox<String>(new String[] {"effectuer un achat", "historique des achat",
				"historique des ordonnance","detaille client"});
		 
		panel.add(comboBox);	
		comboBox.setOpaque(false);
		comboBox.setSelectedIndex(-1);
		JTable table_Ordo_Med = new JTable();
		JTable tableFactur = new JTable();
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		JPanel panel_4 = new JPanel();
		JPanel panel_5 = new JPanel();
		JPanel panel_6 = new JPanel();
		JPanel panel_7 = new JPanel();
		
		//single_selection pour une seul selection possible
		// si double click l'utilisateur peut changer les donnée
			
			// action a effectuer au changement d'index du menu principal
			comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.revalidate();;
				
				switch (comboBox.getSelectedIndex()) {
				
				case 0 :
					
					JComboBox comboBox_5 = new JComboBox<String>(new String[] {"sans ordonance", "avec ordonance"});
					comboBox_5.setOpaque(false);
					comboBox_5.setSelectedIndex(-1);
					panel_6.add(comboBox_5, BorderLayout.CENTER);
					panel_1.add(panel_6);
					comboBox_5.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {						
					
					switch (comboBox_5.getSelectedIndex()) {
					
					case 0 :
						comboBox_5.setVisible(false);
						panel_6.add(panel_5, BorderLayout.CENTER);
					
						// le textfield servira a compter la somme de toute les lignes du tableau
						textField = new JTextField();
						textField.setBounds(551, 188, 86, 20);
						textField.setColumns(10);
						textField.setEnabled(true);
						textField.setEditable(false);
						panel_5.add(textField);

					JLabel lblNewLabel = new JLabel("Total");
					lblNewLabel.setBounds(467, 191, 46, 14);
					panel_5.add(lblNewLabel);
					
					/**
					 * le bouton valider validera tooute les ligne presente dans le tableau
					 * en retirant 1 de stock au stock disponible de la pharmacie
					 */
					JButton btnNewButton = new JButton("Validé");
					btnNewButton.setBounds(76, 187, 89, 23);
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							// ne pas oublier le try catch pour aucune selection
//							
//									if(textField > 0 
//										
//									
									//if (med.getNom().equals(comboBox_4.getSelectedItem()))
							
							try {
								if(textField.equals(null));
							} catch (Exception e2) {
								System.out.println("Pas de médicament saisie");
							}
							
						}
					});
					
					/**
					 * le bouton suprimer retirera la ligne selectionner
					 */
					btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
					btnNewButton.setForeground(new Color(0, 100, 0));
					panel_5.add(btnNewButton);
					
					JButton btnNewButton_1 = new JButton("Suprimé");
					
					btnNewButton_1.setBounds(198, 187, 89, 23);
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					
					});
					
					btnNewButton_1.setForeground(new Color(178, 34, 34));
					btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
					panel_5.add(btnNewButton_1);
					
					/**
					 * affiche la liste des different patient de la pharmacie
					 */
					JComboBox comboBox_3 = new JComboBox();
					comboBox_3.setBounds(200, 11, 30, 00);
					for (Patients value : listpatient) {	
						comboBox_3.addItem(value.getNom());
						panel_5.add(comboBox_3);
					}
					
					
					panel_5.add(tableFactur);
					
					/**
					 * affiche la liste des different medicament de la pharmacie
					 */
					JComboBox comboBox_4 = new JComboBox();
					comboBox_4.setBounds(367, 11, 30, 22);
					for (Medicament value : ListMedi) {	
						comboBox_4.addItem(value.getNom());
						panel_5.add(comboBox_4);
					}
					
					/**
					 * au changement de medicament dans la combobox
					 * le nom s'affiche dans un tableau avec les donnee le concernant
					 */
					tableFactur.setDefaultEditor(Object.class, null);
						tableFactur.setModel(new DefaultTableModel(
								new Object[][] {
									{"Nom","Date service","Quantité en stock","prix ttc"},
										
									},
								new String[] {
										"Nom","Date service","Quantité en stock","prix ttc"	
								}
								));
						comboBox_4.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// crétion du tableau
							tableFactur.setPreferredSize(new Dimension(1000,100));
							
							
								for (Medicament med : ListMedi) {
									if (med.getNom().equals(comboBox_4.getSelectedItem())) {
										DefaultTableModel model = (DefaultTableModel) tableFactur.getModel();
										
										model.addRow(new Object[] {med.getNom(),med.getDateMiseService(),med.getQuantité(),med.getPrix()});

										total = total + med.getPrix();

										System.out.println(total);
										textField.setText(""+total);
										
										panel_4.add(tableFactur,BorderLayout.SOUTH);
										panel_5.add(panel_4);

									}
									
								}
								
								
							// boucle qui affiche les nom des medicament selectionner
							
							
						
						}});
					panel_6.add(panel_5);
					panel_1.add(panel_6);
					break;
					case 1 :
						comboBox_5.setVisible(false);
						panel_6.add(panel_7, BorderLayout.CENTER);
						
						// le textfield servira a compter la somme de toute les lignes du tableau
						textField = new JTextField();
						textField.setBounds(551, 188, 86, 20);
						textField.setColumns(10);
						textField.setEnabled(true);
						textField.setEditable(false);
						panel_7.add(textField);

					JLabel lblNewLabel_1 = new JLabel("Total");
					lblNewLabel_1.setBounds(467, 191, 46, 14);
					panel_7.add(lblNewLabel_1);
					
					/**
					 * le bouton valider validera tooute les ligne presente dans le tableau
					 * en retirant 1 de stock au stock disponible de la pharmacie
					 */
					JButton btnNewButton_2 = new JButton("Validé");
					btnNewButton_2.setBounds(76, 187, 89, 23);
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							// ne pas oublier le try catch pour aucune selection
//							
//									if(textField > 0 
//										
//									
									//if (med.getNom().equals(comboBox_4.getSelectedItem()))
							
							try {
								if(textField.equals(null));
							} catch (Exception e2) {
								System.out.println("Pas de médicament saisie");
							}
							
						}
					});
					
					/**
					 * le bouton suprimer retirera la ligne selectionner
					 */
					btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
					btnNewButton_2.setForeground(new Color(0, 100, 0));
					panel_7.add(btnNewButton_2);
					
					JButton btnNewButton_3 = new JButton("Suprimé");
					
					btnNewButton_3.setBounds(198, 187, 89, 23);
					btnNewButton_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					
					});
					
					btnNewButton_3.setForeground(new Color(178, 34, 34));
					btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
					panel_7.add(btnNewButton_3);
					
					/**
					 * affiche la liste des different patient de la pharmacie
					 */
					JComboBox comboBox_6 = new JComboBox();
					comboBox_6.setBounds(200, 11, 30, 00);
					for (Patients value : listpatient) {	
						comboBox_6.addItem(value.getNom());
						panel_7.add(comboBox_6);
					}
					
					
					panel_7.add(tableFactur);
					
					/**
					 * affiche la liste des different medicament de la pharmacie
					 */
					JComboBox comboBox_7 = new JComboBox();
					comboBox_7.setBounds(367, 11, 30, 22);
					for (Medicament value : ListMedi) {	
						comboBox_7.addItem(value.getNom());
						panel_7.add(comboBox_7);
					}
					
					/**
					 * au changement de medicament dans la combobox
					 * le nom s'affiche dans un tableau avec les donnee le concernant
					 */
					tableFactur.setDefaultEditor(Object.class, null);
						tableFactur.setModel(new DefaultTableModel(
								new Object[][] {
									{"Nom","Date service","Quantité en stock","prix ttc"},
										
									},
								new String[] {
										"Nom","Date service","Quantité en stock","prix ttc"	
								}
								));
						comboBox_7.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// crétion du tableau
							tableFactur.setPreferredSize(new Dimension(1000,100));
							
							
								for (Medicament med : ListMedi) {
									if (med.getNom().equals(comboBox_7.getSelectedItem())) {
										DefaultTableModel model = (DefaultTableModel) tableFactur.getModel();
										
										model.addRow(new Object[] {med.getNom(),med.getDateMiseService(),med.getQuantité(),med.getPrix()});

										total = total + med.getPrix();

										System.out.println(total);
										textField.setText(""+total);
										
										panel_4.add(tableFactur,BorderLayout.SOUTH);
										panel_7.add(panel_4);

									
									}
									
								}
								
								
							// boucle qui affiche les nom des medicament selectionner
							
							
						
						}});
						
						JComboBox comboBox_8 = new JComboBox();
						comboBox_8.setBounds(367, 11, 30, 22);
						for (Mutuelle value2 : ListMut) {	
							comboBox_8.addItem(value2.getNom());
						
						}
						panel_7.add(comboBox_8);	
						break;
					}
						}
					});
					panel_6.add(panel_7);
					panel_1.add(panel_6);
				case 1 :
					break;
				case 2 :
					
					table_Ordo_Med.setModel(new DefaultTableModel(
							new Object[][] {
								{"Date","Nom patient","Prenom patient","medicament 1","medicament 2","medicament 3","medicament 4"},
							},
		
							new String[] {
									"Date", "Nom patient", "Prenom patient","medicament 1","medicament 2","medicament 3","medicament 4"
							}

							));
					// creation de la combobox
					
					contentPane.add(panel_2, BorderLayout.CENTER);
					JComboBox comboBox_1 = new JComboBox();
					
					// la combobox est incrementer de tout les nom de medecin
					for (Medecin value : listmed) {	
						comboBox_1.addItem(value.identité());
						panel_2.add(comboBox_1,BorderLayout.NORTH);
						comboBox_1.setSelectedIndex(-1);
						
					}
					panel_1.removeAll();
					/**
					 * si la combobox change de statue
					 * toute les ordonance du medecin concerné s'affiche
					 */
					comboBox_1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							table_Ordo_Med.setEnabled(false);
							table_Ordo_Med.setPreferredSize(new Dimension(600,100));	
							table_Ordo_Med.setDefaultEditor(Object.class, null);
							// boucle qui recherche les ordonance qui on le nom du medecin selectionner
							for (Ordonance or : Listordo) {
									if (or.identité().equals(comboBox_1.getSelectedItem())){
											
											DefaultTableModel model = (DefaultTableModel) table_Ordo_Med.getModel();
											model.addRow(new Object[] {or.getDate(),or.getNomPat(),or.getPrenomPat(),or.getMed1(),or.getMed2(),or.getMed3(),or.getMed4()});
											
											table_Ordo_Med.setModel(model);
											
							panel_2.add(table_Ordo_Med, BorderLayout.CENTER);
							
								}
										 
				}	//SINGLE_SELECTION : permet de sélectionner une seule ligne ;
								
						}
						
					});
					panel_1.add(panel_2);
					break;
				case 3 :
					contentPane.add(panel_3, BorderLayout.CENTER);
					
					// crétion e la combobox 
					JComboBox comboBox_2 = new JComboBox();
					
					// boucle qui increment de la liste de tout les patient
					for (Patients value : listpatient) {
								comboBox_2.addItem(value.identité());
								panel_3.add(comboBox_2);
								comboBox_2.setSelectedIndex(-1);
					}
					comboBox_2.addActionListener(new ActionListener() {
						@Override
						// action au changement de selection 
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							Patients patient = null;
							
							/**
							 * boucle qui cherche le nom patient selectionner
							 * et qui affiche ses coordoner dans un pop-up
							 */
							for (Patients p : listpatient) {
								if (p.identité().equals(comboBox_2.getSelectedItem())){
									patient=p;
								}
				}	
							JOptionPane.showMessageDialog(comboBox_2,patient.toString());
						}
						
					});
					panel_1.add(panel_3);
					break;
				default :
					break;
				}
				}
					});
	
			
	}
}
