package repository;

import entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race,Long> {
    Race findByName (String name);
}
