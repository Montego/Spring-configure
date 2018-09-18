package repository;

import entity.Armor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArmorRepository extends JpaRepository<Armor, Long> {
    Armor findByName(String name);

    List<Armor> findByTypeArmor(Enum typeArmor);
}
