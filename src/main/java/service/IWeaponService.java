package service;

import entity.Weapon;

public interface IWeaponService {
    Weapon addWeapon(Weapon weapon);
    Weapon changeWeapon(Weapon weapon);
    void deleteWeapon(Weapon weapon);
}
