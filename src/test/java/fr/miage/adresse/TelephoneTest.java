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
import fr.miage.adresse.EnumAdresse.typeVisibilite;
import junit.framework.TestCase;

/**
 *
 * @author E063762G
 */
public class TelephoneTest extends TestCase {

    private Telephone tel = new Telephone(0606060606, typeAdresse.Personnel, typeVisibilite.Public);

    public TelephoneTest(String testName) {
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

    public void testSetNumero() {
        tel.setNumero(0202020202);
        assertEquals(tel.getNumero(), 0202020202);
    }

    public void testSetTypeNumero() {
        tel.setTypeNumero(typeAdresse.Entreprise);
        assertEquals(tel.getTypeNumero(), typeAdresse.Entreprise);
    }

    public void testSetVisibilite() {
        tel.setVisibilite(typeVisibilite.Prive);
        assertEquals(tel.getVisibilite(), typeVisibilite.Prive);
    }
}
