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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAssignmentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserAssignmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserAssignmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for organizationsIdOrganizationAssignUserUserIdPost
     * @param idOrganization  (required)
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User assigned successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organizationsIdOrganizationAssignUserUserIdPostCall(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/organizations/{idOrganization}/assign-user/{userId}"
            .replace("{" + "idOrganization" + "}", localVarApiClient.escapeString(idOrganization.toString()))
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call organizationsIdOrganizationAssignUserUserIdPostValidateBeforeCall(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'idOrganization' is set
        if (idOrganization == null) {
            throw new ApiException("Missing the required parameter 'idOrganization' when calling organizationsIdOrganizationAssignUserUserIdPost(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling organizationsIdOrganizationAssignUserUserIdPost(Async)");
        }

        return organizationsIdOrganizationAssignUserUserIdPostCall(idOrganization, userId, _callback);

    }

    /**
     * Assign a user to a department or team
     * 
     * @param idOrganization  (required)
     * @param userId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User assigned successfully </td><td>  -  </td></tr>
     </table>
     */
    public void organizationsIdOrganizationAssignUserUserIdPost(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId) throws ApiException {
        organizationsIdOrganizationAssignUserUserIdPostWithHttpInfo(idOrganization, userId);
    }

    /**
     * Assign a user to a department or team
     * 
     * @param idOrganization  (required)
     * @param userId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User assigned successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> organizationsIdOrganizationAssignUserUserIdPostWithHttpInfo(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId) throws ApiException {
        okhttp3.Call localVarCall = organizationsIdOrganizationAssignUserUserIdPostValidateBeforeCall(idOrganization, userId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Assign a user to a department or team (asynchronously)
     * 
     * @param idOrganization  (required)
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User assigned successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organizationsIdOrganizationAssignUserUserIdPostAsync(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = organizationsIdOrganizationAssignUserUserIdPostValidateBeforeCall(idOrganization, userId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for organizationsIdOrganizationRemoveUserUserIdDelete
     * @param idOrganization  (required)
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organizationsIdOrganizationRemoveUserUserIdDeleteCall(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/organizations/{idOrganization}/remove-user/{userId}"
            .replace("{" + "idOrganization" + "}", localVarApiClient.escapeString(idOrganization.toString()))
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call organizationsIdOrganizationRemoveUserUserIdDeleteValidateBeforeCall(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'idOrganization' is set
        if (idOrganization == null) {
            throw new ApiException("Missing the required parameter 'idOrganization' when calling organizationsIdOrganizationRemoveUserUserIdDelete(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling organizationsIdOrganizationRemoveUserUserIdDelete(Async)");
        }

        return organizationsIdOrganizationRemoveUserUserIdDeleteCall(idOrganization, userId, _callback);

    }

    /**
     * Remove a user from a department or team
     * 
     * @param idOrganization  (required)
     * @param userId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public void organizationsIdOrganizationRemoveUserUserIdDelete(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId) throws ApiException {
        organizationsIdOrganizationRemoveUserUserIdDeleteWithHttpInfo(idOrganization, userId);
    }

    /**
     * Remove a user from a department or team
     * 
     * @param idOrganization  (required)
     * @param userId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> organizationsIdOrganizationRemoveUserUserIdDeleteWithHttpInfo(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId) throws ApiException {
        okhttp3.Call localVarCall = organizationsIdOrganizationRemoveUserUserIdDeleteValidateBeforeCall(idOrganization, userId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove a user from a department or team (asynchronously)
     * 
     * @param idOrganization  (required)
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organizationsIdOrganizationRemoveUserUserIdDeleteAsync(@javax.annotation.Nonnull Integer idOrganization, @javax.annotation.Nonnull Integer userId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = organizationsIdOrganizationRemoveUserUserIdDeleteValidateBeforeCall(idOrganization, userId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
