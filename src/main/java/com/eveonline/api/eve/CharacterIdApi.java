/**
 * Copyright 2010 Tobias Sarnowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eveonline.api.eve;

import com.eveonline.api.ApiService;
import com.eveonline.api.exceptions.ApiException;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterIdApi extends ApiService {

	public static final String XMLPATH = "/eve/CharacterId.xml.aspx";


	/**
	 * @param names a list of names you want to resolve
	 * @return the list of IDs for the given names
	 * @throws ApiException if an error occurs
	 */
	CharacterId getCharacterIds(Iterable<String> names) throws ApiException;

}
