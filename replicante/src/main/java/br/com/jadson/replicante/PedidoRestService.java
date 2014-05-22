package br.com.jadson.replicante;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



@Path("/pedido")
public class PedidoRestService {
	
	@GET
	@Produces("text/plain")
	@Path("/find/{nome}")
	public String getNameProject(@PathParam("nome") String nome) {
		return "Jadson, " + nome;
		
//		http://localhost:8080/replicante/rs/pedido/find/lindo
	}
}
