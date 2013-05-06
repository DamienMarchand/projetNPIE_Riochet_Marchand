/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ressources;

/**
 *
 * @author E063762G
 */
public class Allocation {
	private Tache tache;
	private Ressource ressource;
	
	public Allocation(Tache tache, Ressource ressource) {
		super();
		this.tache = tache;
		this.ressource = ressource;
	}
	
	public Tache getTache() {
		return tache;
	}
	
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	
	public Ressource getRessource() {
		return ressource;
	}
	
	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}
}