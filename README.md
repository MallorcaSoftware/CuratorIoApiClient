# curatorioclient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.mallorcasoftware</groupId>
    <artifactId>curatorioclient</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mallorcasoftware:curatorioclient:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/curatorioclient-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mallorcasoftware.curatorioclient.*;
import com.mallorcasoftware.curatorioclient.auth.*;
import com.mallorcasoftware.curatorioclient.model.*;
import com.mallorcasoftware.curatorioclient.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.curator.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**listFeedPosts**](docs/DefaultApi.md#listFeedPosts) | **GET** /feeds/{feedId}/posts | 


## Documentation for Models

 - [FeedPost](docs/FeedPost.md)
 - [ListFeedPostsResponse](docs/ListFeedPostsResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIKeyQueryParam

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



