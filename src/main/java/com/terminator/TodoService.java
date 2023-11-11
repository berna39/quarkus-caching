package com.terminator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import io.quarkus.cache.CacheInvalidateAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TodoService {

    private Logger logger;
    
    @Inject
    @RestClient
    RemoteResource remoteResource;

    public List<Todo> getTodos() {
        try {
            return remoteResource.getTodos();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return new ArrayList<>();
    }

    public Todo getTodo(Integer id) {
        try {
            return remoteResource.getDoto(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return null;
    }

    @CacheInvalidateAll(cacheName = "cache-todos")
    public void invalidate() {

    }
}
