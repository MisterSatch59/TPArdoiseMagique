package com.ardoise.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.ardoise.observer.Observable;
import com.ardoise.observer.Observateur;

/**
 * <b>Modèle de l'ardoise</b>
 * 
 * @author Oltenos
 * @version 1
 */
public class ModelArdoise implements Observable {
	/**
	 * Pinceau actif (couleur, forme taille)
	 * 
	 * @see Pinceau
	 */
	private Pinceau pinceau;
	/**
	 * Liste des points enregistrés
	 */
	private List<Point> dessin;

	/**
	 * liste des observateurs
	 */
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();

	/**
	 * Construteur initialisant les parametres de l'ardoise initiale (Pinceau de
	 * base et dessin vide)
	 */
	public ModelArdoise() {
		this.pinceau = new Pinceau();
		this.dessin = new ArrayList<Point>();
	}

	/**
	 * Changement de la couleur du pinceau
	 * 
	 * @param c
	 *            Nouvelle couleur
	 */
	public void changerCouleur(Color c) {
		pinceau.setCouleur(c);
	}

	/**
	 * Changement de la forme du pinceau
	 * 
	 * @param f
	 *            Nouvelle forme
	 * @see Forme
	 */
	public void changerForme(Forme f) {
		pinceau.setForme(f);
	}

	/**
	 * changement de la taille du pinceau
	 * 
	 * @param t
	 *            Nouvelle taille
	 */
	public void changerTaille(int t) {
		pinceau.setTaille(t);
	}

	/**
	 * Reinitialisation du dessin
	 */
	public void reset() {
		this.dessin = new ArrayList<Point>();
		updateObservateur();
	}

	/**
	 * Ajouter un Point au dessin
	 * 
	 * @param x
	 *            abscisse du point
	 * @param y
	 *            ordonnée du point
	 */
	public void ajouterPoint(int x, int y) {
		int i = pinceau.getTaille() / 2;// pour centrer le point sur (x,y)
		Point p = new Point(x - i, y - i, pinceau);
		dessin.add(p);
		updateObservateur();
	}

	/**
	 * Ajout d'un observateur
	 */
	public void addObservateur(Observateur obs) {
		this.listObservateur.add(obs);
	}

	/**
	 * supprimer un observateur
	 */
	public void delObservateur() {
		this.listObservateur = new ArrayList<Observateur>();
	}

	/**
	 * Mise à jour des observateurs
	 */
	public void updateObservateur() {
		for (Observateur obs : this.listObservateur)
			obs.update(dessin);
	}

	/**
	 * retourne la forme active
	 * 
	 * @return forme active
	 * @see Forme
	 */
	public Forme getForme() {
		return pinceau.getForme();
	}

	/**
	 * retourne le pinceau actif
	 * 
	 * @return pinceau actif
	 * @see Pinceau
	 */
	public Pinceau getPinceau() {
		return pinceau;
	}

}
