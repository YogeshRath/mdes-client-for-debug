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
import com.mastercard.developer.mdes_digital_enablement_client.model.DecisioningData;
import com.mastercard.developer.mdes_digital_enablement_client.model.FundingAccountInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TokenizeRequestSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-05T10:20:27.908+05:30[Asia/Calcutta]")
public class TokenizeRequestSchema {
  public static final String SERIALIZED_NAME_RESPONSE_HOST = "responseHost";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HOST)
  private String responseHost;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_TOKEN_REQUESTOR_ID = "tokenRequestorId";
  @SerializedName(SERIALIZED_NAME_TOKEN_REQUESTOR_ID)
  private String tokenRequestorId;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_INFO = "fundingAccountInfo";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_INFO)
  private FundingAccountInfo fundingAccountInfo;

  public static final String SERIALIZED_NAME_CONSUMER_LANGUAGE = "consumerLanguage";
  @SerializedName(SERIALIZED_NAME_CONSUMER_LANGUAGE)
  private String consumerLanguage;

  public static final String SERIALIZED_NAME_TOKENIZATION_AUTHENTICATION_VALUE = "tokenizationAuthenticationValue";
  @SerializedName(SERIALIZED_NAME_TOKENIZATION_AUTHENTICATION_VALUE)
  private String tokenizationAuthenticationValue;

  public static final String SERIALIZED_NAME_DECISIONING_DATA = "decisioningData";
  @SerializedName(SERIALIZED_NAME_DECISIONING_DATA)
  private DecisioningData decisioningData;


  public TokenizeRequestSchema responseHost(String responseHost) {
    
    this.responseHost = responseHost;
    return this;
  }

   /**
   * \&quot;The host that originated the request. Future calls in the same conversation may be routed to this host. Must be provided as: host[:port][/contextRoot] Where port and contextRoot are optional. If contextRoot is not provided, the default (per the URL Scheme) is assumed and must be used.\&quot; 
   * @return responseHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "site1.your-server.com", value = "\"The host that originated the request. Future calls in the same conversation may be routed to this host. Must be provided as: host[:port][/contextRoot] Where port and contextRoot are optional. If contextRoot is not provided, the default (per the URL Scheme) is assumed and must be used.\" ")

  public String getResponseHost() {
    return responseHost;
  }


  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }


  public TokenizeRequestSchema requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier for the request. 
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Unique identifier for the request. ")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public TokenizeRequestSchema tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type of Token requested. Must be CLOUD       __Max Length:32__    
   * @return tokenType
  **/
  @ApiModelProperty(example = "CLOUD", required = true, value = "The type of Token requested. Must be CLOUD       __Max Length:32__    ")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public TokenizeRequestSchema tokenRequestorId(String tokenRequestorId) {
    
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * Identifies the Token Requestor       __Max Length:11__  
   * @return tokenRequestorId
  **/
  @ApiModelProperty(example = "98765432101", required = true, value = "Identifies the Token Requestor       __Max Length:11__  ")

  public String getTokenRequestorId() {
    return tokenRequestorId;
  }


  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }


  public TokenizeRequestSchema taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Identifier for this task as assigned by the Token Requestor, unique across a given Token Requestor Identifier. May be used in the Get Task Status API to query the status of this task.      __Max Length:64__ 
   * @return taskId
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Identifier for this task as assigned by the Token Requestor, unique across a given Token Requestor Identifier. May be used in the Get Task Status API to query the status of this task.      __Max Length:64__ ")

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public TokenizeRequestSchema fundingAccountInfo(FundingAccountInfo fundingAccountInfo) {
    
    this.fundingAccountInfo = fundingAccountInfo;
    return this;
  }

   /**
   * Get fundingAccountInfo
   * @return fundingAccountInfo
  **/
  @ApiModelProperty(required = true, value = "")

  public FundingAccountInfo getFundingAccountInfo() {
    return fundingAccountInfo;
  }


  public void setFundingAccountInfo(FundingAccountInfo fundingAccountInfo) {
    this.fundingAccountInfo = fundingAccountInfo;
  }


  public TokenizeRequestSchema consumerLanguage(String consumerLanguage) {
    
    this.consumerLanguage = consumerLanguage;
    return this;
  }

   /**
   * Language preference selected by the consumer. Formatted as an ISO- 639-1 two-letter language code.    __Max Length:2__ 
   * @return consumerLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "Language preference selected by the consumer. Formatted as an ISO- 639-1 two-letter language code.    __Max Length:2__ ")

  public String getConsumerLanguage() {
    return consumerLanguage;
  }


  public void setConsumerLanguage(String consumerLanguage) {
    this.consumerLanguage = consumerLanguage;
  }


  public TokenizeRequestSchema tokenizationAuthenticationValue(String tokenizationAuthenticationValue) {
    
    this.tokenizationAuthenticationValue = tokenizationAuthenticationValue;
    return this;
  }

   /**
   * The Tokenization Authentication Value (TAV) as cryptographically signed by the Issuer to authorize this digitization request.      __Max Length:2048__ 
   * @return tokenizationAuthenticationValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RHVtbXkgYmFzZSA2NCBkYXRhIC0gdGhpcyBpcyBub3QgYSByZWFsIFRBViBleGFtcGxl", value = "The Tokenization Authentication Value (TAV) as cryptographically signed by the Issuer to authorize this digitization request.      __Max Length:2048__ ")

  public String getTokenizationAuthenticationValue() {
    return tokenizationAuthenticationValue;
  }


  public void setTokenizationAuthenticationValue(String tokenizationAuthenticationValue) {
    this.tokenizationAuthenticationValue = tokenizationAuthenticationValue;
  }


  public TokenizeRequestSchema decisioningData(DecisioningData decisioningData) {
    
    this.decisioningData = decisioningData;
    return this;
  }

   /**
   * Get decisioningData
   * @return decisioningData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DecisioningData getDecisioningData() {
    return decisioningData;
  }


  public void setDecisioningData(DecisioningData decisioningData) {
    this.decisioningData = decisioningData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeRequestSchema tokenizeRequestSchema = (TokenizeRequestSchema) o;
    return Objects.equals(this.responseHost, tokenizeRequestSchema.responseHost) &&
        Objects.equals(this.requestId, tokenizeRequestSchema.requestId) &&
        Objects.equals(this.tokenType, tokenizeRequestSchema.tokenType) &&
        Objects.equals(this.tokenRequestorId, tokenizeRequestSchema.tokenRequestorId) &&
        Objects.equals(this.taskId, tokenizeRequestSchema.taskId) &&
        Objects.equals(this.fundingAccountInfo, tokenizeRequestSchema.fundingAccountInfo) &&
        Objects.equals(this.consumerLanguage, tokenizeRequestSchema.consumerLanguage) &&
        Objects.equals(this.tokenizationAuthenticationValue, tokenizeRequestSchema.tokenizationAuthenticationValue) &&
        Objects.equals(this.decisioningData, tokenizeRequestSchema.decisioningData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHost, requestId, tokenType, tokenRequestorId, taskId, fundingAccountInfo, consumerLanguage, tokenizationAuthenticationValue, decisioningData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeRequestSchema {\n");
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    fundingAccountInfo: ").append(toIndentedString(fundingAccountInfo)).append("\n");
    sb.append("    consumerLanguage: ").append(toIndentedString(consumerLanguage)).append("\n");
    sb.append("    tokenizationAuthenticationValue: ").append(toIndentedString(tokenizationAuthenticationValue)).append("\n");
    sb.append("    decisioningData: ").append(toIndentedString(decisioningData)).append("\n");
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

