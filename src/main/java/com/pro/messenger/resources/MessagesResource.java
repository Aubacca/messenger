package com.pro.messenger.resources;

import com.pro.messenger.model.Message;
import com.pro.messenger.service.CommentService;
import com.pro.messenger.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created on 29.12.2015.
 */

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessagesResource {

    private MessageService messageService = new MessageService();

    @GET
    public List<Message> getMessages(
            @QueryParam("messageFrom") Integer indexFrom,
            @QueryParam("messageTo") int indexTo)
    {
        if (indexFrom != null) {
            return messageService.getMessagesPaginated(indexFrom, indexTo);
        }
        List messages = messageService.getMessages();

        for (Object temp : messages) {
            System.out.println(temp);
        }

        return messages;
    }

    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") long id) {
        return messageService.getMessage(id);
    }

    @POST
    public Message addMessages(Message message) {
        return  messageService.addMessage(message);
    }
    @PUT
    @Path("/{messageId}")
    public Message updateMessages(
            Message message,
            @PathParam("messageId") long id)
    {
        message.setId(id);
        return  messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    public void deleteMessage(@PathParam("messageId") long id) {
        messageService.removeMessage(id);
    }

    /**
     * Getting all comments of a message (subresource).
     * Path-annotation is not required, since all methodes should be handled via this java methode.
     * @return CommentResource
     */
    @Path("/{messageId}/comments")
    public CommentResource getCommentResource() {
        return new CommentResource();
    }
}
