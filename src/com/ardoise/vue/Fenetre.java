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
import com.ardoise.model.Forme;
import com.ardoise.model.ModelArdoise;

/**
 * <b>La class Fenetre permet de générer la fenetre de l'application</b> <br/>
 * Elle hérite de JFrame
 * 
 * @author Oltenos
 * @version 1
 * @see JFrame
 */
public class Fenetre extends JFrame {

	/**
	 * ContentPane de notre fenêtre
	 */
	private JPanel contentPane = new JPanel();
	/**
	 * Zone de dessin.
	 */
	private Panneau panneauDessin;
	/**
	 * Listener pour le menu et la barre d'outils.
	 */
	private MenuListener menuListener;
	/**
	 * Model de notre application.
	 */
	private ModelArdoise model;

	/**
	 * Constructeur de Fenetre.
	 */
	public Fenetre() {
		super();
		this.setTitle("Ardoise Magique");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		model = new ModelArdoise();
		menuListener = new MenuListener(model);

		contentPane.setLayout(new BorderLayout());

		// Création du menu
		this.initMenu();

		// Création de la barre d'outils
		initBarreOutils();

		// création du panneau de dessin
		panneauDessin = new Panneau(model);
		contentPane.add(panneauDessin, BorderLayout.CENTER);

		this.setContentPane(contentPane);
		this.setVisible(true);
	}

	/**
	 * Initialisation du Menu
	 */
	private void initMenu() {
		Forme[] formes = Forme.values();

		JMenuBar barreMenu = new JMenuBar();
		JMenu fichier = new JMenu("Fichier");
		fichier.setMnemonic('F');
		barreMenu.add(fichier);
		JMenuItem effacer = new JMenuItem("Effacer");
		effacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
		effacer.setName("Effacer");
		effacer.addActionListener(menuListener);
		fichier.add(effacer);
		fichier.addSeparator();
		JMenuItem quitter = new JMenuItem("Quitter");
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
		quitter.setName("Quitter");
		;
		quitter.addActionListener(menuListener);
		fichier.add(quitter);
		JMenu edition = new JMenu("Edition");
		edition.setMnemonic('E');
		barreMenu.add(edition);
		JMenu forme = new JMenu("Forme du pinceau");
		forme.setMnemonic('O');
		edition.add(forme);
		for (Forme f : formes) {
			JMenuItem formeMenu = new JMenuItem(f.toString());
			formeMenu.setName(f.toString());
			formeMenu.addActionListener(menuListener);
			forme.add(formeMenu);
		}
		JMenu couleur = new JMenu("Couleur du pinceau");
		couleur.setMnemonic('C');
		edition.add(couleur);
		JMenuItem bleu = new JMenuItem("Bleu");
		bleu.setName("Bleu");
		bleu.addActionListener(menuListener);
		couleur.add(bleu);
		JMenuItem noir = new JMenuItem("Noir");
		noir.setName("Noir");
		noir.addActionListener(menuListener);
		couleur.add(noir);
		JMenuItem rouge = new JMenuItem("Rouge");
		rouge.setName("Rouge");
		rouge.addActionListener(menuListener);
		couleur.add(rouge);
		JMenuItem vert = new JMenuItem("Vert");
		vert.setName("Vert");
		vert.addActionListener(menuListener);
		couleur.add(vert);
		JMenuItem palette = new JMenuItem("Palette de Couleur");
		palette.setName("PaletteCouleur");
		palette.addActionListener(menuListener);
		couleur.add(palette);

		this.setJMenuBar(barreMenu);
	}

	/**
	 * Initialisation de la barre d'outils
	 */
	private void initBarreOutils() {
		Forme[] formes = Forme.values();
		JToolBar barreOutils = new JToolBar();

		for (Forme f : formes) {
			JButton bForme = new JButton(new ImageIcon(f.getAdresseIcon()));
			bForme.setName(f.toString());
			bForme.addActionListener(menuListener);
			barreOutils.add(bForme);
		}

		barreOutils.addSeparator();

		JButton bPalette = new JButton(new ImageIcon("images/palette.png"));
		bPalette.setName("PaletteCouleur");
		bPalette.addActionListener(menuListener);
		barreOutils.add(bPalette);

		JButton bBleu = new JButton(new ImageIcon("images/bleu.png"));
		bBleu.setName("Bleu");
		bBleu.addActionListener(menuListener);
		barreOutils.add(bBleu);
		JButton bNoir = new JButton(new ImageIcon("images/noir.png"));
		bNoir.setName("Noir");
		bNoir.addActionListener(menuListener);
		barreOutils.add(bNoir);
		JButton bRouge = new JButton(new ImageIcon("images/rouge.png"));
		bRouge.setName("Rouge");
		bRouge.addActionListener(menuListener);
		barreOutils.add(bRouge);
		JButton bVert = new JButton(new ImageIcon("images/vert.png"));
		bVert.setName("Vert");
		bVert.addActionListener(menuListener);
		barreOutils.add(bVert);
		contentPane.add(barreOutils, BorderLayout.NORTH);
	}
}
