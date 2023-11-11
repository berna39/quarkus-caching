package com.terminator;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkus.cache.CacheResult;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/todos")
@RegisterRestClient(configKey = "todos")
public interface RemoteResource {
    
    @GET
    @CacheResult(cacheName = "cache-todos")
    List<Todo> getTodos();

    @GET
    @Path("/{id}")
    @CacheResult(cacheName = "cache-todos-with-path")
    Todo getDoto(@PathParam("id") Integer id);
}
