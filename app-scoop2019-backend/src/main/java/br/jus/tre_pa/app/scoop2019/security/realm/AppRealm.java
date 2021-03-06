package br.jus.tre_pa.app.scoop2019.security.realm;

import org.keycloak.representations.idm.RealmRepresentation;
import org.springframework.stereotype.Component;

import br.jus.tre_pa.jsecurity.AbstractRealmConfiguration;

/**
 * Classe responsável pelo registro do Realm da aplicação.
 * 
 * @author jcruz
 *
 */
@Component
public class AppRealm extends AbstractRealmConfiguration {

	@Override
	public void configure(RealmRepresentation representation) {
		representation.setRealm(getKcProperties().getRealm());
		representation.setDisplayName(getKcProperties().getRealm());
		representation.setEnabled(true);
		representation.setBruteForceProtected(true);
	}

}
