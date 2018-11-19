package hello.Jedi;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JediRepository extends JpaRepository<Jedi, String>, JediRepositoryCustom{
	
	
}
