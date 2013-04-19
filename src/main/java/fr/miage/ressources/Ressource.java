/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.datatypes.ressources;

/**
 *
 * @author E063762G
 */
public class Ressource {
String nomRessource;
TypeRessource typeRessource;

    public enum TypeRessource {

        temporelle("Temporelle"), humaine("Humaine"), materielle("Matérielle");
        private final String valeur;

        private TypeRessource(String valeur) {
            this.valeur = valeur;
        }

        public String getValeur() {
            return this.valeur;
        }
    }
}
