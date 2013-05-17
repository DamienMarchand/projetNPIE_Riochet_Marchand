/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.financier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author E063762G
 */
public class Convertisseur {

    private List<TauxConversion> listeTaux;

    public Convertisseur() {
        listeTaux = new ArrayList<TauxConversion>();
    }

    public List<TauxConversion> getListeTaux() {
        return listeTaux;
    }

    public void actualiserTaux(Devise devise) {
    }

    public void ajoutTaux(TauxConversion taux) {
        listeTaux.add(taux);
    }

    public void actualisationTotale() {
        //foreach de actualiserTaux
        for (TauxConversion taux : listeTaux) {
            actualiserTaux(taux.getDeviseDepart());
        }
    }
}