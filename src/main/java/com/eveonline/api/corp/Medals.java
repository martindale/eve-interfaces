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

package com.eveonline.api.corp;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface Medals<M extends Medals.Medal> extends ApiListResult<M> {

    interface Medal extends ApiResult {

        /**
         * @return unique id for the medal.
         */
        long getId();

        /**
         * @return In-game display title.
         */
        String getTitle();

        /**
         * @return Description what the medal is for.
         */
        String getDescription();

        /**
         * @return Creator character of the medal.
         */
        long getCreatorId();

        /**
         * @return date of creation.
         */
        Date getCreated();

    }
}
