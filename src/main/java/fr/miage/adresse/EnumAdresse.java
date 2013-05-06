package fr.miage.adresse;

public class EnumAdresse {

	enum typeAdresse{Personnel, Fax, Entreprise, Autre};
	enum typeLieux{Rue, Chemin, Avenue, Lieu_dit, Zone_Artisanale, Impasse, Zone_Industrielle, Autre};
	enum typeVisibilite{Public, Prive};
	
	public enum typeNomDomaine {
		gmail("gmail.com"), hotmail("hotmail.fr"), etu("etu.univ-nantes.fr");
		
	
		private final String valeur;
    
		private typeNomDomaine(String valeur) {
            this.valeur = valeur;
		}

		public String getValeur() {
			return this.valeur;
		}
	}
}