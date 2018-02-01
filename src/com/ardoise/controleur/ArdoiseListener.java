package com.ardoise.controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import com.ardoise.model.ModelArdoise;

public class ArdoiseListener implements MouseMotionListener {

	private ModelArdoise model;

	public ArdoiseListener(ModelArdoise model) {
		this.model = model;
	}

	public void mouseDragged(MouseEvent e) {
		model.ajouterPoint(e.getX(), e.getY());
	}

	public void mouseMoved(MouseEvent e) {
		// Il ne se passe rien...
	}

}
