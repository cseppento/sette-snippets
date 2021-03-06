/*
 * SETTE - Symbolic Execution based Test Tool Evaluator
 *
 * SETTE is a tool to help the evaluation and comparison of symbolic execution based test input 
 * generator tools.
 *
 * Budapest University of Technology and Economics (BME)
 *
 * Authors: Lajos Cseppentő <lajos.cseppento@inf.mit.bme.hu>, Zoltán Micskei <micskeiz@mit.bme.hu>
 *
 * Copyright 2014-2015
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except 
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either 
 * express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package hu.bme.mit.sette.snippets._6_others;

import hu.bme.mit.sette.common.annotations.SetteRequiredStatementCoverage;
import hu.bme.mit.sette.common.annotations.SetteSnippetContainer;
import hu.bme.mit.sette.snippets._6_others.dependencies.State;
import hu.bme.mit.sette.snippets.inputs._6_others.Others_Enum_Inputs;

@SetteSnippetContainer(category = "Others", goal = "Check support for anonymous enumerations",
        inputFactoryContainer = Others_Enum_Inputs.class)
public final class Others_Enum {
    private Others_Enum() {
        throw new UnsupportedOperationException("Static class");
    }

    @SetteRequiredStatementCoverage(value = 83)
    public static int enumGuess(State s) {
        if (s == null) {
            return -1;
        } else if (s == State.STARTED) {
            return 1;
        } else if (s == State.PAUSED) {
            return 2;
        } else if (s == State.STOPPED) {
            return 3;
        } else if (s == State.IDLE) {
            return 4;
        } else {
            // impossible
            throw new RuntimeException();
        }
    }

    @SetteRequiredStatementCoverage(value = 80)
    public static int enumGuessString(State s) {
        if (s == null) {
            return -1;
        } else if (s.name().equals("STARTED")) {
            return 1;
        } else if (s.name().equals("PAUSED")) {
            return 2;
        } else if (s.name().equals("STOPPED")) {
            return 3;
        } else if (s.name().equals("IDLE")) {
            return 4;
        } else {
            // impossible
            throw new RuntimeException();
        }
    }

    @SetteRequiredStatementCoverage(value = 80)
    public static int enumGuessOrdinal(State s) {
        if (s == null) {
            return -1;
        } else if (s.ordinal() == 0) {
            return 1;
        } else if (s.ordinal() == 1) {
            return 2;
        } else if (s.ordinal() == 2) {
            return 3;
        } else if (s.ordinal() == 3) {
            return 4;
        } else {
            // impossible
            throw new RuntimeException();
        }
    }

    @SetteRequiredStatementCoverage(value = 84)
    public static int enumSwitch(State s) {
        if (s == null) {
            return -1;
        }

        switch (s) {
            case STARTED:
                return 1;

            case PAUSED:
                return 2;

            case STOPPED:
                return 3;

            case IDLE:
                return 4;

            default:
                // impossible
                throw new RuntimeException();
        }
    }
}
