package service.impl;

import entity.Armor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ArmorRepository;
import service.IArmorService;

@Service
public class ArmorService implements IArmorService {

    private ArmorRepository armorRepository;
    @Autowired
    public ArmorService(ArmorRepository armorRepository){
        this.armorRepository = armorRepository;
    }
    public Armor addArmor(Armor armor) {
        return armorRepository.save(armor);
    }

    public Armor getArmor(Armor armor) {
        return null;
    }

}