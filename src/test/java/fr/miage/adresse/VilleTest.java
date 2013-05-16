/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.adresse;

import junit.framework.TestCase;

/**
 *
 * @author E063762G
 */
public class VilleTest extends TestCase {
    
    private Ville ville = new Ville("Nantes",44000);
    
    public VilleTest(String testName) {
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

    public void testGetNomVille(){
        String nomVille = ville.getNomVille();
        assertNotNull(nomVille); 
    }
    
    public void testGetCodePostal(){
        int codePostal = ville.getCodePostal();
        assertNotNull(codePostal); 
    }
    
    public void testSetNomVille(){
        ville.setNomVille("Paris");
        assertEquals("Erreur de nom de ville ",ville.getNomVille(), "Paris");
    }
    
    public void testSetCodePostal(){
        ville.setCodePostal(75000);
        assertEquals("Erreur de code postal ",ville.getCodePostal(), 75000);
    }    
    
    public void testAfficherVilleComplete(){
        String villeComplete = ville.afficherVilleComplete();
        assertNotNull(villeComplete);
        assertEquals("Erreur d'affichage ", villeComplete, "44000 Nantes");
    }
}
