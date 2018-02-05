package com.ardoise.model;

/**
 * <b>Point décrit les caractéristiques d'un point du dessin (Coordonnées et
 * pinceau utilisé)</b>
 * 
 * @author Oltenos
 * @version 1
 */
public class Point {
	/**
	 * Abscisse du point
	 */
	private int PosX = 0;
	/**
	 * Ordonnées du point
	 */
	private int PosY = 0;
	/**
	 * Pinceau utilisé pour le point
	 * 
	 * @see Pinceau
	 */
	private Pinceau pinceau = new Pinceau();

	/**
	 * Constructeur d'un Point
	 * 
	 * @param x
	 *            Abscisse du point
	 * @param y
	 *            Ordonnées du point
	 * @param p
	 *            Pinceau utilisé pour le point
	 * @see Pinceau
	 */
	public Point(int x, int y, Pinceau p) {
		this.PosX = x;
		this.PosY = y;
		this.pinceau = new Pinceau();
		pinceau.setCouleur(p.getCouleur());
		pinceau.setForme(p.getForme());
		pinceau.setTaille(p.getTaille());
	}

	/**
	 * Retourne l'abscisse du Point
	 * 
	 * @return abscisse du Point
	 */
	public int getPosX() {
		return PosX;
	}

	/**
	 * Retourne l'ordonnée du Point
	 * 
	 * @return ordonnée du Point
	 */
	public int getPosY() {
		return PosY;
	}

	/**
	 * retourne le Pinceau utilisé pour le point
	 * 
	 * @return Pinceau utilisé pour le point
	 * @see Pinceau
	 */
	public Pinceau getPinceau() {
		return pinceau;
	}

}
