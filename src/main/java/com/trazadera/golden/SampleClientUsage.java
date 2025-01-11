package com.trazadera.golden;

import com.trazadera.golden.restclient.api.ConfigurationApi;
import com.trazadera.golden.restclient.api.EntityApi;
import com.trazadera.golden.restclient.invoker.ApiClient;
import com.trazadera.golden.restclient.invoker.ApiException;
import com.trazadera.golden.restclient.model.ConfigurationVersionResponseDto;
import com.trazadera.golden.restclient.model.EntityDto;
import com.trazadera.golden.restclient.model.EntityListResponseDto;

public class SampleClientUsage {

    public static void main(String[] args) {
        try {
            // Required to initialize the API client
            if (args.length < 2) {
                System.out.println("Usage: SampleClientUsage <url> <token>");
                System.exit(1);
            }
            String url = args[0];
            String token = args[1];

            // Initialize API client
            ApiClient apiClient = new ApiClient();
            apiClient.setBasePath(url);
            apiClient.setAccessToken(token);

            // Get product version
            ConfigurationApi configurationApi = new ConfigurationApi(apiClient);
            ConfigurationVersionResponseDto version = configurationApi.getVersion();
            System.out.println("Product version: " + version.getVersion());

            // List all entities
            EntityApi entityApi = new EntityApi(apiClient);
            EntityListResponseDto entities = entityApi.getAllEntities();
            System.out.println("Total entities: " + entities.getEntities().size());
            System.out.println("Entities: ");
            for (EntityDto entity : entities.getEntities()) {
                System.out.println("\t" + entity.getId() + ": " + entity.getDescription());
            }

        } catch (ApiException e) {
            System.out.println("An API error occurred: " + e.getResponseBody());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
