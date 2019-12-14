/*
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.2.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mdes_digital_enablement_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mastercard.developer.mdes_digital_enablement_client.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-05T10:20:27.908+05:30[Asia/Calcutta]")
public class ErrorsResponse {
  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "errorDescription";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private String errorDescription;

  public static final String SERIALIZED_NAME_RESPONSE_HOST = "responseHost";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HOST)
  private String responseHost;

  public static final String SERIALIZED_NAME_RESPONSE_ID = "responseId";
  @SerializedName(SERIALIZED_NAME_RESPONSE_ID)
  private String responseId;

  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Error errors;


  public ErrorsResponse errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * __CONDITIONAL__&lt;br&gt; Returned in the event of an error and contains the reason the operation failed. Only use if errors object is not present. &lt;br&gt; __Max Length: 32__ 
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "__CONDITIONAL__<br> Returned in the event of an error and contains the reason the operation failed. Only use if errors object is not present. <br> __Max Length: 32__ ")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public ErrorsResponse errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * __CONDITIONAL__&lt;br&gt; Returned in the event of an error and contains a description of why the operation failed. Only use if errors object is not present. &lt;br&gt; __Max Length: 32__  
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "__CONDITIONAL__<br> Returned in the event of an error and contains a description of why the operation failed. Only use if errors object is not present. <br> __Max Length: 32__  ")

  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public ErrorsResponse responseHost(String responseHost) {
    
    this.responseHost = responseHost;
    return this;
  }

   /**
   * The MasterCard host that originated the request. Future calls in the same conversation may be routed to this host.  
   * @return responseHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "site2.payment-app-provider.com", value = "The MasterCard host that originated the request. Future calls in the same conversation may be routed to this host.  ")

  public String getResponseHost() {
    return responseHost;
  }


  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }


  public ErrorsResponse responseId(String responseId) {
    
    this.responseId = responseId;
    return this;
  }

   /**
   * Unique identifier for the response. 
   * @return responseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Unique identifier for the response. ")

  public String getResponseId() {
    return responseId;
  }


  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }


  public ErrorsResponse errors(Error errors) {
    
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getErrors() {
    return errors;
  }


  public void setErrors(Error errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsResponse errorsResponse = (ErrorsResponse) o;
    return Objects.equals(this.errorCode, errorsResponse.errorCode) &&
        Objects.equals(this.errorDescription, errorsResponse.errorDescription) &&
        Objects.equals(this.responseHost, errorsResponse.responseHost) &&
        Objects.equals(this.responseId, errorsResponse.responseId) &&
        Objects.equals(this.errors, errorsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription, responseHost, responseId, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsResponse {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

