package com.fulfilment.application.monolith.stores;

public record StoreEvent(Type type, Store store) {
    public enum Type { CREATED, UPDATED }
}
