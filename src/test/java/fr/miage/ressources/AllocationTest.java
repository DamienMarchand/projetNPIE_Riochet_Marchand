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
package fr.miage.ressources;

import junit.framework.TestCase;

/**
 *
 * @author E063762G
 */
public class AllocationTest extends TestCase {

    Ressource ress = new Ressource("salarie", TypeRessource.humaine);
    Tache tache = new Tache(2, "tache2", "projetNPIE");
    Allocation allocation = new Allocation(null, null);

    public AllocationTest(String testName) {
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

    public void testSetRessource() {
        Ressource r = new Ressource("balayeur", TypeRessource.humaine);
        allocation.setRessource(r);
        assertEquals(allocation.getRessource(), r);
    }

    public void testSetTache() {
        Tache t = new Tache(3, "t3", "projetNPIE");
        allocation.setTache(t);
        assertEquals(allocation.getTache(), t);
    }
}
