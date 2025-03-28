# OrganizationManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**organizationsGet**](OrganizationManagementApi.md#organizationsGet) | **GET** /organizations | Get all organizations |
| [**organizationsIdDelete**](OrganizationManagementApi.md#organizationsIdDelete) | **DELETE** /organizations/{id} | Delete an organization |
| [**organizationsIdGet**](OrganizationManagementApi.md#organizationsIdGet) | **GET** /organizations/{id} | Get details of an organization |
| [**organizationsIdPut**](OrganizationManagementApi.md#organizationsIdPut) | **PUT** /organizations/{id} | Update an organization |
| [**organizationsPost**](OrganizationManagementApi.md#organizationsPost) | **POST** /organizations | Create a new organization or department |


<a id="organizationsGet"></a>
# **organizationsGet**
> List&lt;Organization&gt; organizationsGet()

Get all organizations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    try {
      List<Organization> result = apiInstance.organizationsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of organizations |  -  |

<a id="organizationsIdDelete"></a>
# **organizationsIdDelete**
> organizationsIdDelete(id)

Delete an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.organizationsIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsIdDelete");
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
| **204** | Organization deleted successfully |  -  |

<a id="organizationsIdGet"></a>
# **organizationsIdGet**
> Organization organizationsIdGet(id)

Get details of an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      Organization result = apiInstance.organizationsIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsIdGet");
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

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization details |  -  |

<a id="organizationsIdPut"></a>
# **organizationsIdPut**
> organizationsIdPut(id, organizationUpdate)

Update an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    Integer id = 56; // Integer | 
    OrganizationUpdate organizationUpdate = new OrganizationUpdate(); // OrganizationUpdate | 
    try {
      apiInstance.organizationsIdPut(id, organizationUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsIdPut");
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
| **organizationUpdate** | [**OrganizationUpdate**](OrganizationUpdate.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization updated successfully |  -  |

<a id="organizationsPost"></a>
# **organizationsPost**
> Organization organizationsPost(organizationCreate)

Create a new organization or department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    OrganizationCreate organizationCreate = new OrganizationCreate(); // OrganizationCreate | 
    try {
      Organization result = apiInstance.organizationsPost(organizationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsPost");
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
| **organizationCreate** | [**OrganizationCreate**](OrganizationCreate.md)|  | |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Organization created successfully |  -  |

