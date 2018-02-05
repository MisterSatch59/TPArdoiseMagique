package com.ardoise.model;

import java.awt.Color;

/**
 * <b>Pinceau décrit les caractéristiques du pinceau (couleur, taille et
 * forme)</b>
 * 
 * @author Oltenos
 * @version 1
 */
public class Pinceau {
	/**
	 * couleur du Pinceau
	 */
	private Color couleur;
	/**
	 * taille du pinceau
	 * 
	 * @see Color
	 */
	private int taille;
	/**
	 * forme du pinceau
	 * 
	 * @see Forme
	 */
	private Forme forme;

	/**
	 * Constructeur permettant la création du pinceau de base : Noir, Rond, Taille
	 * 10
	 */
	public Pinceau() {
		couleur = Color.BLACK;
		taille = 10;
		forme = Forme.ROND;
	}

	/**
	 * Modifie la couleur du pinceau
	 * 
	 * @param nCouleur
	 *            nouvelle couleur
	 * @see Color
	 */
	public void setCouleur(Color nCouleur) {
		this.couleur = nCouleur;
	}

	/**
	 * Modifie la forme du pinceau
	 * 
	 * @param nForme
	 *            nouvelle Forme
	 * @see Forme
	 */
	public void setForme(Forme nForme) {
		Forme[] formes = Forme.values();
		for (Forme f : formes) {
			if (f == nForme)
				this.forme = f;
		}
	}

	/**
	 * Modifie la taille du pinceau
	 * 
	 * @param nTaille
	 *            nouvelle taille
	 */
	public void setTaille(int nTaille) {
		this.taille = nTaille;
	}

	/**
	 * Retourne la forme du pinceau
	 * 
	 * @return forme du pinceau
	 * @see Forme
	 */
	public Forme getForme() {
		return forme;
	}

	/**
	 * Retourne la couleur du pinceau
	 * 
	 * @return couleur du pinceau
	 * @see Color
	 */
	public Color getCouleur() {
		return couleur;
	}

	/**
	 * Retourne la taille du pinceau
	 * 
	 * @return taille du pinceau
	 */
	public int getTaille() {
		return taille;
	}

}
