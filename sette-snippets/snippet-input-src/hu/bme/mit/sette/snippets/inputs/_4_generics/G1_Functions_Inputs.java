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

package hu.bme.mit.sette.snippets.inputs._4_generics;

import hu.bme.mit.sette.common.snippets.SnippetInputContainer;

public final class G1_Functions_Inputs {
    private G1_Functions_Inputs() {
        throw new UnsupportedOperationException("Static class");
    }

    public static SnippetInputContainer guessType() {
        SnippetInputContainer inputs = new SnippetInputContainer(1);

        inputs.addByParameters((Object) null);
        inputs.addByParameters(1);
        inputs.addByParameters(1.0);
        inputs.addByParameters(new Object());

        return inputs;
    }

    public static SnippetInputContainer guessTypeAndUse() {
        SnippetInputContainer inputs = new SnippetInputContainer(1);

        inputs.addByParameters((Object) null);
        inputs.addByParameters(1);
        inputs.addByParameters(-1);
        inputs.addByParameters(1.0);
        inputs.addByParameters(-1.0);
        inputs.addByParameters(new Object());

        return inputs;
    }

    public static SnippetInputContainer guessTypeWithExtends() {
        SnippetInputContainer inputs = new SnippetInputContainer(1);

        inputs.addByParameters((Object) null);
        inputs.addByParameters(1);
        inputs.addByParameters(1.0);

        return inputs;
    }

    public static SnippetInputContainer guessTypeWithExtendsAndUse() {
        SnippetInputContainer inputs = new SnippetInputContainer(1);

        inputs.addByParameters((Object) null);
        inputs.addByParameters(1);
        inputs.addByParameters(-1);
        inputs.addByParameters(1.0);
        inputs.addByParameters(-1.0);

        return inputs;
    }
}