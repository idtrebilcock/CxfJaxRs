package co.ivan.cxfjaxrs;

import java.util.List;

import javax.jws.WebParam;

import co.ivan.model.Person;

public interface PersonInterface {
	
	
	List<Person> getPersons();
	
	void postMessage(@WebParam(name = "message") String message);


}
