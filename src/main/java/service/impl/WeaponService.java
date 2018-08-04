package service.impl;

import entity.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.WeaponRepository;
import service.IWeaponService;

@Service
public class WeaponService implements IWeaponService {

    private WeaponRepository weaponRepository;

    @Autowired
    public WeaponService(WeaponRepository weaponRepository){
        this.weaponRepository = weaponRepository;
    }

    public Weapon addWeapon(Weapon weapon) {
        return weaponRepository.save(weapon);
    }

    public Weapon getWeapon(Weapon weapon) {
        return null;
    }

}
