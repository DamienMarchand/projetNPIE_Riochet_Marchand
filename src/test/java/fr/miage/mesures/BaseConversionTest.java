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
package fr.miage.mesures;

import java.util.HashMap;
import java.util.Map;
import junit.framework.TestCase;

/**
 *
 * @author E063762G
 */
public class BaseConversionTest extends TestCase {

    HashMap<Unite, Map<Unite, Quantite>> b = new HashMap<Unite, Map<Unite, Quantite>>();
    BaseConversion baseConv = new BaseConversion(b);

    public BaseConversionTest(String testName) {
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

    public void testSetBase() {
        baseConv.setBase(null);
        assertNull(baseConv.getBase());
    }

    public void testAjoutUnite() {
        Unite metre = new Unite("metre", "m", TypeMesure.distance);
        baseConv.ajoutUnite(metre);
        assertTrue(baseConv.getBase().containsKey(metre));
    }

    public void testGetQuantite() {
        Unite metre = new Unite("metre", "m", TypeMesure.distance);
        Unite centiMetre = new Unite("centimetre", "cm", TypeMesure.distance);
        baseConv.ajoutUnite(metre);
        baseConv.getBase().get(metre).put(centiMetre, new Quantite(100));
        Quantite q = baseConv.getQuantite(metre, centiMetre);
        assertEquals(q.getValeur(), 100);
    }
}
