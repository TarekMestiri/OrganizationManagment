# UserAssignmentApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**organizationsIdAssignUserUserIdPost**](UserAssignmentApi.md#organizationsIdAssignUserUserIdPost) | **POST** /organizations/{id}/assign-user/{userId} | Assign a user to a department/team |
| [**organizationsIdRemoveUserUserIdDelete**](UserAssignmentApi.md#organizationsIdRemoveUserUserIdDelete) | **DELETE** /organizations/{id}/remove-user/{userId} | Remove a user from a department/team |


<a id="organizationsIdAssignUserUserIdPost"></a>
# **organizationsIdAssignUserUserIdPost**
> organizationsIdAssignUserUserIdPost(id, userId)

Assign a user to a department/team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAssignmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserAssignmentApi apiInstance = new UserAssignmentApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer userId = 56; // Integer | 
    try {
      apiInstance.organizationsIdAssignUserUserIdPost(id, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAssignmentApi#organizationsIdAssignUserUserIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **userId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User assigned successfully |  -  |

<a id="organizationsIdRemoveUserUserIdDelete"></a>
# **organizationsIdRemoveUserUserIdDelete**
> organizationsIdRemoveUserUserIdDelete(id, userId)

Remove a user from a department/team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAssignmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserAssignmentApi apiInstance = new UserAssignmentApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer userId = 56; // Integer | 
    try {
      apiInstance.organizationsIdRemoveUserUserIdDelete(id, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAssignmentApi#organizationsIdRemoveUserUserIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **userId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User removed successfully |  -  |

