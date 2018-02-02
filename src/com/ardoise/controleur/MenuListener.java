package com.ardoise.controleur;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import com.ardoise.model.Forme;
import com.ardoise.model.ModelArdoise;

public class MenuListener implements ActionListener {

	private ModelArdoise model;

	public MenuListener(ModelArdoise model) {
		this.model = model;
	}

	// Action des boutons du menu
	public void actionPerformed(ActionEvent e) {
		String s = "";
		s = ((JComponent) (e.getSource())).getName();
		Forme[] formes = Forme.values();
		switch (s) {
		case "Vert":
			model.changerCouleur(Color.GREEN);
			break;
		case "Rouge":
			model.changerCouleur(Color.RED);
			break;
		case "Bleu":
			model.changerCouleur(Color.BLUE);
			break;
		case "Noir":
			model.changerCouleur(Color.BLACK);
			break;
		case "PaletteCouleur":
			Color c = JColorChooser.showDialog((JComponent) (e.getSource()), "Choix de la couleur du pinceau",
					model.getPinceau().getCouleur());
			model.changerCouleur(c);
			break;
		case "Effacer":
			model.reset();
			break;
		case "Quitter":
			System.exit(0);
			break;
		default:
			for (Forme f : formes) {
				if(f.toString()==s) {
					model.changerForme(f);
				}
			}
			break;
		}
	}

}
