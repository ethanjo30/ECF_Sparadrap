package app_main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import ClasseMetier.Utilisateur;
import classe_métier.Medecin;
import classe_métier.Medicament;
import classe_métier.Patients;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;

public class App extends JFrame {
	
	static ArrayList<Patients>listpatient= new ArrayList<>();
	static ArrayList<Medecin>listmed= new ArrayList<>();
	static ArrayList<Medicament>ListMedi= new ArrayList<>();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
			
			Patients pat1 = new Patients("Martin","Pierre",123,"rue de la Fictivité","Paris",75000,603487571,
					"Martin.Pierre@gmail.com",01/01/1997,"197017512348622");		
			Patients pat2 = new Patients("Durand","Marie",456," avenue de la Fiction","Paris",75000,611824977,
					"Durant.Marie@gmail.com",05/12/2000,"200057533277804");
			Patients pat3 = new Patients("Petit","Jonathan",10,"chemin des clous","Paris",75000,622030849,
					"Petit.Jonathan@gmail.com",31/01/1990,"190017559644898");
			Patients pat4 = new Patients("Duvet","Honorine",12,"rue de la liberté","Paris",75000,615084926,
					"Duvet.Honorine@gmail.com",27/06/1993,"293087510237157");
			Patients pat5 = new Patients("Pierard","Laetitia",32,"boulevard mozard","Paris",75000,648596120,
					"Pierrard.Laetitia@gmail.com",13/11/1985,"285117511247862");
		
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
		
			Medicament medi1 = new Medicament("Analgésique",15,02/2023,50);
			Medicament medi2 = new Medicament("Antispasmodiquess",26,9/2020,36);
			Medicament medi3 = new Medicament("Corticoïdes",15,07/2021,23);
			Medicament medi4 = new Medicament("antibactériens",12,02/2023,12);
			Medicament medi5 = new Medicament("Polymyxines",24,06/2022,24);
			Medicament medi6 = new Medicament("Tétracyclines",30,01/2021,6);
			Medicament medi7 = new Medicament("Antituberculeux",36,012/2022,14);
			Medicament medi8 = new Medicament("Antifongiques",11,11/2020,62);
			Medicament medi9 = new Medicament("Bêta-bloquants",24,8/2023,24);
			Medicament medi10 = new Medicament("Correcteurs des bradycardies",15,6/2021,100);
			Medicament medi11 = new Medicament("Diurétiques",38,02/2022,70);
			Medicament medi12 = new Medicament("Antiacnéiques",52,06/2022,24);
			Medicament medi13 = new Medicament("Antiseptiques ",26,06/2021,83);
			Medicament medi14 = new Medicament("Hormones thyroïdiennes ",27,06/2023,6);
			Medicament medi15 = new Medicament("Androgènes",33,9/2022,2);
			Medicament medi16 = new Medicament("Antidiarrhéiques",12,3/2023,54);
			
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
			
	}

	/**
	 * Create the frame.
	 */
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JComboBox comboBox = new JComboBox<String>(new String[] {"effectuer un achat", "historique des achat",
				"historique des ordonnance","detaille client"});
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				switch (comboBox.getSelectedIndex()) {
				case 0 :				
					break;
				case 1 :
					break;
				case 2 :
					JPanel panel_2 = new JPanel();
						contentPane.add(panel_2, BorderLayout.CENTER);		
						JComboBox comboBox_1 = new JComboBox();
						for (Medecin value : listmed)	
						comboBox_1.addItem(value.identité());
							panel_2.add(comboBox_1);

					break;
				case 3 :
					JPanel panel_3 = new JPanel();
					contentPane.add(panel_3, BorderLayout.CENTER);		
					JComboBox comboBox_2 = new JComboBox();
					for (Patients value : listpatient)	
					comboBox_2.addItem(value.identité());
						panel_3.add(comboBox_2);
						
						@Override
						public void mouseClicked(MouseEvent e) {
						for (int i=0; i < listpatient.size(); i++){
							if (listpatient.get(i).getNom().matches(getName()));
							System.out.println(Patients);
						}
						}
										
					break;
				default :
					break;
				}
			}
		});
		
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Retour");
		panel_1.add(btnNewButton);
		
		
			
	}

}
