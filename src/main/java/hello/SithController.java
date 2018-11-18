package hello;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/sith")
public class SithController {
	
	private SithRepositoryCustomImpl sithRepoCustom;
	
	@Autowired
	private SithRepository sithRepo;
	
	@GetMapping(path="/help")
	public String help() {
		return "HELP";
	}
	
	@GetMapping(path="/error")
	public @ResponseBody String error() {
		return "Error Page";
	}
	
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public @ResponseBody Sith addNewSith(@RequestBody Sith sith) {
		sithRepo.save(sith);
		return sith;
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Sith> getAllSith(){
		return sithRepo.findAll();
	}

}
