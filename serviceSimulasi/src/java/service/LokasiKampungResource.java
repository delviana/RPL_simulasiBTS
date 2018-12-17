/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;


import helper.lokasiKampungHelper;
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


import pojos.LokasiDesa;

/**
 * REST Web Service
 *
 * @author Acer
 */
@Path("lokasiKampung")
public class LokasiKampungResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LokasiKampungResource
     */
    public LokasiKampungResource() {
    }

    /**
     * Retrieves representation of an instance of service.LokasiKampungResource
     * @return an instance of java.lang.String
     */
    @GET
    
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        lokasiKampungHelper test = new lokasiKampungHelper ();
        List<LokasiDesa> list = test.bacaSemuaLokasi();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response
                .status(200)
                .entity(json)
                .build();
    }

    /**
     * PUT method for updating or creating an instance of LokasiKampungResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
     @POST
      @Path("addLokasiDesa")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response AddNewLokasiKampung(String data) {
        Gson gson = new Gson();
        LokasiDesa dataLokasiDesa = gson.fromJson(data, LokasiDesa.class);
        lokasiKampungHelper helper = new lokasiKampungHelper();
        helper.addNewLokasiKampung(
                dataLokasiDesa.getIdDesa(),
                dataLokasiDesa.getLat(),
                dataLokasiDesa.getLog(),
                dataLokasiDesa.getJumPenduduk());
        return Response.status(200).entity(dataLokasiDesa).build();
    }
}
