package app_main;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classe_métier.Medecin;
import classe_métier.Medicament;
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

public class App_Pharma extends JFrame {

	static ArrayList<Patients>listpatient= new ArrayList<>();
	static ArrayList<Medecin>listmed= new ArrayList<>();
	static ArrayList<Medicament>ListMedi= new ArrayList<>();
	static ArrayList<Ordonance>Listordo= new ArrayList<>();
	
	private JPanel contentPane;
	private JTable table_Ordo_Med;
	private JTable table;

	/**
	 * Launch the application.
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JComboBox comboBox = new JComboBox<String>(new String[] {"effectuer un achat", "historique des achat",
				"historique des ordonnance","detaille client"});
		 
		comboBox.setOpaque(false);
		comboBox.setSelectedIndex(-1);
		table_Ordo_Med = new JTable();
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		JPanel panel_4 = new JPanel();
		JPanel panel_5 = new JPanel();
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedIndex());
				switch (comboBox.getSelectedIndex()) {
				case 0 :
					
					contentPane.add(panel_5, BorderLayout.CENTER);
					panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
					
					JComboBox comboBox_3 = new JComboBox();
					for (Patients value : listpatient) {	
						comboBox_3.addItem(value.getNom());
						panel_5.add(comboBox_3);
					}
					
					JTable tableFactur = new JTable();
					panel_5.add(tableFactur);
					
					JComboBox comboBox_4 = new JComboBox();
					for (Medicament value : ListMedi) {	
						comboBox_4.addItem(value.getNom());
						panel_5.add(comboBox_4);
					
					comboBox_4.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							
							tableFactur.setPreferredSize(new Dimension(700,100));
							tableFactur.setModel(new DefaultTableModel(
									new Object[][] {
										{"Nom","Date service","Quantité","prix ttc"},
											
										},
									new String[] {
											"Nom","Date service","Quantité","prix ttc"	
									}
									));
								
							for (Medicament med : ListMedi) {
								if (med.getNom().equals(comboBox_4.getSelectedItem())) {
									DefaultTableModel model = (DefaultTableModel) tableFactur.getModel();
									model.addRow(new Object[] {med.getNom(),med.getDateMiseService(),med.getQuantité(),med.getPrix()});
									
									tableFactur.setModel(model);
									panel_5.add(tableFactur);
									
									
								}
								
							}
							
						}
					});
					
						
					}
					
					break;
				case 1 :
					break;
				case 2 :
					getContentPane().remove(panel_3);
					contentPane.add(panel_2, BorderLayout.CENTER);
					JComboBox comboBox_1 = new JComboBox();
					for (Medecin value : listmed) {	
						comboBox_1.addItem(value.identité());
						panel_2.add(comboBox_1);
						comboBox_1.setSelectedIndex(-1);
						
					}
					
					comboBox_1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							
							table_Ordo_Med.setPreferredSize(new Dimension(700,100));	
							table_Ordo_Med.setModel(new DefaultTableModel(
									new Object[][] {
										{"Date","Nom patient","Prenom patient","medicament 1","medicament 2","medicament 3","medicament 4"},
									},
				
									new String[] {
											"Date", "Nom patient", "Prenom patient","medicament 1","medicament 2","medicament 3","medicament 4"
									}

									));
							
							for (Ordonance or : Listordo) {
									if (or.identité().equals(comboBox_1.getSelectedItem())){
											
											DefaultTableModel model = (DefaultTableModel) table_Ordo_Med.getModel();
											model.addRow(new Object[] {or.getDate(),or.getNomPat(),or.getPrenomPat(),or.getMed1(),or.getMed2(),or.getMed3(),or.getMed4()});
											
											table_Ordo_Med.setModel(model);
							panel_4.add(table_Ordo_Med, BorderLayout.CENTER);
							panel_2.add(panel_4);
								}
										 
				}	//SINGLE_SELECTION : permet de sélectionner une seule ligne ;
								
						}
						
					});
					break;
				case 3 :
					getContentPane().remove(panel_2);
					getContentPane().remove(panel_4);
					contentPane.add(panel_3, BorderLayout.CENTER);
					
					JComboBox comboBox_2 = new JComboBox();
					for (Patients value : listpatient) {
								comboBox_2.addItem(value.identité());
								panel_3.add(comboBox_2);
								comboBox_2.setSelectedIndex(-1);
					}
					comboBox_2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							Patients patient = null;
							for (Patients p : listpatient) {
								if (p.identité().equals(comboBox_2.getSelectedItem())){
									patient=p;
								}
				}	
							JOptionPane.showMessageDialog(comboBox_2,patient.toString());
						}
						
					});
					break;
				default :
					break;
				}
			}
		});
		
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
	}
}
