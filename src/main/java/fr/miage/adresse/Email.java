/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

import fr.miage.adresse.EnumAdresse.*;


/**
 *
 * @author E063762G
 */
public class Email {
	
    public Email(String adresse, typeNomDomaine nomDomaine, typeAdresse type) {
		super();
		this.adresse = adresse;
		this.nomDomaine = nomDomaine;
		this.type = type;
	}
    
private String adresse;
    private typeNomDomaine nomDomaine;
    private typeAdresse type;
    
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public typeNomDomaine getNomDomaine() {
		return nomDomaine;
	}
	public void setNomDomaine(typeNomDomaine nomDomaine) {
		this.nomDomaine = nomDomaine;
	}
	public typeAdresse getType() {
		return type;
	}
	public void setType(typeAdresse type) {
		this.type = type;
	}
	
	public String afficherAdresseMailComplete() {
		return this.adresse+this.nomDomaine.getValeur();
	}
}
