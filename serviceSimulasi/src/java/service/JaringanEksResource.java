/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.jaringanEksHelper;
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
import pojos.JaringanEks;

/**
 * REST Web Service
 *
 * @author Acer
 */
@Path("jaringanEks")
public class JaringanEksResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of JaringanEksResource
     */
    public JaringanEksResource() {
    }

    /**
     * Retrieves representation of an instance of service.JaringanEksResource
     * @return an instance of java.lang.String
     */
    @GET
     @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        jaringanEksHelper p = new jaringanEksHelper();
        Gson gson = new Gson();
        return Response.status(Response.Status.OK)
                .entity(gson.toJson(p.bacaSemuaDataJaringanEks()))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "20")
                .header("Access-Preflight-Maxage", "20")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of JaringanEksResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    @POST
      @Path("addJaringanEks")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response AddNewJaringanEks(String data) {
        Gson gson = new Gson();
        JaringanEks dataJaringanEks = gson.fromJson(data, JaringanEks.class);
        jaringanEksHelper helper = new jaringanEksHelper();
        helper.addNewDataJaringanEksisting(
                dataJaringanEks.getIdjaringan(),
                dataJaringanEks.getLat(),
                dataJaringanEks.getLong_(),
                dataJaringanEks.getPowerSinyal());
        return Response.status(200).entity(dataJaringanEks).build();
    }
}
