package com.ardoise.model;

public class Point {
	// Permet l'enregistrement des points : coordonnés et pinceau utilisé (forme,
	// taille et couleur)
	private int PosX = 0;
	private int PosY = 0;
	private Pinceau pinceau = new Pinceau();

	// Création d'un points avec parametres
	public Point(int x, int y, Pinceau p) {
		this.PosX = x;
		this.PosY = y;
		this.pinceau = new Pinceau();
		pinceau.setCouleur(p.getCouleur());
		pinceau.setForme(p.getForme());
		pinceau.setTaille(p.getTaille());
	}

	public int getPosX() {
		return PosX;
	}

	public int getPosY() {
		return PosY;
	}

	public Pinceau getPinceau() {
		return pinceau;
	}

}
