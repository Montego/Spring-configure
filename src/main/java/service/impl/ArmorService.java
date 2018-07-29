package service.impl;

import entity.Armor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ArmorRepository;
import service.IArmorService;

@Service
public class ArmorService implements IArmorService {
    @Autowired
    private ArmorRepository armorRepository;

    public Armor addArmor(Armor armor) {
        return armorRepository.save(armor);
    }

    public void deleteArmor(Armor armor) {

    }
}