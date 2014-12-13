/**
 * Copyright 2007-2011 Alexei Samoylov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.ideaflux.selfdecrypter;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class IdeafluxURLStreamHandlerFactory implements URLStreamHandlerFactory {
	private static final RecursiveJarURLStreamHandler recursiveJarFactory = new RecursiveJarURLStreamHandler();
	public URLStreamHandler createURLStreamHandler(String protocol) {
		return recursiveJarFactory;
	}
}
