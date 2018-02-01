package com.ardoise.controleur;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

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
		if (e.getSource().getClass() == JMenuItem.class) {
			s = ((JMenuItem) (e.getSource())).getText();
		}
		switch (s) {
		case "Rond":
			model.changerForme(Forme.ROND);
			break;
		case "Carré":
			model.changerForme(Forme.CARRE);
			break;
		case "Vert":
			model.changerCouleur(Color.GREEN);
			break;
		case "Rouge":
			model.changerCouleur(Color.RED);
			break;
		case "Bleu":
			model.changerCouleur(Color.BLUE);
			break;
		case "Effacer":
			model.reset();
			break;
		case "Quitter":
			System.exit(0);
			break;
		default:
			System.out.println("Erreur dans MenuListener");
			break;

		}

	}

}
