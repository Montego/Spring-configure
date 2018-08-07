package repository;

import entity.TypeWeapon;
import entity.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeaponRepository extends JpaRepository<Weapon, Long> {
    Weapon findByName(String name);
    List<Weapon> findByTypeWeapon(TypeWeapon typeWeapon);
}
