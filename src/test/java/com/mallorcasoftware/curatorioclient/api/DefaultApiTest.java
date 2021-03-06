/**
 * curator.io client
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.mallorcasoftware.curatorioclient.api;

import com.mallorcasoftware.curatorioclient.ApiException;
import com.mallorcasoftware.curatorioclient.model.ListFeedPostsResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Get collection of Posts for a Feed 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFeedPostsTest() throws ApiException {
        String feedId = null;
        Integer limit = null;
        Integer offset = null;
        Integer networkId = null;
        Integer sourceType = null;
        Integer status = null;
        // ListFeedPostsResponse response = api.listFeedPosts(feedId, limit, offset, networkId, sourceType, status);

        // TODO: test validations
    }
    
}
