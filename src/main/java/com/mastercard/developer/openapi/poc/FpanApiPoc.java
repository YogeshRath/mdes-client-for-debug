package com.mastercard.developer.openapi.poc;

import com.mastercard.developer.mdes_digital_enablement_client.ApiClient;
import com.mastercard.developer.mdes_digital_enablement_client.ApiException;
import com.mastercard.developer.mdes_digital_enablement_client.Configuration;
import com.mastercard.developer.mdes_digital_enablement_client.api.SearchFPANRequest;
import com.mastercard.developer.mdes_digital_enablement_client.api.SearchFPANResponse;
import com.mastercard.developer.mdes_digital_enablement_client.api.SearchFpanApi;

public class FpanApiPoc {
	
	

	public static void main(String[] args) {
		
		fpanSearch();
	}
	
	public static void fpanSearch() {
	
		ApiClient defaultClient = Configuration.getDefaultApiClient();
	    defaultClient.setBasePath("https://api.mastercard.com/");

	    SearchFpanApi apiInstance = new SearchFpanApi(defaultClient);
	    SearchFPANRequest searchFPANRequestSchema = new SearchFPANRequest();
	    searchFPANRequestSchema.setAhiId("000980");
	    searchFPANRequestSchema.setAccountId("ZAPPCONSU13Afk0wcdbS");
	    searchFPANRequestSchema.setFiConsumerId("IN93ICIC00225678462641007461564");
	    searchFPANRequestSchema.setIca("355365");
	    try {
	      SearchFPANResponse result = apiInstance.searchFpan(searchFPANRequestSchema);
	      System.out.println(result);
	    } catch (ApiException e) {
	      System.err.println("Exception when calling SearchApi:searchmethod");
	      System.err.println("Status code: " + e.getCode());
	      System.err.println("Reason: " + e.getResponseBody());
	      System.err.println("Response headers: " + e.getResponseHeaders());
	      e.printStackTrace();
	    }
	
	}
}
