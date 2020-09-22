package org.my.group.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.my.group.domain.Product;
import org.my.group.service.ProductService;

@ApplicationScoped
@Path("/init")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    private ProductService productService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Quarkus";
    }

    @POST
    @Path("/add/products")
    @Produces("application/json")
    public Response addProduct(Product product){
        productService.addProduct(product);
        return Response.ok().build();
    }

    @GET
    @Path("/products")
    @Produces("application/json")
    public Response getAllProducts(){
        return Response.ok(productService.getAllProducts()).build();
    }
}