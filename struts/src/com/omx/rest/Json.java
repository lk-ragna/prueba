package com.omx.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.*;


@Path("Json")
public class Json {

	
	@GET 
	@Path("/Regresar_json") 
	@Produces(MediaType.APPLICATION_JSON)
	public String Regresar_json() {
	Usuario us[]=new Usuario[3]; 
	Usuario u=new Usuario("Fulanito1","Apellido_Paterno1","Apellido_Materno1","Rol1");
	Usuario u1=new Usuario("Fulanito2","Apellido_Paterno2","Apellido_Materno2","Rol2");
	Usuario u2=new Usuario("Fulanito3","Apellido_Paterno3","Apellido_Materno3","Rol3");
	us[0]=u;
	us[1]=u1;
	us[2]=u2;
	Gson g=new Gson();
	return g.toJson(us);
	}
	
}
