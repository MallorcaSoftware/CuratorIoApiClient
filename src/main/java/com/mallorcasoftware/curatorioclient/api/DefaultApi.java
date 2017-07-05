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

import com.mallorcasoftware.curatorioclient.ApiCallback;
import com.mallorcasoftware.curatorioclient.ApiClient;
import com.mallorcasoftware.curatorioclient.ApiException;
import com.mallorcasoftware.curatorioclient.ApiResponse;
import com.mallorcasoftware.curatorioclient.Configuration;
import com.mallorcasoftware.curatorioclient.Pair;
import com.mallorcasoftware.curatorioclient.ProgressRequestBody;
import com.mallorcasoftware.curatorioclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.mallorcasoftware.curatorioclient.model.ListFeedPostsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for listFeedPosts */
    private com.squareup.okhttp.Call listFeedPostsCall(String feedId, Integer limit, Integer offset, Integer networkId, Integer sourceType, Integer status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'feedId' is set
        if (feedId == null) {
            throw new ApiException("Missing the required parameter 'feedId' when calling listFeedPosts(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/feeds/{feedId}/posts".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "feedId" + "\\}", apiClient.escapeString(feedId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (networkId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "network_id", networkId));
        if (sourceType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source_type", sourceType));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "APIKeyQueryParam" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Get collection of Posts for a Feed 
     * @param feedId Feed API Key or Feed Public Key (required)
     * @param limit Limits the number of posts returned - defaults to 25, max is 100 (optional)
     * @param offset Page offset - used to paginate through the results (optional)
     * @param networkId Filter by specific Network ID (optional)
     * @param sourceType Filter by specific Source Type ID (optional)
     * @param status Filter by specific Post status (optional)
     * @return ListFeedPostsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListFeedPostsResponse listFeedPosts(String feedId, Integer limit, Integer offset, Integer networkId, Integer sourceType, Integer status) throws ApiException {
        ApiResponse<ListFeedPostsResponse> resp = listFeedPostsWithHttpInfo(feedId, limit, offset, networkId, sourceType, status);
        return resp.getData();
    }

    /**
     * 
     * Get collection of Posts for a Feed 
     * @param feedId Feed API Key or Feed Public Key (required)
     * @param limit Limits the number of posts returned - defaults to 25, max is 100 (optional)
     * @param offset Page offset - used to paginate through the results (optional)
     * @param networkId Filter by specific Network ID (optional)
     * @param sourceType Filter by specific Source Type ID (optional)
     * @param status Filter by specific Post status (optional)
     * @return ApiResponse&lt;ListFeedPostsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListFeedPostsResponse> listFeedPostsWithHttpInfo(String feedId, Integer limit, Integer offset, Integer networkId, Integer sourceType, Integer status) throws ApiException {
        com.squareup.okhttp.Call call = listFeedPostsCall(feedId, limit, offset, networkId, sourceType, status, null, null);
        Type localVarReturnType = new TypeToken<ListFeedPostsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get collection of Posts for a Feed 
     * @param feedId Feed API Key or Feed Public Key (required)
     * @param limit Limits the number of posts returned - defaults to 25, max is 100 (optional)
     * @param offset Page offset - used to paginate through the results (optional)
     * @param networkId Filter by specific Network ID (optional)
     * @param sourceType Filter by specific Source Type ID (optional)
     * @param status Filter by specific Post status (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFeedPostsAsync(String feedId, Integer limit, Integer offset, Integer networkId, Integer sourceType, Integer status, final ApiCallback<ListFeedPostsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listFeedPostsCall(feedId, limit, offset, networkId, sourceType, status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListFeedPostsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
