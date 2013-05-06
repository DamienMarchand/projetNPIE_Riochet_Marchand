/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.datatypes.temporel;

import java.util.Date;

/**
 *
 * @author E063762G
 */
public class EvenementRecurrent {
	private Date dateDebut;
	private int recursivite; // temps entre chaque evenement
	private int nbFois; // nombre de fois que l'evenement se repete

	public EvenementRecurrent(Date dateDebut, int recursivite, int nbFois) {
		super();
		this.dateDebut = dateDebut;
		this.recursivite = recursivite;
		this.nbFois = nbFois;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getRecursivite() {
		return recursivite;
	}

	public void setRecursivite(int recursivite) {
		this.recursivite = recursivite;
	}

	public int getNbFois() {
		return nbFois;
	}

	public void setNbFois(int nbFois) {
		this.nbFois = nbFois;
	}   
}