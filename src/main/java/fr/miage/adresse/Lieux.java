/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

/**
 *
 * @author E063762G
 */
public class Lieux {

    int numero;
    TypeLieux typeLieux;
    String nomLieux;

    public enum TypeLieux {

        rue("Rue"), boulevard("Boulevard"), avenue("Avenue"), impasse("Impasse"), lieuxDits("Lieux-dits"), chemin("Chemin");
        private final String valeur;

        private TypeLieux(String valeur) {
            this.valeur = valeur;
        }

        public String getValeur() {
            return this.valeur;
        }
    }
}
