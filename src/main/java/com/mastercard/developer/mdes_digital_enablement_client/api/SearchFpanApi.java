package com.mastercard.developer.mdes_digital_enablement_client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.mastercard.developer.mdes_digital_enablement_client.ApiCallback;
import com.mastercard.developer.mdes_digital_enablement_client.ApiClient;
import com.mastercard.developer.mdes_digital_enablement_client.ApiException;
import com.mastercard.developer.mdes_digital_enablement_client.ApiResponse;
import com.mastercard.developer.mdes_digital_enablement_client.Configuration;
import com.mastercard.developer.mdes_digital_enablement_client.Pair;

public class SearchFpanApi {
    private ApiClient localVarApiClient;

    public SearchFpanApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchFpanApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteDigitization
     * @param searchFpanRequestSchema Contains the details of the request message.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchPan(SearchFPANRequest searchFpanRequestSchema, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = searchFpanRequestSchema;

        // create path and map variables
        String localVarPath = "zapp/pba/fpans/searches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchFpanValidateBeforeCall(SearchFPANRequest fpanSearchRequestSchema, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchPan(fpanSearchRequestSchema, _callback);
        return localVarCall;

    }

    /**
     * Used to delete one or more Tokens. The API is limited to 10 Tokens per request.
     * This API is used to delete one or more Tokens.  The API is limited to 10 Tokens per request. MDES will coordinate the deactivation of the Tokens and notify any relevant parties that the Tokens have now been deactivated. 
     * @param fpanSearchRequestSchema Contains the details of the request message.  (optional)
     * @return DeleteResponseSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public SearchFPANResponse searchFpan(SearchFPANRequest fpanSearchRequestSchema) throws ApiException {
        ApiResponse<SearchFPANResponse> localVarResp = searchFpanWithHttpInfo(fpanSearchRequestSchema);
        return localVarResp.getData();
    }

    /**
     * Used to delete one or more Tokens. The API is limited to 10 Tokens per request.
     * This API is used to delete one or more Tokens.  The API is limited to 10 Tokens per request. MDES will coordinate the deactivation of the Tokens and notify any relevant parties that the Tokens have now been deactivated. 
     * @param fpanSearchRequestSchema Contains the details of the request message.  (optional)
     * @return ApiResponse&lt;DeleteResponseSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchFPANResponse> searchFpanWithHttpInfo(SearchFPANRequest fpanSearchRequestSchema) throws ApiException {
       okhttp3.Call localVarCall = searchFpanValidateBeforeCall(fpanSearchRequestSchema, null);
        Type localVarReturnType = new TypeToken<SearchFPANResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Used to delete one or more Tokens. The API is limited to 10 Tokens per request. (asynchronously)
     * This API is used to delete one or more Tokens.  The API is limited to 10 Tokens per request. MDES will coordinate the deactivation of the Tokens and notify any relevant parties that the Tokens have now been deactivated. 
     * @param fpanSearchRequestSchema Contains the details of the request message.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fpanSearchAsync(SearchFPANRequest fpanSearchRequestSchema, final ApiCallback<SearchFPANResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchFpanValidateBeforeCall(fpanSearchRequestSchema, _callback);
        Type localVarReturnType = new TypeToken<SearchFPANResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }


}
