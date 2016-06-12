package com.pro.messenger.resources;

import com.pro.messenger.model.Comment;
import com.pro.messenger.service.CommentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created on 30.12.2015.
 */
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {

    // Load comments to the messages via the comment service constructor.
    private CommentService commentService = new CommentService();

    @GET
    public String getComments(@PathParam("messageId") long messageId) {

        for (Object temp : commentService.getComments(messageId)) {
            System.out.println(temp);
        }

        return "All comments for message " + messageId;
    }
/*
    public List<Comment> getComments(@PathParam("messageId") long messageId) {
        return commentService.getComments(messageId);
    }
*/

    @GET
    @Path("/{commentId}")
    public String getComment(
            @PathParam("messageId") long messageId,
            @PathParam("commentId") long id)
    {
        return "Comment " + id + " of a message " + messageId;
    }
}
