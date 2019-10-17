package br.jus.tre_pa.app.scoop2019.security.resource;

import org.keycloak.representations.idm.authorization.ResourceRepresentation;
import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;

import br.jus.tre_pa.jsecurity.AbstractResourceConfiguration;

@Component
public class DefaultResource extends AbstractResourceConfiguration {

	@Override
	public void configure(ResourceRepresentation representation) {
		representation.setName("DEFAULT_RESOURCE");
		representation.setUris(Sets.newHashSet("/*"));
		representation.addScope("GET", "PUT", "DELETE", "POST");
	}

}
