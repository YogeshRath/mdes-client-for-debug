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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ProductConfig
 */
public class ProductConfigTest {
    private final ProductConfig model = new ProductConfig();

    /**
     * Model tests for ProductConfig
     */
    @Test
    public void testProductConfig() {
        // TODO: test ProductConfig
    }

    /**
     * Test the property 'brandLogoAssetId'
     */
    @Test
    public void brandLogoAssetIdTest() {
        // TODO: test brandLogoAssetId
    }

    /**
     * Test the property 'issuerLogoAssetId'
     */
    @Test
    public void issuerLogoAssetIdTest() {
        // TODO: test issuerLogoAssetId
    }

    /**
     * Test the property 'isCoBranded'
     */
    @Test
    public void isCoBrandedTest() {
        // TODO: test isCoBranded
    }

    /**
     * Test the property 'coBrandName'
     */
    @Test
    public void coBrandNameTest() {
        // TODO: test coBrandName
    }

    /**
     * Test the property 'coBrandLogoAssetId'
     */
    @Test
    public void coBrandLogoAssetIdTest() {
        // TODO: test coBrandLogoAssetId
    }

    /**
     * Test the property 'cardBackgroundCombinedAssetId'
     */
    @Test
    public void cardBackgroundCombinedAssetIdTest() {
        // TODO: test cardBackgroundCombinedAssetId
    }

    /**
     * Test the property 'cardBackgroundAssetId'
     */
    @Test
    public void cardBackgroundAssetIdTest() {
        // TODO: test cardBackgroundAssetId
    }

    /**
     * Test the property 'iconAssetId'
     */
    @Test
    public void iconAssetIdTest() {
        // TODO: test iconAssetId
    }

    /**
     * Test the property 'foregroundColor'
     */
    @Test
    public void foregroundColorTest() {
        // TODO: test foregroundColor
    }

    /**
     * Test the property 'issuerName'
     */
    @Test
    public void issuerNameTest() {
        // TODO: test issuerName
    }

    /**
     * Test the property 'shortDescription'
     */
    @Test
    public void shortDescriptionTest() {
        // TODO: test shortDescription
    }

    /**
     * Test the property 'longDescription'
     */
    @Test
    public void longDescriptionTest() {
        // TODO: test longDescription
    }

    /**
     * Test the property 'customerServiceUrl'
     */
    @Test
    public void customerServiceUrlTest() {
        // TODO: test customerServiceUrl
    }

    /**
     * Test the property 'customerServiceEmail'
     */
    @Test
    public void customerServiceEmailTest() {
        // TODO: test customerServiceEmail
    }

    /**
     * Test the property 'customerServicePhoneNumber'
     */
    @Test
    public void customerServicePhoneNumberTest() {
        // TODO: test customerServicePhoneNumber
    }

    /**
     * Test the property 'issuerMobileApp'
     */
    @Test
    public void issuerMobileAppTest() {
        // TODO: test issuerMobileApp
    }

    /**
     * Test the property 'onlineBankingLoginUrl'
     */
    @Test
    public void onlineBankingLoginUrlTest() {
        // TODO: test onlineBankingLoginUrl
    }

    /**
     * Test the property 'termsAndConditionsUrl'
     */
    @Test
    public void termsAndConditionsUrlTest() {
        // TODO: test termsAndConditionsUrl
    }

    /**
     * Test the property 'privacyPolicyUrl'
     */
    @Test
    public void privacyPolicyUrlTest() {
        // TODO: test privacyPolicyUrl
    }

    /**
     * Test the property 'issuerProductConfigCode'
     */
    @Test
    public void issuerProductConfigCodeTest() {
        // TODO: test issuerProductConfigCode
    }

}
