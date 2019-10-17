// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

export const environment = {
  production: false,
  contextPath: '/server-api/app-scoop2019',
  urlbase: '/server-api/app-scoop2019/api',
  keycloak_installation: { realm: 'TRE-PA', clientId: 'app-scoop2019-frontend' },
  keycloak_redirect_uri: '/app-scoop2019',
  keycloak_clientId_sboot: 'app-scoop2019-backend'
};

/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.
