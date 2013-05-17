package fr.miage.ressources;

public enum TypeRessource {

    temporelle("Temporelle"), humaine("Humaine"), materielle("Matérielle");
    private final String valeur;

    private TypeRessource(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return this.valeur;
    }
}