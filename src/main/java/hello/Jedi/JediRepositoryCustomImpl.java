package hello.Jedi;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service 
public class JediRepositoryCustomImpl implements JediRepositoryCustom{

	   @PersistenceContext
	    EntityManager entityManager;

	   public String hello() {
		   System.out.println("HELLO");
		   return "hello";
	   }
	   	
	    @Override
	    public List<Jedi> getJediBySpecie(String specie) {
	        Query query = entityManager.createQuery("select name, id from Jedi WHERE species = ?1");
	        query.setParameter(1, specie);
	        List<Jedi> res = query.getResultList();
	        return res;
	    }
	    @Override
	    public List<Jedi> getJediByName(String name){
	    	Query query = entityManager.createQuery("select name, id, species from Jedi where name = ?1");
	    	query.setParameter(1, name);
	    	List<Jedi> res = query.getResultList();
	    	
	    	return res;
	    }
	    
	    @Override
	    public String saveJedi(@RequestBody Jedi jedi) {
	    	Query query = entityManager.createQuery(
	    			"insert into Jedi (id, name, species) values(?1, ?2, ?3, ?4");
	    	return "saved";
	    }
	    
	    //todo when front end is implemented..
	    public void updateJediAffiliationTable(String name) {
	    	
	    }
}
