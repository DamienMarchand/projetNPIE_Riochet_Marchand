/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.financier;

/**
 *
 * @author E063762G
 */
public class Devise {
    private String nomDevise;
    private String zoneEco;

    public void setNomDevise(String nomDevise) {
        this.nomDevise = nomDevise;
    }

    public void setZoneEco(String zoneEco) {
        this.zoneEco = zoneEco;
    }

    public Devise(String nomDevise, String zoneEco) {
        this.nomDevise = nomDevise;
        this.zoneEco = zoneEco;
    }

    public String getNomDevise() {
        return nomDevise;
    }

    public String getZoneEco() {
        return zoneEco;
    }    
}
