/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.eve;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiService;

/**
 * @author Tobias Sarnowski
 */
public interface ErrorListApi extends ApiService {

	ApiListResult<Error> getErrors();

}