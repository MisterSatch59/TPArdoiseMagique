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

class Panneau extends JPanel implements Observateur {

	private static final long serialVersionUID = -6478879529334101282L;

	private List<Point> dessin = new ArrayList<Point>();
	ModelArdoise model;

	public Panneau(ModelArdoise model) {
		super();
		this.model = model;
		model.addObservateur(this);
		this.addMouseMotionListener(new ArdoiseListener(model));
		this.addMouseListener(new ArdoiseListener(model));
	}

	// Réalisation du dessin
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		for (Point p : dessin) {
			g.setColor(p.getPinceau().getCouleur());
			switch (model.getForme()) {
			case CARRE:
				g.fillRect(p.getPosX(), p.getPosY(), p.getPinceau().getTaille(), p.getPinceau().getTaille());
				break;

			default:
				g.fillOval(p.getPosX(), p.getPosY(), p.getPinceau().getTaille(), p.getPinceau().getTaille());
				break;
			}
		}
	}

	public void update(List<Point> dessin) {
		this.dessin = dessin;
		this.repaint();
	}

}
