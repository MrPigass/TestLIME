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
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Lot;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LotsApi
 */
@Disabled
public class LotsApiTest {

    private final LotsApi api = new LotsApi();

    /**
     * Get lot by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLotByIdTest() throws ApiException {
        Integer id = null;
        Lot response = api.getLotById(id);
        // TODO: test validations
    }

}
