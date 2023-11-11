package com.terminator;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

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
}
