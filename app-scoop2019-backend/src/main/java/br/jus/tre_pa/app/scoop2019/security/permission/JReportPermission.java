package br.jus.tre_pa.app.scoop2019.security.permission;
import org.keycloak.representations.idm.authorization.ResourcePermissionRepresentation;

import br.jus.tre_pa.jsecurity.AbstractPermissionConfiguration;
import org.springframework.stereotype.Component;

@Component
public class JReportPermission extends AbstractPermissionConfiguration {

	@Override
	public void configure(ResourcePermissionRepresentation representation) {
		representation.setName("JREPORT_PERMISSION");
		representation.addResource("JREPORT_RESOURCE");
		representation.addPolicy("USER_POLICY");
	}

}
