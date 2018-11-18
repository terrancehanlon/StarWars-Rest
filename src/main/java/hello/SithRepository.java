package hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SithRepository extends JpaRepository<Sith, String>, SithRepositoryCustom{

}
