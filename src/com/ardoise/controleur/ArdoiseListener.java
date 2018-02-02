package com.ardoise.controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.ardoise.model.ModelArdoise;

public class ArdoiseListener implements MouseMotionListener, MouseListener {

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

	public void mouseClicked(MouseEvent arg0) {
		// Il ne se passe rien...
	}

	public void mouseEntered(MouseEvent arg0) {
		// Il ne se passe rien...
	}

	public void mouseExited(MouseEvent arg0) {
		// Il ne se passe rien...
	}

	public void mousePressed(MouseEvent e) {
		model.ajouterPoint(e.getX(), e.getY());
	}

	public void mouseReleased(MouseEvent arg0) {
		// Il ne se passe rien...
	}

}
