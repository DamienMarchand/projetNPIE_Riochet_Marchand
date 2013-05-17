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

import fr.miage.adresse.EnumAdresse.typeLieux;
import junit.framework.TestCase;

/**
 *
 * @author E063762G
 */
public class LieuxTest extends TestCase {

    private Lieux lieux = new Lieux(10, EnumAdresse.typeLieux.Rue, "du Commerce");

    public LieuxTest(String testName) {
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
        lieux.setNumero(20);
        assertEquals(lieux.getNumero(), 20);
    }

    public void testSetNom() {
        lieux.setNom("de la gare");
        assertEquals(lieux.getNom(), "de la gare");
    }

    public void testSetType() {
        lieux.setType(typeLieux.Avenue);
        assertEquals(lieux.getType(), typeLieux.Avenue);
    }
}
