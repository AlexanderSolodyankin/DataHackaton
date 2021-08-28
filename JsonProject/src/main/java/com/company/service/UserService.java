package com.company.service;

import com.company.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("users")
public class UserService {
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<User> getAllUsers(){
        return new ArrayList<>();
    }

    @GET
    @Path("/{userId}")//localhost:8080/contextPath/rest/users/1
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("userId") Long userId){
        return  User.builder()
                .id(userId)
                .name("Jeson")
                .password("111")
                .createdDate(new Date())
                .build();
    }
}
