/*
 * Copyright (c) 2011 - 2012 Adrian Vielsack, Christof Urbaczek, Florian Rosenthal, Michael Hoff, Moritz Lüdecke, Philip Flohr.
 *
 * This file is part of Sudowars.
 *
 * Sudowars is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Sudowars is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Sudowars.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 * initial API and implementation:
 * Adrian Vielsack
 * Christof Urbaczek
 * Florian Rosenthal
 * Michael Hoff
 * Moritz Lüdecke
 * Philip Flohr
 */

package org.sudowars.test;

import android.test.InstrumentationTestRunner;
import android.test.InstrumentationTestSuite;

import org.sudowars.Controller.Local.ReadyButtonGroupTest;
import org.sudowars.Controller.Local.ReadyButtonTest;
import junit.framework.TestSuite;

public class Runner extends InstrumentationTestRunner {

    @Override
    public TestSuite getAllTests() {
        InstrumentationTestSuite suite = new InstrumentationTestSuite(this);

        suite.addTestSuite(ReadyButtonTest.class);
        suite.addTestSuite(ReadyButtonGroupTest.class);

        return suite;
    }

    @Override
    public ClassLoader getLoader() {
        return Runner.class.getClassLoader();
    }
}