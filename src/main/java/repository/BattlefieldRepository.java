package repository;

import entity.Battlefield;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattlefieldRepository extends JpaRepository<Battlefield, Long> {
    Battlefield findByName(String battlefield);
}
