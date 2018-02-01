package com.ardoise.vue;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.ardoise.controleur.MenuListener;
import com.ardoise.model.ModelArdoise;

public class Fenetre extends JFrame {

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
		
		panneauDessin = new Panneau(model);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(panneauDessin,BorderLayout.CENTER);
		
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
					rond.addActionListener(menuListener);
					forme.add(rond);
					JMenuItem carre = new JMenuItem("Carré");
					carre.addActionListener(menuListener);
					forme.add(carre);
				JMenu couleur = new JMenu("Couleur du pinceau");
				couleur.setMnemonic('C');
				edition.add(couleur);
					JMenuItem rouge = new JMenuItem("Rouge");
					rouge.addActionListener(menuListener);
					couleur.add(rouge);
					JMenuItem vert = new JMenuItem("Vert");
					vert.addActionListener(menuListener);
					couleur.add(vert);
					JMenuItem bleu = new JMenuItem("Bleu");
					bleu.addActionListener(menuListener);
					couleur.add(bleu);
		contentPane.add(barreMenu,BorderLayout.NORTH);
		
		this.setContentPane(contentPane);
		this.setVisible(true);
	}
}
