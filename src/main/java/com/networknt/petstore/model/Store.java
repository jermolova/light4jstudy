package com.networknt.petstore.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Store  {

    private String id;
    private String brand;
    private String address;

    public Store (){
    }
    public Store (String id, String brand, String address) {
        this.id = id;
        this.brand= brand;
        this.address = address;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Store Store = (Store) o;

        return Objects.equals(id, Store.id) &&
               Objects.equals(brand, Store.brand) &&
               Objects.equals(address, Store.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{id: ").append(toIndentedString(id)).append("\n");        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
