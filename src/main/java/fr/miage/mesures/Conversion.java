/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.mesures;

/**
 *
 * @author E063762G
 */
public class Conversion {

    private Quantite quantite;
    private Unite uniteDepart;
    private Unite uniteArrivee;
    private BaseConversion base;
	
	public Conversion(Quantite quantite, Unite uniteDepart, Unite uniteArrivee,
			BaseConversion base) {
		super();
		this.quantite = quantite;
		this.uniteDepart = uniteDepart;
		this.uniteArrivee = uniteArrivee;
		this.base = base;
	}

	public int convertir(){
		return getValeurQuantite(base.getQuantite(uniteDepart,uniteArrivee))*getValeurQuantite(quantite);
	}
    
        public int getValeurQuantite(Quantite quantite){
            return quantite.getValeur();
        }
        
	public Quantite getQuantite() {
		return quantite;
	}
	
	public void setQuantite(Quantite quantite) {
		this.quantite = quantite;
	}
	
	public Unite getUniteDepart() {
		return uniteDepart;
	}
	
	public void setUniteDepart(Unite uniteDepart) {
		this.uniteDepart = uniteDepart;
	}
	
	public Unite getUniteArrivee() {
		return uniteArrivee;
	}
	
	public void setUniteArrivee(Unite uniteArrivee) {
		this.uniteArrivee = uniteArrivee;
	}
	
	public BaseConversion getBase() {
		return base;
	}
	
	public void setBase(BaseConversion base) {
		this.base = base;
	}
}