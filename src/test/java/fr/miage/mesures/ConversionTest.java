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
public class ConversionTest extends TestCase {

    Quantite quantite = new Quantite(2);
    Unite unitDep = new Unite("litre", "l", TypeMesure.volume);
    Unite unitArr = new Unite("pinte", "pinte", TypeMesure.volume);
    HashMap<Unite, Map<Unite, Quantite>> b = new HashMap<Unite, Map<Unite, Quantite>>();
    BaseConversion baseConv = new BaseConversion(b);
    Conversion conv = new Conversion(quantite, unitDep, unitArr, baseConv);

    public ConversionTest(String testName) {
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

    public void testConvertir() {
        baseConv.ajoutUnite(unitDep);
        baseConv.getBase().get(unitDep).put(unitArr, new Quantite(250));

        int res = conv.convertir();
        assertEquals(res, 500);
    }

    public void testSetQuantite() {
        Quantite q = new Quantite(400);
        q.setValeur(500);
        conv.setQuantite(q);
        assertEquals(conv.getQuantite(), q);
    }

    public void testSetUniteDepart() {
        Unite unit = new Unite("Demi", "demi", TypeMesure.volume);
        conv.setUniteDepart(unit);
        assertEquals(conv.getUniteDepart(), unit);
    }

    public void testSetUniteArrivee() {
        Unite unit = new Unite("Demi", "demi", TypeMesure.volume);
        conv.setUniteArrivee(unit);
        assertEquals(conv.getUniteArrivee(), unit);
    }

    public void testSetBase() {
        conv.setBase(null);
        assertNull(conv.getBase());
    }
}
