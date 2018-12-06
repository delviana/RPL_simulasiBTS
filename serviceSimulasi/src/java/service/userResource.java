/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.userHelper;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Acer
 */
@Path("user")
public class userResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of userResource
     */
    public userResource() {
    }

    /**
     * Retrieves representation of an instance of service.userResource
     * @return an instance of java.lang.String
     */
    @GET
    
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        userHelper test = new userHelper();
        List<User> list = test.getAllUser();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response
                .status(200)
                .entity(json)
                .build();
    } 
    
    

    /**
     * PUT method for updating or creating an instance of userResource
     * @param content representation for the resource
     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void putJson(String content) {
//    }
        @POST
    @Path("login")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(String data) {
        Gson gson = new Gson();
        User user = gson.fromJson(data, User.class);
        userHelper helper = new userHelper();
        helper.getUser(user.getUsername(), user.getPassword());
        return Response
                .status(200)
                .entity(helper.getUser(user.getUsername(), user.getPassword()))
                .build();
    }
}
