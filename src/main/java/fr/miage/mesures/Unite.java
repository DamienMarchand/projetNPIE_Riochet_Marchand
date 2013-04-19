/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.datatypes.mesures;

/**
 *
 * @author E063762G
 */
public class Unite {
    String nomUnite;
    String abreviation;
    Domaine domaine;
    
    public enum Domaine{
        distance("Distance"), volume("Volume"), temperature("Température"), pression("Pression"), autre("Autre");
        
        private final String valeur;
        
        private Domaine(String valeur) {
                this.valeur = valeur;
        }

        public String getValeur() {
		return this.valeur;
	}
    }
    
    

 
    
}
