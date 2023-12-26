# KEYCLOAK authentication and authorization
---------------------------------------------------------------------

**To setup keycloak using docker**
docker pull keycloak/keycloak:23.0.3
docker run -p 8090:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin keycloak/keycloak:23.0.3 start-dev


Go to http://localhost:8090/

Login with admin/admin

Create New Realm for the application like **SpringBootKeyCloak**

Then switch realm from master to SpringBootKeyCloak

Then create one client with name **keycloak-boot-app**
 and add redirect URIs

Then create role from Realm Role tab like **user**

Now create user with name **alok** and add password in credentials tab.
Now use Role mapping tab to assign existing user role to the user **alok**.

Now add all the configuration for keycloak in application.properties

Add one security config for intercepting all request for authentication and authorization.


