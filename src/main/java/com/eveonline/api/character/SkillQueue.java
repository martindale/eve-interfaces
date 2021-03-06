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
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;
import com.eveonline.constants.SkillLevel;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface SkillQueue<S extends SkillQueue.Skill> extends ApiListResult<S> {

	interface Skill extends ApiResult {

		/**
		 * @return in which position is this skill
		 */
		int getQueuePosition();

		/**
		 * @return the skill's typeID
		 */
		long getTypeId();

		/**
		 * @return which level will be trained
		 */
		SkillLevel getLevel();

		/**
		 * @return skillpoints before the skill is trained
		 */
		int getStartSkillPoints();

		/**
		 * @return skillpoints after the skill is trained
		 */
		int getEndSkillPoints();

		/**
		 * @return when the skill will start to train
		 */
		Date getStartTime();

		/**
		 * @return when the skill is trained
		 */
		Date getEndTime();

	}

}
