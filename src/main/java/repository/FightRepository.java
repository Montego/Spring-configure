package repository;

import entity.Fight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FightRepository extends JpaRepository<Fight, Long> {

}
