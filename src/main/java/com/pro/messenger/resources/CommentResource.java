package com.pro.messenger.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created on 30.12.2015.
 */
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {

    @GET
    public String getComments() {
        return "Comments of a message";
    }

    @GET
    @Path("/{commentId}")
    public String getComment(
            @PathParam("messageId") long messageId,
            @PathParam("commentId") long id)
    {
        return "Comment " + id + " of a message " + messageId;
    }
}
