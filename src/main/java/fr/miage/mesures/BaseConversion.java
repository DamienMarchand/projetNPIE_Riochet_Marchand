package fr.miage.mesures;

import java.util.Map;

public class BaseConversion {
	Map<Unite, Map<Unite,Quantite>> base;

	public BaseConversion(Map<Unite, Map<Unite, Quantite>> base) {
		super();
		this.base = base;
	}
	
	public void ajoutUnite(Unite u){
		base.put(u, null);
	}
	
	public Map<Unite, Map<Unite, Quantite>> getBase() {
		return base;
	}

	public void setBase(Map<Unite, Map<Unite, Quantite>> base) {
		this.base = base;
	}
}