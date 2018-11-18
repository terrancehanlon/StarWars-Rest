package hello;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;

@Service
public class SithRepositoryCustomImpl implements SithRepositoryCustom {
	
	@PersistenceContext
	EntityManager entitiyManager;
	
	@Override
	public List<Sith> getSithBySpecie(String specie){
		Query query = entitiyManager.createQuery(
				"select name, id from Sith WHERE species = ?1"
				);
		query.setParameter(1, specie);
		List<Sith> res = query.getResultList();
		return res;
	}
	
	@Override
	public List<Sith> getSithByName(String name){
		Query query = entitiyManager.createQuery(
				"select name, id, species from Sith WHERE name = ?1"
				);
		query.setParameter(1, name);
		List<Sith> res = query.getResultList();
		return res;
	}
	
	@Override
	public String saveJedi(@RequestBody Sith sith) {
		return "saved";
	}
	
	//todo when front end is implemented ? 
	public void updateJediAffiliationTable(String name) {
		
	}
	
}
