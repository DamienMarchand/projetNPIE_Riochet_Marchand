/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

public class Ville {

    private String nomVille;
    private int codePostal;

    public Ville(String nomVille, int codePostal) {
        super();
        this.nomVille = nomVille;
        this.codePostal = codePostal;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String afficherVilleComplete() {
        return this.getCodePostal() + " " + this.getNomVille();
    }
}