/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

import fr.miage.adresse.EnumAdresse.typeAdresse;
import fr.miage.adresse.EnumAdresse.typeLieux;
import fr.miage.adresse.EnumAdresse.typeNomDomaine;
import fr.miage.adresse.EnumAdresse.typeVisibilite;
import fr.miage.financier.Devise;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author E063762G
 */
public class AdresseTest extends TestCase {

    private Lieux lieux = new Lieux(10, EnumAdresse.typeLieux.Rue, "du Commerce");
    private Ville ville = new Ville("Nantes", 44000);
    private Pays pays = new Pays("France", "Europe", new Devise("Euro", "Europe"));
    private List<Telephone> listTel = new ArrayList<Telephone>();
    private List<Email> listEmail = new ArrayList<Email>();
    private Adresse adresse = new Adresse(lieux, ville, pays, listTel, listEmail);

    public AdresseTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAjoutEmail() {
        Email email = new Email("damien", typeNomDomaine.gmail, typeAdresse.Personnel);
        assertEquals(adresse.getListMail().size(), 0);
        adresse.ajoutEmail(email);
        assertEquals(adresse.getListMail().size(), 1);
    }

    public void testAjoutTel() {
        Telephone tel = new Telephone(0606060606, typeAdresse.Personnel, typeVisibilite.Prive);
        assertEquals(adresse.getListTel().size(), 0);
        adresse.ajoutTel(tel);
        assertEquals(adresse.getListTel().size(), 1);
    }

    public void testAfficherAdresseComplete() {
        String adresseComplete = adresse.afficherAdresseComplete();
        assertNotNull(adresseComplete);
    }

    public void testAfficherMails() {
        String mails = adresse.afficherMails();
        assertNotNull(mails);
        assertEquals("", mails);
    }

    public void testAfficherTels() {
        String tels = adresse.afficherTels();
        assertNotNull(tels);
        assertEquals("", tels);
    }
    
    public void testSetLieux(){
        Lieux l = new Lieux(5, typeLieux.Rue, "de la gare");
        adresse.setLieux(l);
        assertEquals(adresse.getLieux(), l);
    }

    public void testSetPays(){
        Pays p = new Pays("France", "Europe", new Devise("Euro","europe"));
        adresse.setPays(p);
        assertEquals(adresse.getPays(), p);
    }
}
