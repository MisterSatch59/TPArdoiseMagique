package com.ardoise.vue;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.ardoise.controleur.ArdoiseListener;
import com.ardoise.model.ModelArdoise;
import com.ardoise.model.Point;
import com.ardoise.observer.Observateur;

/**
 * <b>La class Panneau permet de gérer l'affichage du dessin</b>
 * <br/>Elle hérite de JPanel
 * 
 * @author Oltenos
 * @version 1
 * @see JPanel
 */
class Panneau extends JPanel implements Observateur {
	/**
	 * Liste des Point du dessin
	 * 
	 * @see Point
	 */
	private List<Point> dessin = new ArrayList<Point>();

	/**
	 * Constructeur de Panneau
	 * 
	 * @param model
	 *            Modèle associé à l'ardoise
	 */
	public Panneau(ModelArdoise model) {
		super();
		model.addObservateur(this);
		this.addMouseMotionListener(new ArdoiseListener(model));
		this.addMouseListener(new ArdoiseListener(model));
	}

	/**
	 * Réalisation du dessin
	 */
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		for (Point p : dessin) {
			g.setColor(p.getPinceau().getCouleur());
			switch (p.getPinceau().getForme()) {
			case CARRE:
				g.fillRect(p.getPosX(), p.getPosY(), p.getPinceau().getTaille(), p.getPinceau().getTaille());
				break;

			default:
				g.fillOval(p.getPosX(), p.getPosY(), p.getPinceau().getTaille(), p.getPinceau().getTaille());
				break;
			}
		}
	}

	/**
	 * Mise à jour du dessin
	 */
	public void update(List<Point> dessin) {
		this.dessin = dessin;
		this.repaint();
	}

}
