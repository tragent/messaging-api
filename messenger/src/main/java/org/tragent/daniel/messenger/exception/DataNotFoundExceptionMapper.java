package org.tragent.daniel.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.tragent.daniel.messenger.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException arg){
		ErrorMessage errorMessage = new ErrorMessage(arg.getMessage(), 404, "http://javabrains.koushik.com");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
}
