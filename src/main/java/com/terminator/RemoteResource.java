package com.terminator;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/todos")
@RegisterRestClient(configKey = "todos")
public interface RemoteResource {
    
    @GET
    List<Todo> getTodos();

    @GET
    @Path("/{id}")
    Todo getDoto(@PathParam("id") Integer id);
}
