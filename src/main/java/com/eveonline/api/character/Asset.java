/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface Asset extends ApiResult {

	int getItemId();

	int getTypeId();

	int getQuantity();

	int getFlag();

	boolean isSingleton();

	/**
	 * @author Tobias Sarnowski
	 */
	interface Container extends Asset {

		int getLocationId();

		ApiListResult<Asset> getContainingAssets();

	}
}
