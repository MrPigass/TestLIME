# CategoriesApi

All URIs are relative to *http://localhost:9090/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCategories**](CategoriesApi.md#getCategories) | **GET** /categories | Get all categories |
| [**getCategoriesById**](CategoriesApi.md#getCategoriesById) | **GET** /categories/{id} | Get categorie by id |


<a name="getCategories"></a>
# **getCategories**
> List&lt;Categories&gt; getCategories()

Get all categories

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9090/api");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    try {
      List<Categories> result = apiInstance.getCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategories");
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

[**List&lt;Categories&gt;**](Categories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

<a name="getCategoriesById"></a>
# **getCategoriesById**
> Categories getCategoriesById(id)

Get categorie by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9090/api");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer id = 56; // Integer | Categorie id
    try {
      Categories result = apiInstance.getCategoriesById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoriesById");
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
| **id** | [**Integer**](.md)| Categorie id | |

### Return type

[**Categories**](Categories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

