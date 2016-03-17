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
 * Copyright 2014-2016
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
package hu.bme.mit.sette.snippets.inputs._9_reflection;

import hu.bme.mit.sette.common.snippets.SnippetInputContainer;
import hu.bme.mit.sette.snippets._9_reflection.dependencies.MyClassChild;
import hu.bme.mit.sette.snippets._9_reflection.dependencies.MyClassParent;

public final class R2b_MethodWithLoading_Inputs {
    private R2b_MethodWithLoading_Inputs() {
        throw new UnsupportedOperationException("Static class");
    }

    public static SnippetInputContainer guessMethodByNameAndDeclaringClass() {
        SnippetInputContainer sic = new SnippetInputContainer(2);
        sic.addByParameters(null, null);
        sic.addByParameters(MyClassParent.class.getName(), "value");
        sic.addByParameters(Object.class.getName(), "toString");
        return sic;
    }

    public static SnippetInputContainer guessMethodByNameAndReturnType() {
        SnippetInputContainer sic = new SnippetInputContainer(2);
        sic.addByParameters(null, null);
        sic.addByParameters(MyClassChild.class.getName(), "value");
        sic.addByParameters(Object.class.getName(), "toString");
        return sic;
    }

    public static SnippetInputContainer guessMethodByNameAndParameter() {
        SnippetInputContainer sic = new SnippetInputContainer(2);
        sic.addByParameters(null, null);
        sic.addByParameters(MyClassParent.class.getName(), "value");
        sic.addByParameters(Object.class.getName(), "toString");
        return sic;
    }

    public static SnippetInputContainer guessMethodByAnnotation() {
        SnippetInputContainer sic = new SnippetInputContainer(2);
        sic.addByParameters(null, null);
        sic.addByParameters(MyClassParent.class.getName(), "value");
        sic.addByParameters(MyClassChild.class.getName(), "value");
        sic.addByParameters(Object.class.getName(), "toString");
        return sic;
    }
}