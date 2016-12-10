package org.tragent.daneil.messenger.resources;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.tragent.daneil.messenger.service.MessageService;
import org.tragent.daneil.messenger.model.Messages;

import java.util.List;

import javax.ws.rs.GET;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Messages> getMessages(){
		return messageService.getAllMessages();
	}
}
