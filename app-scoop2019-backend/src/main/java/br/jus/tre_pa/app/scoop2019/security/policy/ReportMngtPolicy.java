package br.jus.tre_pa.app.scoop2019.security.policy;

import org.keycloak.representations.idm.authorization.RolePolicyRepresentation;
import org.springframework.stereotype.Component;

import br.jus.tre_pa.jsecurity.AbstractRolePolicyConfiguration;

@Component
public class ReportMngtPolicy extends AbstractRolePolicyConfiguration {

	@Override
	public void configure(RolePolicyRepresentation representation) {
		representation.setName("REPORT_MNGT_POLICY");
		representation.addClientRole(getKcProperties().getClientId(), "REPORT_MNGT", true);
	}

}
