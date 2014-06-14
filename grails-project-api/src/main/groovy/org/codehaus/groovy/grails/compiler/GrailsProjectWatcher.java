/*
 * Copyright 2011 SpringSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.groovy.grails.compiler;

import org.codehaus.groovy.grails.plugins.GrailsPluginManager;
import org.codehaus.groovy.grails.project.compiler.*;

/**
 * Watches a Grails project and re-compiles sources when they change or fires events to the pluginManager.
 *
 * @author Graeme Rocher
 * @since 2.0
 * @deprecated Use {@link org.codehaus.groovy.grails.project.compiler.GrailsProjectWatcher} instead
 */
public class GrailsProjectWatcher extends org.codehaus.groovy.grails.project.compiler.GrailsProjectWatcher{
    public GrailsProjectWatcher(org.codehaus.groovy.grails.project.compiler.GrailsProjectCompiler compiler, GrailsPluginManager pluginManager) {
        super(compiler, pluginManager);
    }
}