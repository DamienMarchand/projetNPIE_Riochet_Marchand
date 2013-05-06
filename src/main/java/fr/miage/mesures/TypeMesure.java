package fr.miage.mesures;

public enum TypeMesure{
    distance("Distance"), volume("Volume"), temperature("Température"), pression("Pression"), autre("Autre");
    
    private final String valeur;
    
    private TypeMesure(String valeur) {
            this.valeur = valeur;
    }

    public String getValeur() {
	return this.valeur;
    }
}