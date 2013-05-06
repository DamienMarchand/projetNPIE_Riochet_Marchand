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
	private List<Telephone> list_tel;
	private List<Email> list_mail;
	
	public Adresse(Lieux lieux, Ville ville, Pays pays,
			List<Telephone> list_tel, List<Email> list_mail) {
		super();
		this.lieux = lieux;
		this.ville = ville;
		this.pays = pays;
		this.list_tel = list_tel;
		this.list_mail = list_mail;
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

	public List<Telephone> getList_tel() {
		return list_tel;
	}

	public void setList_tel(List<Telephone> list_tel) {
		this.list_tel = list_tel;
	}

	public List<Email> getList_mail() {
		return list_mail;
	}

	public void setList_mail(List<Email> list_mail) {
		this.list_mail = list_mail;
	}
	
	public void ajoutEmail(Email newEmail) {
		this.list_mail.add(newEmail);
	}
	
	public void ajoutTel(Telephone newTel) {
		this.list_tel.add(newTel);
	}
	
	public String afficherAdresseComplete() {
		return this.getLieux().afficherLieuxComplet()+" "+this.getVille().afficherVilleComplete()+" "+this.getPays().getNomPays();
	}
	
	public String afficherMails() {
		String temp = "";
		for(Email e: list_mail) {
			temp += e.afficherAdresseMailComplete()+"|";
		}
		return temp;
	}
	
	public String afficherTels() {
		String temp = "";
		for(Telephone t: list_tel) {
			temp += t.getNumero()+"|";
		}
		return temp;
	}
}
