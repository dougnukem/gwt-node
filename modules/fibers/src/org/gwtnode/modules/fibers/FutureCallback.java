/*
 * Copyright 2011 Chad Retz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtnode.modules.fibers;

import org.gwtnode.core.JavaScriptFunctionArguments;
import org.gwtnode.core.JavaScriptFunctionWrapper;
import org.gwtnode.core.node.NodeJsError;

/**
 * A wrapper for a future callback
 *
 * @author Chad Retz
 */
public abstract class FutureCallback<T> extends JavaScriptFunctionWrapper {

    @Override
    public final void call(JavaScriptFunctionArguments args) {
        NodeJsError error = args.get(0);
        T value = null;
        if (args.length() > 1) {
            value = args.get(1);
        }
        onCallback(error, value);
    }

    public abstract void onCallback(NodeJsError error, T value);
}
