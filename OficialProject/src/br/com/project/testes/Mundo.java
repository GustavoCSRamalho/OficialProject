package br.com.project.testes;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {
	@Get @Path("/boasvindas")
	public void boasVindas(){
		System.out.println("Ola Mundo!");
	}

}
