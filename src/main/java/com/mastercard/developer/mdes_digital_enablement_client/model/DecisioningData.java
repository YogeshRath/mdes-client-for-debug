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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DecisioningData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-05T10:20:27.908+05:30[Asia/Calcutta]")
public class DecisioningData {
  public static final String SERIALIZED_NAME_RECOMMENDATION = "recommendation";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATION)
  private String recommendation;

  public static final String SERIALIZED_NAME_RECOMMENDATION_ALGORITHM_VERSION = "recommendationAlgorithmVersion";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATION_ALGORITHM_VERSION)
  private String recommendationAlgorithmVersion;

  public static final String SERIALIZED_NAME_DEVICE_SCORE = "deviceScore";
  @SerializedName(SERIALIZED_NAME_DEVICE_SCORE)
  private String deviceScore;

  public static final String SERIALIZED_NAME_ACCOUNT_SCORE = "accountScore";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SCORE)
  private String accountScore;

  public static final String SERIALIZED_NAME_RECOMMENDATION_REASONS = "recommendationReasons";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATION_REASONS)
  private List<String> recommendationReasons = null;

  public static final String SERIALIZED_NAME_DEVICE_CURRENT_LOCATION = "deviceCurrentLocation";
  @SerializedName(SERIALIZED_NAME_DEVICE_CURRENT_LOCATION)
  private String deviceCurrentLocation;

  public static final String SERIALIZED_NAME_DEVICE_IP_ADDRESS = "deviceIpAddress";
  @SerializedName(SERIALIZED_NAME_DEVICE_IP_ADDRESS)
  private String deviceIpAddress;

  public static final String SERIALIZED_NAME_MOBILE_NUMBER_SUFFIX = "mobileNumberSuffix";
  @SerializedName(SERIALIZED_NAME_MOBILE_NUMBER_SUFFIX)
  private String mobileNumberSuffix;

  public static final String SERIALIZED_NAME_ACCOUNT_ID_HASH = "accountIdHash";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID_HASH)
  private String accountIdHash;


  public DecisioningData recommendation(String recommendation) {
    
    this.recommendation = recommendation;
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; Digitization decision recommended by the Token Requestor. Must be either APPROVED (Recommend a decision of Approved), DECLINED (Recommend a decision of Decline). &lt;br&gt;   __Max Length:64__ 
   * @return recommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVE", value = "__(OPTIONAL)__ <br> Digitization decision recommended by the Token Requestor. Must be either APPROVED (Recommend a decision of Approved), DECLINED (Recommend a decision of Decline). <br>   __Max Length:64__ ")

  public String getRecommendation() {
    return recommendation;
  }


  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }


  public DecisioningData recommendationAlgorithmVersion(String recommendationAlgorithmVersion) {
    
    this.recommendationAlgorithmVersion = recommendationAlgorithmVersion;
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; Version of the algorithm used by the Token Requestor to determine its recommendation. Must be a value of \&quot;01\&quot;. Other values may be supported in the future.&lt;br&gt;     __Max Length:16__ 
   * @return recommendationAlgorithmVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "__(OPTIONAL)__ <br> Version of the algorithm used by the Token Requestor to determine its recommendation. Must be a value of \"01\". Other values may be supported in the future.<br>     __Max Length:16__ ")

  public String getRecommendationAlgorithmVersion() {
    return recommendationAlgorithmVersion;
  }


  public void setRecommendationAlgorithmVersion(String recommendationAlgorithmVersion) {
    this.recommendationAlgorithmVersion = recommendationAlgorithmVersion;
  }


  public DecisioningData deviceScore(String deviceScore) {
    
    this.deviceScore = deviceScore;
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; Score assigned by the Token Requestor for the target device being provisioned. Must be a value from 1 to 5. 
   * @return deviceScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "__(OPTIONAL)__ <br> Score assigned by the Token Requestor for the target device being provisioned. Must be a value from 1 to 5. ")

  public String getDeviceScore() {
    return deviceScore;
  }


  public void setDeviceScore(String deviceScore) {
    this.deviceScore = deviceScore;
  }


  public DecisioningData accountScore(String accountScore) {
    
    this.accountScore = accountScore;
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; Score assigned by the Token Requestor for the consumer account or relationship. Must be a value from 1 to 5. 
   * @return accountScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "__(OPTIONAL)__ <br> Score assigned by the Token Requestor for the consumer account or relationship. Must be a value from 1 to 5. ")

  public String getAccountScore() {
    return accountScore;
  }


  public void setAccountScore(String accountScore) {
    this.accountScore = accountScore;
  }


  public DecisioningData recommendationReasons(List<String> recommendationReasons) {
    
    this.recommendationReasons = recommendationReasons;
    return this;
  }

  public DecisioningData addRecommendationReasonsItem(String recommendationReasonsItem) {
    if (this.recommendationReasons == null) {
      this.recommendationReasons = new ArrayList<String>();
    }
    this.recommendationReasons.add(recommendationReasonsItem);
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; Code indicating the reasons the Token Requestor is suggesting the digitization decision.  See table here - https://developer.mastercard.com/page/mdes-digitization-recommendation-reason-codes 
   * @return recommendationReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "__(OPTIONAL)__ <br> Code indicating the reasons the Token Requestor is suggesting the digitization decision.  See table here - https://developer.mastercard.com/page/mdes-digitization-recommendation-reason-codes ")

  public List<String> getRecommendationReasons() {
    return recommendationReasons;
  }


  public void setRecommendationReasons(List<String> recommendationReasons) {
    this.recommendationReasons = recommendationReasons;
  }


  public DecisioningData deviceCurrentLocation(String deviceCurrentLocation) {
    
    this.deviceCurrentLocation = deviceCurrentLocation;
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; Latitude and longitude in the format \&quot;(sign) latitude, (sign) longitude\&quot; with a precision of 2 decimal places.  Ex - \&quot;38.63, -90.25\&quot;  Latitude is between -90 and 90.  Longitude between -180 and 180. Relates to the target device being provisioned. If there is no target device, then this should be the current consumer location, if available. &lt;br&gt;    __Max Length:14__ 
   * @return deviceCurrentLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "38.63, -90.25", value = "__(OPTIONAL)__ <br> Latitude and longitude in the format \"(sign) latitude, (sign) longitude\" with a precision of 2 decimal places.  Ex - \"38.63, -90.25\"  Latitude is between -90 and 90.  Longitude between -180 and 180. Relates to the target device being provisioned. If there is no target device, then this should be the current consumer location, if available. <br>    __Max Length:14__ ")

  public String getDeviceCurrentLocation() {
    return deviceCurrentLocation;
  }


  public void setDeviceCurrentLocation(String deviceCurrentLocation) {
    this.deviceCurrentLocation = deviceCurrentLocation;
  }


  public DecisioningData deviceIpAddress(String deviceIpAddress) {
    
    this.deviceIpAddress = deviceIpAddress;
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; The IP address of the device through which the device reaches the internet. This may be a temporary or permanent IP address assigned to a home router, or the IP address of a gateway through which the device connects to a network. IPv4 address format of 4 octets separated by \&quot;.\&quot; Ex - 127.0.0.1 Relates to the target device being provisioned. If there is no target device, then this should be the current consumer IP address, if available.&lt;br&gt;     __Max Length:15__ 
   * @return deviceIpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "127.0.0.1", value = "__(OPTIONAL)__ <br> The IP address of the device through which the device reaches the internet. This may be a temporary or permanent IP address assigned to a home router, or the IP address of a gateway through which the device connects to a network. IPv4 address format of 4 octets separated by \".\" Ex - 127.0.0.1 Relates to the target device being provisioned. If there is no target device, then this should be the current consumer IP address, if available.<br>     __Max Length:15__ ")

  public String getDeviceIpAddress() {
    return deviceIpAddress;
  }


  public void setDeviceIpAddress(String deviceIpAddress) {
    this.deviceIpAddress = deviceIpAddress;
  }


  public DecisioningData mobileNumberSuffix(String mobileNumberSuffix) {
    
    this.mobileNumberSuffix = mobileNumberSuffix;
    return this;
  }

   /**
   * __(OPTIONAL)__&lt;br&gt; The last few digits (typically four) of the consumer&#39;s mobile phone number as available on file or on the consumer&#39;s current device, which may or may not be the mobile number of the target device being provisioned.&lt;br&gt;     __Max Length:32__ 
   * @return mobileNumberSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3456", value = "__(OPTIONAL)__<br> The last few digits (typically four) of the consumer's mobile phone number as available on file or on the consumer's current device, which may or may not be the mobile number of the target device being provisioned.<br>     __Max Length:32__ ")

  public String getMobileNumberSuffix() {
    return mobileNumberSuffix;
  }


  public void setMobileNumberSuffix(String mobileNumberSuffix) {
    this.mobileNumberSuffix = mobileNumberSuffix;
  }


  public DecisioningData accountIdHash(String accountIdHash) {
    
    this.accountIdHash = accountIdHash;
    return this;
  }

   /**
   * __(OPTIONAL)__ &lt;br&gt; SHA-256 hash of the Cardholder?s account ID with the Token Requestor. Typically expected to be an email address.&lt;br&gt;  __Max Length:64__ Alpha-Numeric and Hex-encoded data (case-insensitive). 
   * @return accountIdHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NA", value = "__(OPTIONAL)__ <br> SHA-256 hash of the Cardholder?s account ID with the Token Requestor. Typically expected to be an email address.<br>  __Max Length:64__ Alpha-Numeric and Hex-encoded data (case-insensitive). ")

  public String getAccountIdHash() {
    return accountIdHash;
  }


  public void setAccountIdHash(String accountIdHash) {
    this.accountIdHash = accountIdHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisioningData decisioningData = (DecisioningData) o;
    return Objects.equals(this.recommendation, decisioningData.recommendation) &&
        Objects.equals(this.recommendationAlgorithmVersion, decisioningData.recommendationAlgorithmVersion) &&
        Objects.equals(this.deviceScore, decisioningData.deviceScore) &&
        Objects.equals(this.accountScore, decisioningData.accountScore) &&
        Objects.equals(this.recommendationReasons, decisioningData.recommendationReasons) &&
        Objects.equals(this.deviceCurrentLocation, decisioningData.deviceCurrentLocation) &&
        Objects.equals(this.deviceIpAddress, decisioningData.deviceIpAddress) &&
        Objects.equals(this.mobileNumberSuffix, decisioningData.mobileNumberSuffix) &&
        Objects.equals(this.accountIdHash, decisioningData.accountIdHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendation, recommendationAlgorithmVersion, deviceScore, accountScore, recommendationReasons, deviceCurrentLocation, deviceIpAddress, mobileNumberSuffix, accountIdHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisioningData {\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    recommendationAlgorithmVersion: ").append(toIndentedString(recommendationAlgorithmVersion)).append("\n");
    sb.append("    deviceScore: ").append(toIndentedString(deviceScore)).append("\n");
    sb.append("    accountScore: ").append(toIndentedString(accountScore)).append("\n");
    sb.append("    recommendationReasons: ").append(toIndentedString(recommendationReasons)).append("\n");
    sb.append("    deviceCurrentLocation: ").append(toIndentedString(deviceCurrentLocation)).append("\n");
    sb.append("    deviceIpAddress: ").append(toIndentedString(deviceIpAddress)).append("\n");
    sb.append("    mobileNumberSuffix: ").append(toIndentedString(mobileNumberSuffix)).append("\n");
    sb.append("    accountIdHash: ").append(toIndentedString(accountIdHash)).append("\n");
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

