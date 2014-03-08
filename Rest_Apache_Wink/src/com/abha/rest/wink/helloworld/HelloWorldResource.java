package com.abha.rest.wink.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/helloworld")
public class HelloWorldResource {
	String test ="test";
	@GET
	public String getMessage(){
		return "Hello World";
	}

}
