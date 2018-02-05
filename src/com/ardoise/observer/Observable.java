package com.ardoise.observer;

/**
 * <b>Interface du Patern Strategy pour attribuer le comportement Observable</b>
 * 
 * @author Oltenos
 * @version 1
 */
public interface Observable {

	/**
	 * Ajoute un observateur
	 * 
	 * @param obs
	 *            Observateur
	 * @see Observateur
	 */
	public void addObservateur(Observateur obs);

	/**
	 * Mise à jour des Observateur
	 * 
	 * @see Observateur
	 */
	public void updateObservateur();

	/**
	 * Supprimer les Observateur
	 * 
	 * @see Observateur
	 */
	public void delObservateur();
}
