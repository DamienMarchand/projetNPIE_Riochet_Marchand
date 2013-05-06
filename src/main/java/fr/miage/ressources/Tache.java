/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ressources;

/**
 *
 * @author E063762G
 */
public class Tache {

	private int numero;
	private String nomTache;
	private String projet;
	
	public Tache(int numero, String nomTache, String projet) {
		super();
		this.numero = numero;
		this.nomTache = nomTache;
		this.projet = projet;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNomTache() {
		return nomTache;
	}
	
	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}
	
	public String getProjet() {
		return projet;
	}
	
	public void setProjet(String projet) {
		this.projet = projet;
	}
	
}