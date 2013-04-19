/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.financier;

import java.util.Date;
import java.util.Map;

/**
 *
 * @author E063762G
 */
public class TauxConversion {
    Devise deviseDepart;
    Map<Devise, Map<Date,Integer>> historique; //devise arrivée avec le taux à une date donnée
    
    public void actualiserTaux(){
        //appel à forex API
    }
}
