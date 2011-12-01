/*****************************************************************************
 * Copyright (C) 2003-2011 PicoContainer Committers. All rights reserved.    *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *                                                                           *
 *****************************************************************************/

package org.picocontainer;

import java.lang.reflect.Method;

@SuppressWarnings("serial")
public class PicoLifecycleException extends PicoException {

    private final Method method;
    private final Object instance;

    public PicoLifecycleException(final Method method, final Object instance, final Throwable cause) {
        super(cause);
        this.method = method;
        this.instance = instance;
    }

    public Method getMethod() {
        return method;
    }

    public Object getInstance() {
        return instance;
    }

    public String getMessage() {
        return "PicoLifecycleException: method '" + method + "', instance '"+ instance + ", " + super.getMessage();
    }

}
