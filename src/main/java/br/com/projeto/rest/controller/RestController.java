package br.com.projeto.rest.controller;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import br.com.projeto.dao.RepositoryUsuario;
import br.com.projeto.domain.Usuario;

/**
 * api-rest
 * @author jaime Des
 * Em: 28 de nov de 2020 **/

@Path("/api")
public class RestController {
	
	RepositoryUsuario repository = new RepositoryUsuario();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String msg() {
		return "Camada Rest de recursos de Usuario";
	}
	
	@Path ("/user")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario user(Usuario usuario) {
		usuario = new Usuario(4,"Tedson",45);
		return usuario;
	}
	@Path("/lista")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> all (){
		List<Usuario> lista = repository.lista();
		return lista;
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response create (Usuario usuario){
		repository.add(usuario);
		return Response.status(Status.CREATED)
				.entity(usuario)
				.build();
	}
	
	public Response update(Usuario usuario) {
		repository.add(usuario);
		return Response.status(Response.Status.OK)
				.entity(usuario)
				.build();
	}
	
	public Response delete (Long id) {
		return Response.status(Response.Status.OK).build();
	}
}
