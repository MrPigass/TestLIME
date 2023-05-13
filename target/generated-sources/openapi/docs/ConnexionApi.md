# ConnexionApi

All URIs are relative to *http://localhost:9090/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnexion**](ConnexionApi.md#createConnexion) | **POST** /connexion | Create connexion |


<a name="createConnexion"></a>
# **createConnexion**
> Connexion createConnexion(connexion)

Create connexion

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnexionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9090/api");

    ConnexionApi apiInstance = new ConnexionApi(defaultClient);
    Connexion connexion = new Connexion(); // Connexion | 
    try {
      Connexion result = apiInstance.createConnexion(connexion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnexionApi#createConnexion");
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
| **connexion** | [**Connexion**](Connexion.md)|  | [optional] |

### Return type

[**Connexion**](Connexion.md)

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

