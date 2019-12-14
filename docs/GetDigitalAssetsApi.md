# GetDigitalAssetsApi

All URIs are relative to *https://api.mastercard.com/mdes*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDigitalAssets**](GetDigitalAssetsApi.md#getDigitalAssets) | **POST** /digitization/#env/1/0/getDigitalAssets | Used to retrieve digital assets derived from a funding PAN.


<a name="getDigitalAssets"></a>
# **getDigitalAssets**
> GetDigitalAssetsResponseSchema getDigitalAssets(encryptedPayload)

Used to retrieve digital assets derived from a funding PAN.

Get Digital Asset API is used to retrieve digital assets from a funding pan.  

### Example
```java
// Import classes:
import com.mastercard.developer.mdes_digital_enablement_client.ApiClient;
import com.mastercard.developer.mdes_digital_enablement_client.ApiException;
import com.mastercard.developer.mdes_digital_enablement_client.Configuration;
import com.mastercard.developer.mdes_digital_enablement_client.models.*;
import com.mastercard.developer.mdes_digital_enablement_client.api.GetDigitalAssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mdes");

    GetDigitalAssetsApi apiInstance = new GetDigitalAssetsApi(defaultClient);
    GetDigitalAssetsRequestSchema encryptedPayload = new GetDigitalAssetsRequestSchema(); // GetDigitalAssetsRequestSchema | Contains an encrypted CardAccountData object. 
    try {
      GetDigitalAssetsResponseSchema result = apiInstance.getDigitalAssets(encryptedPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetDigitalAssetsApi#getDigitalAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedPayload** | [**GetDigitalAssetsRequestSchema**](GetDigitalAssetsRequestSchema.md)| Contains an encrypted CardAccountData object.  | [optional]

### Return type

[**GetDigitalAssetsResponseSchema**](GetDigitalAssetsResponseSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Contains the details of the response message.  |  -  |
**0** | unexpected error  |  -  |

