package stormfront.controller;

import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

import stormfront.dao.UsuarioDAO;
import stormfront.model.Usuario;

@Stateless
public class UsuarioBean {
	
	@Inject
	private Logger log;

	@EJB
	private UsuarioDAO dao;

	private Usuario usuario;
	
	
	public Usuario find(){
		usuario = dao.findById(1L);
		
		if(usuario == null){
			usuario = new Usuario();
			usuario.setNome("TESTE");
			dao.save(usuario);
			
		}
		
		log.info("TESTE TESTE ");
		return dao.findById(1L); 
	}
}
