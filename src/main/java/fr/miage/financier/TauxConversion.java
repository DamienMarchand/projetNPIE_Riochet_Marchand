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
	private Devise deviseDepart;
	private Map<Devise, Map<Date,Integer>> historique; //devise arrivee avec le taux à une date donnee
    
	public TauxConversion(Devise deviseDepart,
			Map<Devise, Map<Date, Integer>> historique) {
		super();
		this.deviseDepart = deviseDepart;
		this.historique = historique;
	}
	
	public void actualiserTaux(){
        //appel a Google API
    }
	
    public Devise getDeviseDepart() {
		return deviseDepart;
	}

	public void setDeviseDepart(Devise deviseDepart) {
		this.deviseDepart = deviseDepart;
	}

	public Map<Devise, Map<Date, Integer>> getHistorique() {
		return historique;
	}

	public void setHistorique(Map<Devise, Map<Date, Integer>> historique) {
		this.historique = historique;
	}
}