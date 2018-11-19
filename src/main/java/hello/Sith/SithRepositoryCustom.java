package hello.Sith;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface SithRepositoryCustom {

	
	public List<Sith> getSithBySpecie(String specie);	
	
	public List<Sith> getSithByName(String name);
	
	public String saveSith(@RequestBody Sith sith);
	
	public void updateSithAffiliationTable(String sithName);
	
}
