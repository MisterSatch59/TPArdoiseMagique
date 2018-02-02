package com.ardoise.model;

public enum Forme {
	CARRE("Carré", "images/carre.png"),
	ROND("Rond", "images/rond.png");

	String nom;
	String adresseIcon;

	Forme(String nom, String adresseIcon) {
		this.nom = nom;
		this.adresseIcon = adresseIcon;
	}

	public String toString() {
		return nom;
	}

	public String getAdresseIcon() {
		return adresseIcon;
	}
}
