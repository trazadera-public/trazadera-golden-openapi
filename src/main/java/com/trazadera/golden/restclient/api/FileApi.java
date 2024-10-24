/*
 * GOLDEN-API
 * Trazadera Golden API
 *
 * OpenAPI spec version: 15
 * Contact: support@trazadera.com 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.trazadera.golden.restclient.api;

import com.trazadera.golden.restclient.invoker.ApiCallback;
import com.trazadera.golden.restclient.invoker.ApiClient;
import com.trazadera.golden.restclient.invoker.ApiException;
import com.trazadera.golden.restclient.invoker.ApiResponse;
import com.trazadera.golden.restclient.invoker.Configuration;
import com.trazadera.golden.restclient.invoker.Pair;
import com.trazadera.golden.restclient.invoker.ProgressRequestBody;
import com.trazadera.golden.restclient.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.trazadera.golden.restclient.model.ApiFilesBody;
import com.trazadera.golden.restclient.model.BaseResponseDto;
import com.trazadera.golden.restclient.model.FileListResponseDto;
import com.trazadera.golden.restclient.model.FileResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;import java.util.Map;
import java.util.List;
import java.util.Map;

public class FileApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public FileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for deleteFile
     * @param file File identifier to be deleted (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFileCall(String file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/files/{file}"
            .replaceAll("\\{" + "file" + "\\}", apiClient.escapeString(file.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFileValidateBeforeCall(String file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling deleteFile(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteFileCall(file, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a file.
     * Locates a file and deletes it. Requires ADMIN or STEWARD role.
     * @param file File identifier to be deleted (required)
     * @return FileResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileResponseDto deleteFile(String file) throws ApiException {
        ApiResponse<FileResponseDto> resp = deleteFileWithHttpInfo(file);
        return resp.getData();
    }

    /**
     * Deletes a file.
     * Locates a file and deletes it. Requires ADMIN or STEWARD role.
     * @param file File identifier to be deleted (required)
     * @return ApiResponse&lt;FileResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileResponseDto> deleteFileWithHttpInfo(String file) throws ApiException {
        com.squareup.okhttp.Call call = deleteFileValidateBeforeCall(file, null, null);
        Type localVarReturnType = new TypeToken<FileResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes a file. (asynchronously)
     * Locates a file and deletes it. Requires ADMIN or STEWARD role.
     * @param file File identifier to be deleted (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFileAsync(String file, final ApiCallback<FileResponseDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFileValidateBeforeCall(file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFile
     * @param file File identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFileCall(String file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/files/{file}"
            .replaceAll("\\{" + "file" + "\\}", apiClient.escapeString(file.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFileValidateBeforeCall(String file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling getFile(Async)");
        }
        
        com.squareup.okhttp.Call call = getFileCall(file, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves one file.
     * Locates one file by identifier and returns. Requires any authenticated role.
     * @param file File identifier (required)
     * @return FileResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileResponseDto getFile(String file) throws ApiException {
        ApiResponse<FileResponseDto> resp = getFileWithHttpInfo(file);
        return resp.getData();
    }

    /**
     * Retrieves one file.
     * Locates one file by identifier and returns. Requires any authenticated role.
     * @param file File identifier (required)
     * @return ApiResponse&lt;FileResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileResponseDto> getFileWithHttpInfo(String file) throws ApiException {
        com.squareup.okhttp.Call call = getFileValidateBeforeCall(file, null, null);
        Type localVarReturnType = new TypeToken<FileResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves one file. (asynchronously)
     * Locates one file by identifier and returns. Requires any authenticated role.
     * @param file File identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFileAsync(String file, final ApiCallback<FileResponseDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFileValidateBeforeCall(file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFiles
     * @param sorting Sorting criteria. Sorted by name by default (optional, default to NAME)
     * @param direction Sorting direction. Ascending by default (optional, default to ASC)
     * @param pageNumber Page number. Page 0 by default. (optional, default to 0)
     * @param pageSize Page size. Pages of 10 by default (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilesCall(String sorting, String direction, Integer pageNumber, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (sorting != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sorting", sorting));
        if (direction != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("direction", direction));
        if (pageNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageNumber", pageNumber));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFilesValidateBeforeCall(String sorting, String direction, Integer pageNumber, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getFilesCall(sorting, direction, pageNumber, pageSize, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves all available files.
     * Locates all files and returns. Requires any authenticated role.
     * @param sorting Sorting criteria. Sorted by name by default (optional, default to NAME)
     * @param direction Sorting direction. Ascending by default (optional, default to ASC)
     * @param pageNumber Page number. Page 0 by default. (optional, default to 0)
     * @param pageSize Page size. Pages of 10 by default (optional, default to 10)
     * @return FileListResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileListResponseDto getFiles(String sorting, String direction, Integer pageNumber, Integer pageSize) throws ApiException {
        ApiResponse<FileListResponseDto> resp = getFilesWithHttpInfo(sorting, direction, pageNumber, pageSize);
        return resp.getData();
    }

    /**
     * Retrieves all available files.
     * Locates all files and returns. Requires any authenticated role.
     * @param sorting Sorting criteria. Sorted by name by default (optional, default to NAME)
     * @param direction Sorting direction. Ascending by default (optional, default to ASC)
     * @param pageNumber Page number. Page 0 by default. (optional, default to 0)
     * @param pageSize Page size. Pages of 10 by default (optional, default to 10)
     * @return ApiResponse&lt;FileListResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileListResponseDto> getFilesWithHttpInfo(String sorting, String direction, Integer pageNumber, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getFilesValidateBeforeCall(sorting, direction, pageNumber, pageSize, null, null);
        Type localVarReturnType = new TypeToken<FileListResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves all available files. (asynchronously)
     * Locates all files and returns. Requires any authenticated role.
     * @param sorting Sorting criteria. Sorted by name by default (optional, default to NAME)
     * @param direction Sorting direction. Ascending by default (optional, default to ASC)
     * @param pageNumber Page number. Page 0 by default. (optional, default to 0)
     * @param pageSize Page size. Pages of 10 by default (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilesAsync(String sorting, String direction, Integer pageNumber, Integer pageSize, final ApiCallback<FileListResponseDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFilesValidateBeforeCall(sorting, direction, pageNumber, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileListResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uploadFile
     * @param body  (required)
     * @param name File name. Name is important because it determines if the file is compressed (.gz extension) and the mime type (eg. csv or json extension) (required)
     * @param description File description (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadFileCall(ApiFilesBody body, String name, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("description", description));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadFileValidateBeforeCall(ApiFilesBody body, String name, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling uploadFile(Async)");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling uploadFile(Async)");
        }
        
        com.squareup.okhttp.Call call = uploadFileCall(body, name, description, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uploads a new file.
     * Receives a stream of binary data and creates a new file with provided metadata. Requires ADMIN or STEWARD role.
     * @param body  (required)
     * @param name File name. Name is important because it determines if the file is compressed (.gz extension) and the mime type (eg. csv or json extension) (required)
     * @param description File description (optional)
     * @return FileResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileResponseDto uploadFile(ApiFilesBody body, String name, String description) throws ApiException {
        ApiResponse<FileResponseDto> resp = uploadFileWithHttpInfo(body, name, description);
        return resp.getData();
    }

    /**
     * Uploads a new file.
     * Receives a stream of binary data and creates a new file with provided metadata. Requires ADMIN or STEWARD role.
     * @param body  (required)
     * @param name File name. Name is important because it determines if the file is compressed (.gz extension) and the mime type (eg. csv or json extension) (required)
     * @param description File description (optional)
     * @return ApiResponse&lt;FileResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileResponseDto> uploadFileWithHttpInfo(ApiFilesBody body, String name, String description) throws ApiException {
        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(body, name, description, null, null);
        Type localVarReturnType = new TypeToken<FileResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Uploads a new file. (asynchronously)
     * Receives a stream of binary data and creates a new file with provided metadata. Requires ADMIN or STEWARD role.
     * @param body  (required)
     * @param name File name. Name is important because it determines if the file is compressed (.gz extension) and the mime type (eg. csv or json extension) (required)
     * @param description File description (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadFileAsync(ApiFilesBody body, String name, String description, final ApiCallback<FileResponseDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(body, name, description, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}