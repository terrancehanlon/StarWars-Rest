package hello.Jedi;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jedi")
public class Jedi {
	    @Id
	    String id;
	    String species;
	    String affiliations;
	    String name;

	    public Jedi(String id, String species, String affiliations, String name){
	        this.id = createId();
	        this.species = species;
	        this.affiliations = affiliations;
	        this.name = name;
	    }

	    public Jedi(){
	        this.id = "test";
	        this.species = "test";
	        this.affiliations = "test";
	        this.name = "test";
	    }

	    public String createId(){
	        String _id = "";

	        for(int i = 0; i < 6; i++){
	            _id += Math.round(Math.random() * 9);
	        }

	        return _id;
	    }


	    public String getId(){
	        return id;
	    }

	    public String getSpecies(){
	        return species;
	    }

	    public String getAffiliations(){
	        return affiliations;
	    }

	    public String getName(){
	        return name;
	    }

	    public void setSpecies(String species){
	        this.species = species;
	    }

	    public void setAffiliations(String affiliations){
	        this.affiliations = affiliations;
	    }

	    public void setName(String name){
	        this.name = name;
	    }
	}

