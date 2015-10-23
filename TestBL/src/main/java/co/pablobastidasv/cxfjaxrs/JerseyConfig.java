/**
 * 
 */
package co.pablobastidasv.cxfjaxrs;

import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.stereotype.Component;

import co.ivan.cxfjaxrs.PersonImpl;

/**
 * @author ivandariotrebilcock
 *
 */
@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(PersonImpl.class);
	}
}