package service;

import entity.Weapon;
import org.springframework.stereotype.Service;

@Service
public interface IWeaponService {
    Weapon addWeapon(Weapon weapon);
    Weapon changeWeapon(Weapon weapon);
    Weapon deleteWeapon(Weapon weapon);
}
