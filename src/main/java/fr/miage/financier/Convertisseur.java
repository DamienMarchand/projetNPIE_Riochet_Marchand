/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.financier;

import java.util.List;

/**
 *
 * @author E063762G
 */
public class Convertisseur {
    private List<TauxConversion> listeTaux;
    
    public void actualiserTaux(Devise d){
        
    }
    
    public void ajoutTaux(TauxConversion t){
        listeTaux.add(t);
    }
    
    public void actualisationTotale(){
        //foreach de actualiserTaux
    }
}