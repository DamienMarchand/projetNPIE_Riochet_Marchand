/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

/**
 *
 * @author E063762G
 */

import java.util.List;

public class Adresse {
	private Lieux lieux;
	private Ville ville;
	private Pays pays;
	private List<Telephone> listTel;
	private List<Email> listMail;
	
	public Adresse(Lieux lieux, Ville ville, Pays pays,
			List<Telephone> listTel, List<Email> listMail) {
		super();
		this.lieux = lieux;
		this.ville = ville;
		this.pays = pays;
		this.listTel = listTel;
		this.listMail = listMail;
	}

	public Lieux getLieux() {
		return lieux;
	}

	public void setLieux(Lieux lieux) {
		this.lieux = lieux;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public List<Telephone> getListTel() {
		return listTel;
	}

	public void setListTel(List<Telephone> listTel) {
		this.listTel = listTel;
	}

	public List<Email> getListMail() {
		return listMail;
	}

	public void setListMail(List<Email> listMail) {
		this.listMail = listMail;
	}
	
	public void ajoutEmail(Email newEmail) {
		this.listMail.add(newEmail);
	}
	
	public void ajoutTel(Telephone newTel) {
		this.listTel.add(newTel);
	}
	
	public String afficherAdresseComplete() {
		return this.getLieux().afficherLieuxComplet()+" "+this.getVille().afficherVilleComplete()+" "+this.getPays().getNomPays();
	}
	
	public String afficherMails() {
		String temp = "";
		for(Email email: listMail) {
			temp += email.afficherAdresseMailComplete()+"|";
		}
		return temp;
	}
	
	public String afficherTels() {
		String temp = "";
		for(Telephone tel: listTel) {
			temp += tel.getNumero()+"|";
		}
		return temp;
	}
}
