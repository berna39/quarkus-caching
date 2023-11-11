package com.terminator;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @Inject
    TodoService todoService;

    @GET
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

    @GET
    @Path("/{id}")
    public Todo getTodo(@PathParam("id") Integer id) {
        return todoService.getTodo(id);
    }

    @GET
    @Path("/invalidate")
    public String invalidate() {
        todoService.invalidate();
        return "invalidated";
    }
}
