package service.impl;

import entity.TypeWeapon;
import entity.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.WeaponRepository;
import service.IWeaponService;

import java.util.List;

@Service
public class WeaponService implements IWeaponService {

    private WeaponRepository weaponRepository;

    @Autowired
    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    @Override
    public Weapon addWeapon(Weapon weapon) {
        return weaponRepository.save(weapon);
    }

    @Override
    public List<Weapon> getAllWeapons() {
        return weaponRepository.findAll();
    }

    @Override
    public Weapon getOneWeapon(String name) {
        return weaponRepository.findByName(name);
    }

    @Override
    public List<Weapon> getWeapons(TypeWeapon typeWeapon) {
        return weaponRepository.findByTypeWeapon(typeWeapon);
    }


}
