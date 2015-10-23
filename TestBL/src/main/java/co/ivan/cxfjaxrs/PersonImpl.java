/**
 * 
 */
package co.ivan.cxfjaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import co.ivan.model.Person;

/**
 * @author ivandariotrebilcock
 *
 */
@Component
@Path("/person")
public class PersonImpl implements PersonInterface {
	private static List<Person> personList = new ArrayList<Person>();

	public PersonImpl() {
		super();
		Person person = new Person("Ivan", "mi@mail.com", 27);
		personList.add(person);
		System.out.println("  |-- PersonImpl  --| "+personList.get(0).getName());
	}

	@GET
	@Path("/getPersons")
	@Produces("application/json")
	public List<Person> getPersons() {
		return personList;
	}
	
	@POST
	@Path("/postMessage")
	@Produces("application/json")
	public void postMessage(String message) {
        System.out.println(message);
    }
	 	

}