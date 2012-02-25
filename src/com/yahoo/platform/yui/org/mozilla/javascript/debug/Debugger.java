/* -*- Mode: java; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Rhino code, released
 * May 6, 1999.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1997-2000
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Norris Boyd
 *
 * Alternatively, the contents of this file may be used under the terms of
 * the GNU General Public License Version 2 or later (the "GPL"), in which
 * case the provisions of the GPL are applicable instead of those above. If
 * you wish to allow use of your version of this file only under the terms of
 * the GPL and not to allow others to use your version of this file under the
 * MPL, indicate your decision by deleting the provisions above and replacing
 * them with the notice and other provisions required by the GPL. If you do
 * not delete the provisions above, a recipient may use your version of this
 * file under either the MPL or the GPL.
 *
 * ***** END LICENSE BLOCK ***** */

// API class

package com.yahoo.platform.yui.org.mozilla.javascript.debug;

import com.yahoo.platform.yui.org.mozilla.javascript.Context;

/**
Interface to implement if the application is interested in receiving debug
information.
*/
public interface Debugger {

/**
Called when compilation of a particular function or script into internal
bytecode is done.

@param cx current Context for this thread
@param fnOrScript object describing the function or script
@param source the function or script source
*/
    void handleCompilationDone(Context cx, DebuggableScript fnOrScript,
                               String source);

/**
Called when execution entered a particular function or script.

@return implementation of DebugFrame which receives debug information during
        the function or script execution or null otherwise
*/
    DebugFrame getFrame(Context cx, DebuggableScript fnOrScript);
}
