package com.ardoise.vue;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import com.ardoise.controleur.MenuListener;
import com.ardoise.model.ModelArdoise;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = -8110760513728764317L;
	private Panneau panneauDessin;
	MenuListener menuListener;
	ModelArdoise model;

	public Fenetre() {
		super();
		this.setTitle("Ardoise Magique");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		model = new ModelArdoise();
		menuListener = new MenuListener(model);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		//Création du menu
		JMenuBar barreMenu=new JMenuBar();
			JMenu fichier = new JMenu("Fichier");
			fichier.setMnemonic('F');
			barreMenu.add(fichier);
				JMenuItem effacer = new JMenuItem("Effacer");
				effacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.CTRL_DOWN_MASK,KeyEvent.VK_N));
				effacer.addActionListener(menuListener);
				fichier.add(effacer);
				fichier.addSeparator();
				JMenuItem quitter = new JMenuItem("Quitter");
				quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.CTRL_DOWN_MASK,KeyEvent.VK_Q));
				quitter.addActionListener(menuListener);
				fichier.add(quitter);
			JMenu edition = new JMenu("Edition");
			edition.setMnemonic('E');
			barreMenu.add(edition);
				JMenu forme = new JMenu("Forme du pinceau");
				forme.setMnemonic('O');
				edition.add(forme);
					JMenuItem rond = new JMenuItem("Rond");
					rond.setName("Rond");
					rond.addActionListener(menuListener);
					forme.add(rond);
					JMenuItem carre = new JMenuItem("Carré");
					carre.setName("Carre");
					carre.addActionListener(menuListener);
					forme.add(carre);
				JMenu couleur = new JMenu("Couleur du pinceau");
				couleur.setMnemonic('C');
				edition.add(couleur);
					JMenuItem rouge = new JMenuItem("Rouge");
					rouge.setName("Rouge");
					rouge.addActionListener(menuListener);
					couleur.add(rouge);
					JMenuItem vert = new JMenuItem("Vert");
					vert.setName("Vert");
					vert.addActionListener(menuListener);
					couleur.add(vert);
					JMenuItem bleu = new JMenuItem("Bleu");
					bleu.setName("Bleu");
					bleu.addActionListener(menuListener);
					couleur.add(bleu);
			this.setJMenuBar(barreMenu);
		
		//Création de la barre d'outils
		JToolBar barreOutils = new JToolBar();
			JButton bRond = new JButton(new ImageIcon("images/rond.png"));
			bRond.setName("Rond");
			bRond.addActionListener(menuListener);
			barreOutils.add(bRond);
			JButton bCarre = new JButton(new ImageIcon("images/carre.png"));
			bCarre.setName("Carre");
			bCarre.addActionListener(menuListener);
			barreOutils.add(bCarre);
			
			
			barreOutils.addSeparator();
			
			JButton bRouge = new JButton(new ImageIcon("images/rouge.png"));
			bRouge.setName("Rouge");
			bRouge.addActionListener(menuListener);
			barreOutils.add(bRouge);
			JButton bVert = new JButton(new ImageIcon("images/vert.png"));
			bVert.setName("Vert");
			bVert.addActionListener(menuListener);
			barreOutils.add(bVert);
			JButton bBleu = new JButton(new ImageIcon("images/bleu.png"));
			bBleu.setName("Bleu");
			bBleu.addActionListener(menuListener);
			barreOutils.add(bBleu);
		contentPane.add(barreOutils,BorderLayout.NORTH);
		
		//création du panneau de dessin
		panneauDessin = new Panneau(model);
		contentPane.add(panneauDessin,BorderLayout.CENTER);
		
		this.setContentPane(contentPane);
		this.setVisible(true);
	}
}
