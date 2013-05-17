/*
 * Copyright (C) 2013 E063762G
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.miage.adresse;

import fr.miage.adresse.EnumAdresse.typeAdresse;
import fr.miage.adresse.EnumAdresse.typeNomDomaine;
import junit.framework.TestCase;

/**
 *
 * @author E063762G
 */
public class EmailTest extends TestCase {

    private Email email = new Email("Tony", typeNomDomaine.gmail, typeAdresse.Entreprise);

    public EmailTest(String testName) {
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

    public void testGetAdresse() {
        String adresse = email.getAdresse();
        assertEquals(adresse, "Tony");
    }

    public void testSetAdresse() {
        email.setAdresse("Damien");
        assertEquals(email.getAdresse(), "Damien");
    }

    public void testGetNomDomaine() {
        assertNotNull(email.getNomDomaine());
    }

    public void testSetNomDomaine() {
        email.setNomDomaine(typeNomDomaine.hotmail);
        assertEquals(email.getNomDomaine(), typeNomDomaine.hotmail);
    }

    public void testGetType() {
        assertNotNull(email.getType());
    }

    public void testSetType() {
        email.setType(typeAdresse.Fax);
        assertEquals(email.getType(), typeAdresse.Fax);
    }

    public void testAfficherAdresseMailComplete() {
        String adresseMail = email.afficherAdresseMailComplete();
        assertEquals(adresseMail, "Tony@gmail.com");
    }
}
