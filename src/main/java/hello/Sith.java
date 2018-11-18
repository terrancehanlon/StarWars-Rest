package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sith")
public class Sith {
    @Id
    String id;
    String species;
    String name;

    public Sith(String id, String species, String name){
        this.id = createId();
        this.species = species;
        this.name = name;
    }

    public Sith(){
        this.id = "test";
        this.species = "test";
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


    public String getName(){
        return name;
    }

    public void setSpecies(String species){
        this.species = species;
    }

  

    public void setName(String name){
        this.name = name;
    }
}
