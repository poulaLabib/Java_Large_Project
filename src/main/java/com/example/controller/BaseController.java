package com.example.controller;

import java.util.List;

public abstract class BaseController<T> {
    public abstract T getById(Long id);
    public abstract List<T> getAll();
    public abstract T create(T entity);

    protected void logRequest(String action, Object... params) {
        System.out.println("[" + getClass().getSimpleName() + "] " + action);
    }

    protected <R> R handleRequest(String action, java.util.function.Supplier<R> supplier) {
        logRequest(action);
        return supplier.get();
    }
}
