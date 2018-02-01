package com.ardoise.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.ardoise.observer.Observable;
import com.ardoise.observer.Observateur;

public class ModelArdoise implements Observable {
	private Pinceau pinceau;// Pinceau actif (couleur, forme taille)
	private List<Point> dessin;// liste des points enregistré

	// liste des observateurs :
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();

	// Ardoise intiale
	public ModelArdoise() {
		this.pinceau = new Pinceau();
		this.dessin = new ArrayList<Point>();
	}

	// Changement de couleur du pinceau
	public void changerCouleur(Color c) {
		pinceau.setCouleur(c);
	}

	// Changement de forme du pinceau
	public void changerForme(Forme f) {
		pinceau.setForme(f);
	}

	// changement de taille du pinceau
	public void changerTaille(int t) {
		pinceau.setTaille(t);
	}

	// Remise è zéro de l'ardoise
	public void reset() {
		this.dessin = new ArrayList<Point>();
		updateObservateur();
	}

	// Ajouter un Point au dessin
	public void ajouterPoint(int x, int y) {
		Point p = new Point(x, y, pinceau);
		dessin.add(p);
		updateObservateur();
	}

	// Ajout d'un observateur
	public void addObservateur(Observateur obs) {
		this.listObservateur.add(obs);
	}

	// supprimer un observateur
	public void delObservateur() {
		this.listObservateur = new ArrayList<Observateur>();
	}

	// Mise à jour des observateurs
	public void updateObservateur() {
		for (Observateur obs : this.listObservateur)
			obs.update(dessin);
	}

	public Forme getForme() {
		return pinceau.getForme();
	}

}
