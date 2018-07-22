package repository;

import entity.Character;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    Character findByName (String name);
    List<Character> findByUser (User owner);

}
