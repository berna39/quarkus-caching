package com.terminator;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.cache.CacheInvalidateAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TodoService {
    
    @Inject
    @RestClient
    RemoteResource remoteResource;

    public List<Todo> getTodos() {
        return remoteResource.getTodos();
    }

    public Todo getTodo(Integer id) {
        return remoteResource.getDoto(id);
    }

    @CacheInvalidateAll(cacheName = "cache-todos")
    public void invalidate() {

    }
}
