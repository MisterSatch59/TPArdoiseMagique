package com.ardoise.controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.ardoise.model.ModelArdoise;

/**
 * <b>La classe ArdoiseListener permet la gestion des actions de la souris sur
 * l'ardoise</b> <br />Elle implemente MouseMotionListener et MouseListener.
 * <br />Cette classe permet l'ajout des points au modèle lors du clic et du déplacement de
 * la souris
 * 
 * @see MouseMotionListener
 * @see MouseListener
 * @author Oltenos
 * @version 1
 */
public class ArdoiseListener implements MouseMotionListener, MouseListener {

	/**
	 * Modèle associé à l'ardoise
	 */
	private ModelArdoise model;

	/**
	 * Constructeur avec transmission du modèle associé
	 * 
	 * @param model
	 *            Modèle associé à l'ardoise
	 */
	public ArdoiseListener(ModelArdoise model) {
		this.model = model;
	}

	/**
	 * Ajoute les points au modèle
	 */
	public void mouseDragged(MouseEvent e) {
		model.ajouterPoint(e.getX(), e.getY());
	}

	/**
	 * Aucune action
	 */
	public void mouseMoved(MouseEvent e) {
		// Il ne se passe rien...
	}

	/**
	 * Aucune action
	 */
	public void mouseClicked(MouseEvent arg0) {
		// Il ne se passe rien...
	}

	/**
	 * Aucune action
	 */
	public void mouseEntered(MouseEvent arg0) {
		// Il ne se passe rien...
	}

	/**
	 * Aucune action
	 */
	public void mouseExited(MouseEvent arg0) {
		// Il ne se passe rien...
	}

	/**
	 * Ajoute le point au modèle au début du clic de la souris
	 */
	public void mousePressed(MouseEvent e) {
		model.ajouterPoint(e.getX(), e.getY());
	}

	/**
	 * Aucune action
	 */
	public void mouseReleased(MouseEvent arg0) {
		// Il ne se passe rien...
	}

}
