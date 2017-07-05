# DefaultApi

All URIs are relative to *https://api.curator.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFeedPosts**](DefaultApi.md#listFeedPosts) | **GET** /feeds/{feedId}/posts | 


<a name="listFeedPosts"></a>
# **listFeedPosts**
> ListFeedPostsResponse listFeedPosts(feedId, limit, offset, networkId, sourceType, status)



Get collection of Posts for a Feed 

### Example
```java
// Import classes:
//import com.mallorcasoftware.curatorioclient.ApiClient;
//import com.mallorcasoftware.curatorioclient.ApiException;
//import com.mallorcasoftware.curatorioclient.Configuration;
//import com.mallorcasoftware.curatorioclient.auth.*;
//import com.mallorcasoftware.curatorioclient.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyQueryParam
ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
APIKeyQueryParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyQueryParam.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String feedId = "feedId_example"; // String | Feed API Key or Feed Public Key
Integer limit = 56; // Integer | Limits the number of posts returned - defaults to 25, max is 100
Integer offset = 56; // Integer | Page offset - used to paginate through the results
Integer networkId = 56; // Integer | Filter by specific Network ID
Integer sourceType = 56; // Integer | Filter by specific Source Type ID
Integer status = 56; // Integer | Filter by specific Post status
try {
    ListFeedPostsResponse result = apiInstance.listFeedPosts(feedId, limit, offset, networkId, sourceType, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listFeedPosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **String**| Feed API Key or Feed Public Key |
 **limit** | **Integer**| Limits the number of posts returned - defaults to 25, max is 100 | [optional]
 **offset** | **Integer**| Page offset - used to paginate through the results | [optional]
 **networkId** | **Integer**| Filter by specific Network ID | [optional]
 **sourceType** | **Integer**| Filter by specific Source Type ID | [optional]
 **status** | **Integer**| Filter by specific Post status | [optional]

### Return type

[**ListFeedPostsResponse**](ListFeedPostsResponse.md)

### Authorization

[APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

