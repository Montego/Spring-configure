package service;

import org.springframework.stereotype.Service;

@Service
public interface IWeaponService {
    void addWeapon();
    void changeWeapon();
    void deleteWeapon();
}
