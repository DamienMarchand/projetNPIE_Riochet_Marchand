/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.mesures;

/**
 *
 * @author E063762G
 */
public class Unite {

    private String nomUnite;
    private String abreviation;
    private TypeMesure domaine;

    public Unite(String nomUnite, String abreviation, TypeMesure domaine) {
        super();
        this.nomUnite = nomUnite;
        this.abreviation = abreviation;
        this.domaine = domaine;
    }

    public String getNomUnite() {
        return nomUnite;
    }

    public void setNomUnite(String nomUnite) {
        this.nomUnite = nomUnite;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public TypeMesure getDomaine() {
        return domaine;
    }

    public void setDomaine(TypeMesure domaine) {
        this.domaine = domaine;
    }
}