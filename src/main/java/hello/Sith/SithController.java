package hello.Sith;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import hello.Jedi.JediRepositoryCustomImpl;

@Controller
@RequestMapping(path="/sith")
public class SithController {
	
	private JediRepositoryCustomImpl sithRepoCustom;
	
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
	
	@GetMapping(path="/species/{specie}")
	public @ResponseBody List<Sith> getSithBySpecie(String specie){
		return sithRepo.getSithBySpecie(specie);
	}
	
	@GetMapping(path="/name/{name}")
	public @ResponseBody List<Sith> getSithByName(String name){
		return sithRepo.getSithByName(name);
	}

}
