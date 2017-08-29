package test.JPA;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AppRepository extends CrudRepository<App, Long> 
	{
	    List<App> findByLastName(String lastName);
	}
