/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

import fr.miage.adresse.EnumAdresse.typeLieux;

public class Lieux {

    int numero;
    typeLieux type;
    String nom;
    
    public Lieux(int numero, typeLieux type, String nom) {
		super();
		this.numero = numero;
		this.type = type;
		this.nom = nom;
	}
    
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public typeLieux getType() {
		return type;
	}
	public void setType(typeLieux type) {
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String afficherLieuxComplet() {
		return this.getNumero()+" "+this.getType()+" "+this.getNom();
	}
   
}