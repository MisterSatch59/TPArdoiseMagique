package com.ardoise.model;

/**
 * 
 * <b> Cette énumération regroupe les formes possibles du pinceau </b>
 * 
 * @author Oltenos
 * @version 1
 */
public enum Forme {
	CARRE("Carré", "images/carre.png"), ROND("Rond", "images/rond.png");
	/**
	 * nom de la forme
	 */
	String nom;
	/**
	 * adresse de l'icone représentant le forme dans la barre d'outils
	 */
	String adresseIcon;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 *            nom de la forme
	 * @param adresseIcon
	 *            adresse de l'icone représentant le forme dans la barre d'outils
	 */
	Forme(String nom, String adresseIcon) {
		this.nom = nom;
		this.adresseIcon = adresseIcon;
	}

	/**
	 * retourne le nom de la forme
	 * 
	 * @return nom de la forme
	 */
	public String toString() {
		return nom;
	}

	/**
	 * retourne l'adresse de l'icone représentant le forme dans la barre d'outils
	 * 
	 * @return adresse de l'icone représentant le forme dans la barre d'outils
	 */
	public String getAdresseIcon() {
		return adresseIcon;
	}
}
