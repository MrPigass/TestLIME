# LotsApi

All URIs are relative to *http://localhost:9090/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLotById**](LotsApi.md#getLotById) | **GET** /lots/{id} | Get lot by id |


<a name="getLotById"></a>
# **getLotById**
> Lot getLotById(id)

Get lot by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9090/api");

    LotsApi apiInstance = new LotsApi(defaultClient);
    Integer id = 56; // Integer | Lot id
    try {
      Lot result = apiInstance.getLotById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LotsApi#getLotById");
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
| **id** | [**Integer**](.md)| Lot id | |

### Return type

[**Lot**](Lot.md)

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

