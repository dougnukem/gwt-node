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
package org.gwtnode.core.node.crypto;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The node.js cipher object
 * 
 * @author Chad Retz
 */
public class Cipher extends JavaScriptObject {

    protected Cipher() {
    }
    
    public final native String update(String data) /*-{
        return this.update(data);
    }-*/;
    
    public final native String update(String data, String inputEncoding) /*-{
        return this.update(data, inputEncoding);
    }-*/;
    
    public final native String update(String data, String inputEncoding, String outputEncoding) /*-{
        return this.update(data, inputEncoding, outputEncoding);
    }-*/;
    
    public final native String finalOutput() /*-{
        return this['final']();
    }-*/;
    
    public final native String finalOutput(String outputEncoding) /*-{
        return this['final'](outputEncoding);
    }-*/;
}
