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
package com.eveonline.api.map;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface FacWarSystems<S extends FacWarSystems.SolarSystem> extends ApiListResult<S> {

	interface SolarSystem extends ApiResult {

		/**
		 * @return the solar system's ID
		 */
		long getId();

		/**
		 * @return the solar system's name
		 */
		String getName();

		/**
		 * @return a non-zero ID if the occupying faction is not the sovereign faction.
		 */
		long getOccupyingFactionId();

		/**
		 * @return the occupying faction's name
		 */
		String getOccupyingFactionName();

		/**
		 * @return if the system is contested by another faction
		 */
		boolean isContested();

	}

}
