/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

import fr.miage.financier.Devise;

public class Pays {

    String nomPays;
    String continent;
    Devise monnaie;
    
	public Pays(String nomPays, String continent, Devise monnaie) {
		super();
		this.nomPays = nomPays;
		this.continent = continent;
		this.monnaie = monnaie;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Devise getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(Devise monnaie) {
		this.monnaie = monnaie;
	}
    
}