package service;

import entity.Weapon;

public interface IWeaponService {
    Weapon addWeapon(Weapon weapon);
    Weapon getWeapon(Weapon weapon);
}
