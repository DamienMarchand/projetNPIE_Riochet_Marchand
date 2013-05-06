/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ressources;

/**
 *
 * @author E063762G
 */
public class Ressource {
	private String nomRessource;
	private TypeRessource typeRessource;
	
	public Ressource(String nomRessource, TypeRessource typeRessource) {
		super();
		this.nomRessource = nomRessource;
		this.typeRessource = typeRessource;
	}
	public String getNomRessource() {
		return nomRessource;
	}
	
	public void setNomRessource(String nomRessource) {
		this.nomRessource = nomRessource;
	}
	
	public TypeRessource getTypeRessource() {
		return typeRessource;
	}
	
	public void setTypeRessource(TypeRessource typeRessource) {
		this.typeRessource = typeRessource;
	}
}