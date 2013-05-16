/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

import fr.miage.adresse.EnumAdresse.*;


public class Telephone {
    
    private int numero;
    private typeAdresse typeNumero;
    private typeVisibilite visibilite;
    
	public Telephone(int numero, typeAdresse typeNumero,
			typeVisibilite visibilite) {
		super();
		this.numero = numero;
		this.typeNumero = typeNumero;
		this.visibilite = visibilite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public typeAdresse getTypeNumero() {
		return typeNumero;
	}

	public void setTypeNumero(typeAdresse typeNumero) {
		this.typeNumero = typeNumero;
	}

	public typeVisibilite getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(typeVisibilite visibilite) {
		this.visibilite = visibilite;
	}

  }