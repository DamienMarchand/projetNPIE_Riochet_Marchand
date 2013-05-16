package fr.miage.mesures;

import java.util.Map;

public class BaseConversion {
	Map<Unite, Map<Unite,Quantite>> base;

	public BaseConversion(Map<Unite, Map<Unite, Quantite>> base) {
		super();
		this.base = base;
	}
	
	public void ajoutUnite(Unite unite){
		base.put(unite, null);
	}
	
	public Map<Unite, Map<Unite, Quantite>> getBase() {
		return base;
	}

	public void setBase(Map<Unite, Map<Unite, Quantite>> base) {
		this.base = base;
	}
        
        public Map<Unite,Quantite> getBaseValeur(Unite uniteDepart){
            return base.get(uniteDepart);
        }
        
        public Quantite getQuantite(Unite uniteDepart, Unite uniteArrivee){            
            return getBaseValeur(uniteDepart).get(uniteArrivee); //NOPMD
        }
}