package repository;

import entity.Character;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    Character findByName (String name);
    Character findByUser (User owner);

}
