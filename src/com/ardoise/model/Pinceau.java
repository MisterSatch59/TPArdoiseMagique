package com.ardoise.model;

import java.awt.Color;

public class Pinceau {
	// Permet de gérer les caractéristique du pinceau : couleur, taille et forme
	private Color couleur;
	private int taille;
	private Forme forme;

	// création d'un pinceau de base
	public Pinceau() {
		couleur = Color.BLACK;
		taille = 10;
		forme = Forme.ROND;
	}

	// modifier la couleur du pinceau
	public void setCouleur(Color nCouleur) {
		this.couleur = nCouleur;
	}

	// modifier la forme du pinceau
	public void setForme(Forme nForme) {
		this.forme = nForme;
	}

	// modifier la taille du pinceau
	public void setTaille(int nTaille) {
		this.taille = nTaille;
	}

	public Forme getForme() {
		return forme;
	}

	public Color getCouleur() {
		return couleur;
	}

	public int getTaille() {
		return taille;
	}

}
