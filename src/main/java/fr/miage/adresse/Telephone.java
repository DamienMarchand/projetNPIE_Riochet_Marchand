/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

/**
 *
 * @author E063762G
 */
public class Telephone {
    
    int numero;
    TypeNumero typeNumero;
    Visibilite visibilite;

    public enum TypeNumero {

        fax("Fax"), domicile("Domicile"), portable("Portable"), travail("Travail");
        private final String valeur;

        private TypeNumero(String valeur) {
            this.valeur = valeur;
        }

        public String getValeur() {
            return this.valeur;
        }
    }

    public enum Visibilite {

        publique("Publique"), privee("Privee");
        private final String valeur;

        private Visibilite(String valeur) {
            this.valeur = valeur;
        }

        public String getValeur() {
            return this.valeur;
        }
    }
}
