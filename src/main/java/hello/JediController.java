package hello;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.X11.XConstants;

import java.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hello.JediRepository;
import hello.Tools;

@Controller
@RequestMapping(path="/jedi") // This means URL's start with /demo (after Application path)
public class JediController {

	
    private JediRepositoryCustomImpl jediRepoCustom;
    @Autowired
    private JediRepository jediRepo;

    @RequestMapping(path="/add", method=RequestMethod.POST) // Map ONLY GET Requests
    public @ResponseBody Jedi addNewJedi(@RequestBody Jedi jedi) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
  
        jediRepo.save(jedi);
        String name = jedi.getName();
        System.out.println(name);
        return jedi;
    }
    
    private void updateAffiliationTable(String jediName) {
    	
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Optional<Jedi> getJediById(@PathVariable String id){
        return jediRepo.findById(id);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Jedi> getAllJedi(){
        return jediRepo.findAll();
    }
    
 
    @GetMapping(path="/species/{specie}", produces="application/json")
    public @ResponseBody List<Jedi> getJediBySpecie(@PathVariable String specie){
       return jediRepo.getJediBySpecie(specie);
    }
    
    @GetMapping(path="/name/{name}")
    public @ResponseBody List<Jedi> getJediByName(@PathVariable String name){
    	return jediRepo.getJediByName(name);
    }


}
