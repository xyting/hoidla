/*
 * hoidla: various algorithms for Big Data solutions
 * Author: Pranab Ghosh
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */


package org.hoidla.stream;

/**
 * @author pranab
 *
 */
/**
 * @author pranab
 *
 */
public class UniqueItems {

	/**
	 * Context data for creating appropriate frequent counter object
	 * @author pranab
	 *
	 */
	public static class Context {
		public  String strategy;
		public double errorLimit;
		public double errorProbLimit; 
	}
	
	/**
	 * @author pranab
	 *
	 */
	public interface UniqueItemsCounter {
		
		public long getUnqueCount();
		
		public void add(Object value);
		
		public void clear();
		
	}

}
