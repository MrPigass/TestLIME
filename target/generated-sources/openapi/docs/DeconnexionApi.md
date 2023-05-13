# DeconnexionApi

All URIs are relative to *http://localhost:9090/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeconnexion**](DeconnexionApi.md#createDeconnexion) | **POST** /deconnexion | Create deconnexion |


<a name="createDeconnexion"></a>
# **createDeconnexion**
> Deconnexion createDeconnexion(deconnexion)

Create deconnexion

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeconnexionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9090/api");

    DeconnexionApi apiInstance = new DeconnexionApi(defaultClient);
    Deconnexion deconnexion = new Deconnexion(); // Deconnexion | 
    try {
      Deconnexion result = apiInstance.createDeconnexion(deconnexion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeconnexionApi#createDeconnexion");
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
| **deconnexion** | [**Deconnexion**](Deconnexion.md)|  | [optional] |

### Return type

[**Deconnexion**](Deconnexion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

