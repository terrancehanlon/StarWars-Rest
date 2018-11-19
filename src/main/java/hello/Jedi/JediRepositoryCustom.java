package hello.Jedi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


@Repository
public interface JediRepositoryCustom {
	
	public List<Jedi> getJediBySpecie(String specie);	
	
	public List<Jedi> getJediByName(String name);
	
	public String saveJedi(@RequestBody Jedi jedi);
	
	public void updateJediAffiliationTable(String jediName);
}
