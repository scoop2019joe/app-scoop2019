package br.jus.tre_pa.app.scoop2019.security.permission;


import org.keycloak.representations.idm.authorization.ResourcePermissionRepresentation;
import org.springframework.stereotype.Component;

import br.jus.tre_pa.jsecurity.AbstractPermissionConfiguration;

@Component
public class JReportMngtPermission extends AbstractPermissionConfiguration {

	@Override
	public void configure(ResourcePermissionRepresentation representation) {
		representation.setName("JREPORT_MNGT_PERMISSION");
		representation.addResource("JREPORT_MNGT_RESOURCE");
		representation.addPolicy("REPORT_MNGT_POLICY");
	}

}
