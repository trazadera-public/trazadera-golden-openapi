package com.trazadera.golden;

import com.trazadera.golden.restclient.api.EntityApi;
import com.trazadera.golden.restclient.invoker.ApiClient;
import com.trazadera.golden.restclient.model.EntityListResponseDto;

public class SampleClientUsage {

    public static void main(String[] args) throws Exception {
        // Required to initialize the API client
        String url = "https://foo.trazadera.net";
        String token = "golden:XXXX";

        // Initialize API client
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(url);
        apiClient.setAccessToken(token);

        // Select the API module
        EntityApi api = new EntityApi();
        api.setApiClient(apiClient);

        // Use the API to list all entities
        EntityListResponseDto entities = api.getAllEntities();
        System.out.println(entities);
    }

}
