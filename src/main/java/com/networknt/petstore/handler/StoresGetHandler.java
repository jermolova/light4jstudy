package com.networknt.petstore.handler;

import com.networknt.body.BodyHandler;
import com.networknt.config.Config;

import com.networknt.handler.LightHttpHandler;
import com.networknt.http.HttpMethod;
import com.networknt.http.HttpStatus;
import com.networknt.http.MediaType;
import com.networknt.petstore.model.Store;
import com.networknt.petstore.service.StoreService;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;
import io.undertow.util.HeaderMap;

import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
For more information on how to write business handlers, please check the link below.
https://doc.networknt.com/development/business-handler/rest/
*/
public class StoresGetHandler implements LightHttpHandler {

    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        // HeaderMap requestHeaders = exchange.getRequestHeaders();
        // Map<String, Deque<String>> queryParameters = exchange.getQueryParameters();
        StoreService storeService = new StoreService();
        List<Store> stores = storeService.getStores();
        String responseBody = stores.stream().map(Store::toString).collect(Collectors.joining(","));
        //String responseBody = "[{\"id\":\"OTT_PETSMART_1\",\"brand\":\"PETSMART\",\"address\":\"99 Bank Street Ottawa HOHOHO\"},{\"id\":\"OTT_HAPPYPETS_7\",\"brand\":\"HAPPYPETS\",\"address\":\"100 Green Lane Nepean L0L0L0\"}]";
        exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        exchange.setStatusCode(HttpStatus.OK.value());
        exchange.getResponseSender().send(responseBody);
    }
}
