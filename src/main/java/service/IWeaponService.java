package service;

import entity.TypeWeapon;
import entity.Weapon;

import java.util.List;

public interface IWeaponService {
    Weapon addWeapon(Weapon weapon);

    List<Weapon> getAllWeapons();
    Weapon getOneWeapon(String name);
    List<Weapon> getWeapons(TypeWeapon typeWeapon);
}
