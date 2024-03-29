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

/**
 * TransactRequestSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-05T10:20:27.908+05:30[Asia/Calcutta]")
public class TransactRequestSchema {
  public static final String SERIALIZED_NAME_RESPONSE_HOST = "responseHost";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HOST)
  private String responseHost;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE = "tokenUniqueReference";
  @SerializedName(SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE)
  private String tokenUniqueReference;

  public static final String SERIALIZED_NAME_DSRP_TYPE = "dsrpType";
  @SerializedName(SERIALIZED_NAME_DSRP_TYPE)
  private String dsrpType;

  public static final String SERIALIZED_NAME_UNPREDICTABLE_NUMBER = "unpredictableNumber";
  @SerializedName(SERIALIZED_NAME_UNPREDICTABLE_NUMBER)
  private String unpredictableNumber;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;


  public TransactRequestSchema responseHost(String responseHost) {
    
    this.responseHost = responseHost;
    return this;
  }

   /**
   * The host that originated the request. Future calls in the same conversation may be routed to this host. 
   * @return responseHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "site2.payment-app-provider.com", value = "The host that originated the request. Future calls in the same conversation may be routed to this host. ")

  public String getResponseHost() {
    return responseHost;
  }


  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }


  public TransactRequestSchema requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier for the request. 
   * @return requestId
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Unique identifier for the request. ")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public TransactRequestSchema tokenUniqueReference(String tokenUniqueReference) {
    
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

   /**
   * Globally unique identifier for the Token, as assigned by MDES.    __Max Length:64__ 
   * @return tokenUniqueReference
  **/
  @ApiModelProperty(example = "DWSPMC000000000132d72d4fcb2f4136a0532d3093ff1a45", required = true, value = "Globally unique identifier for the Token, as assigned by MDES.    __Max Length:64__ ")

  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }


  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }


  public TransactRequestSchema dsrpType(String dsrpType) {
    
    this.dsrpType = dsrpType;
    return this;
  }

   /**
   * What type of DSRP cryptogram to create. Must be either UCAF or M_CHIP.     __Max Length:64__ 
   * @return dsrpType
  **/
  @ApiModelProperty(example = "UCAF", required = true, value = "What type of DSRP cryptogram to create. Must be either UCAF or M_CHIP.     __Max Length:64__ ")

  public String getDsrpType() {
    return dsrpType;
  }


  public void setDsrpType(String dsrpType) {
    this.dsrpType = dsrpType;
  }


  public TransactRequestSchema unpredictableNumber(String unpredictableNumber) {
    
    this.unpredictableNumber = unpredictableNumber;
    return this;
  }

   /**
   * HEX Encoded data (case sensitive) provided by the merchant to provide variability and uniqueness to the generation of a cryptogram.  __Length:8__ 
   * @return unpredictableNumber
  **/
  @ApiModelProperty(example = "23424563", required = true, value = "HEX Encoded data (case sensitive) provided by the merchant to provide variability and uniqueness to the generation of a cryptogram.  __Length:8__ ")

  public String getUnpredictableNumber() {
    return unpredictableNumber;
  }


  public void setUnpredictableNumber(String unpredictableNumber) {
    this.unpredictableNumber = unpredictableNumber;
  }


  public TransactRequestSchema amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Transaction amount to be authorized. Note that refund transactions are not supported ? this value must be a positive amount and can contain up to 12 digits, inclusive of any digits in the currency exponent.     __Max Length:13__ 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "122", value = "Transaction amount to be authorized. Note that refund transactions are not supported ? this value must be a positive amount and can contain up to 12 digits, inclusive of any digits in the currency exponent.     __Max Length:13__ ")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransactRequestSchema currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The transaction currency. Expressed as a 3-character ISO 4217 currency code. 
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The transaction currency. Expressed as a 3-character ISO 4217 currency code. ")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactRequestSchema transactRequestSchema = (TransactRequestSchema) o;
    return Objects.equals(this.responseHost, transactRequestSchema.responseHost) &&
        Objects.equals(this.requestId, transactRequestSchema.requestId) &&
        Objects.equals(this.tokenUniqueReference, transactRequestSchema.tokenUniqueReference) &&
        Objects.equals(this.dsrpType, transactRequestSchema.dsrpType) &&
        Objects.equals(this.unpredictableNumber, transactRequestSchema.unpredictableNumber) &&
        Objects.equals(this.amount, transactRequestSchema.amount) &&
        Objects.equals(this.currencyCode, transactRequestSchema.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHost, requestId, tokenUniqueReference, dsrpType, unpredictableNumber, amount, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactRequestSchema {\n");
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    dsrpType: ").append(toIndentedString(dsrpType)).append("\n");
    sb.append("    unpredictableNumber: ").append(toIndentedString(unpredictableNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

