package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mkyong.User;

@Path("/user")
public class UserService {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public User getUser() {
		return new User("shijingui", 28, "ÄÐ");
	}

}
