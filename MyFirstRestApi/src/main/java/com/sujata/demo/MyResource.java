package com.sujata.demo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

    //URI : /webapi/myresource/first
    @Path("/first")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String oneMoreGetIt() {
        return "<h1>Got it!</h1>";
    }

    //URI : /webapi/myresource
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "<h1>Got it!</h1>";
    }
    // URI : webapi/myresource/wish/Batra/Sujata
    @Path("/wish/{lname}/{fname}")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String greetWithPathParam(@PathParam("fname") String firstName,@PathParam("lname") String lastName){
        return "<h1>Hello "+firstName+" "+lastName+" !</h1> ";
    }

    // URI : webapi/myresource/wish?fname=Sujata&lname=Batra
    @Path("/wishagain")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String greetWithQueryParam(@QueryParam("fname") String firstName, @QueryParam("lname") String lastName){
        return "<h1>Hello "+firstName+" "+lastName+" !</h1> ";
    }

    // URI : webapi/myresource/wish;fname=Sujata;lname=Batra
    @Path("/wishme")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String greetWithMatrixParam(@MatrixParam("fname") String firstName, @MatrixParam("lname") String lastName){
        return "<h1>Hello "+firstName+" "+lastName+" !</h1> ";
    }

    //create form and use post request to reach to the URI :/webapi/myresource/wishmeplz
    @Path("/wishmeplz")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public String greetWithFormParam(@FormParam("fname") String firstName, @FormParam("lname") String lastName){
        return "<h1>Hello "+firstName+" "+lastName+" !</h1> ";
    }
}
