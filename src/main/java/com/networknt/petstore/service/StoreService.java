package com.networknt.petstore.service;

import com.networknt.petstore.model.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreService {

    private static List<Store> storeInvetory;

    public List<Store> getStores() {
        if (storeInvetory == null) {
            storeInvetory = new ArrayList<>();
            storeInvetory.add(new Store("OTT_PETSMART_1","PETSMART","99 Bank Street Ottawa HOHOHO"));
            storeInvetory.add(new Store("OTT_HAPPYPETS_7","HAPPYPETS","100 Green Lane Nepean L0L0L0"));
        }
        return storeInvetory;
    }

    public void addStore(Store store) {
        if (storeInvetory == null) {
            storeInvetory = new ArrayList<>();
            storeInvetory.add(new Store("OTT_PETSMART_1","PETSMART","99 Bank Street Ottawa HOHOHO"));
            storeInvetory.add(new Store("OTT_HAPPYPETS_7","HAPPYPETS","100 Green Lane Nepean L0L0L0"));
        }
        storeInvetory.add(store);
    }

}
