/*
 * Organization Management API
 * API for managing organizations, departments, teams, and user assignments.
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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SurveyManagementApi
 */
@Disabled
public class SurveyManagementApiTest {

    private final SurveyManagementApi api = new SurveyManagementApi();

    /**
     * Assign a survey to a department or team
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void organizationsIdOrganizationAssignSurveySurveyIdPostTest() throws ApiException {
        Integer idOrganization = null;
        Integer surveyId = null;
        api.organizationsIdOrganizationAssignSurveySurveyIdPost(idOrganization, surveyId);
        // TODO: test validations
    }

}
