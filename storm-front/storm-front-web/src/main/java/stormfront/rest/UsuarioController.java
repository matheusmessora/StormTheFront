package stormfront.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import stormfront.controller.UsuarioBean;
import stormfront.model.Usuario;

@Named
@RequestScoped
@Path("usuario")
public class UsuarioController {
	
	@EJB
	private UsuarioBean bean;
	
	
	
	@GET
	@Path("/")
   @Produces(MediaType.APPLICATION_JSON)
	public Usuario buscarUsuario(){
		return bean.find();
	}
	
}
