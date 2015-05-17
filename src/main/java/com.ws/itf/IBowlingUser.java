package com.ws.itf;


import com.fasterxml.jackson.core.JsonProcessingException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public interface IBowlingUser {
    @GET
    @Path("/")
    @Produces (MediaType.APPLICATION_JSON)
    public Response getUsers();

    @GET
    @Path("/{user_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam ("user_id") int user_id) throws JsonProcessingException;


    @GET
    @Path("/game/{game_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPlayersForOneGame(@PathParam ("game_id") int game_id) throws JsonProcessingException;
}