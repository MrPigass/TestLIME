/*
 * API
 * API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Deconnexion;
import org.openapitools.client.model.Error;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeconnexionApi
 */
@Disabled
public class DeconnexionApiTest {

    private final DeconnexionApi api = new DeconnexionApi();

    /**
     * Create deconnexion
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDeconnexionTest() throws ApiException {
        Deconnexion deconnexion = null;
        Deconnexion response = api.createDeconnexion(deconnexion);
        // TODO: test validations
    }

}
