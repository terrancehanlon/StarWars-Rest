package hello;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface SithRepositoryCustom {

	
	public List<Sith> getSithBySpecie(String specie);	
	
	public List<Sith> getSithByName(String name);
	
	public String saveJedi(@RequestBody Sith sith);
	
	public void updateJediAffiliationTable(String sithName);
	
}
