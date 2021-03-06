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

package hu.bme.mit.sette.snippets.inputs._1_basic.B5_functions;

import hu.bme.mit.sette.common.snippets.SnippetInputContainer;

public final class B5a2_CallPrivate_Inputs {
    private B5a2_CallPrivate_Inputs() {
        throw new UnsupportedOperationException("Static class");
    }

    public static SnippetInputContainer simple() {
        SnippetInputContainer inputs = new SnippetInputContainer(2);

        inputs.addByParameters(1, 1);
        inputs.addByParameters(-1, 1);
        inputs.addByParameters(1, -1);
        inputs.addByParameters(-1, -1);
        inputs.addByParameters(0, 0);

        return inputs;
    }

    public static SnippetInputContainer useReturnValue() {
        SnippetInputContainer inputs = new SnippetInputContainer(2);

        inputs.addByParameters(1, 1);
        inputs.addByParameters(-1, 1);
        inputs.addByParameters(1, -1);
        inputs.addByParameters(-1, -1);
        inputs.addByParameters(0, 0);

        return inputs;
    }

    public static SnippetInputContainer conditionalCall() {
        SnippetInputContainer inputs = new SnippetInputContainer(3);

        inputs.addByParameters(1, 1, true);
        inputs.addByParameters(-1, 1, true);
        inputs.addByParameters(1, -1, true);
        inputs.addByParameters(-1, -1, true);
        inputs.addByParameters(0, 0, true);
        inputs.addByParameters(0, 0, false);

        return inputs;
    }
}
