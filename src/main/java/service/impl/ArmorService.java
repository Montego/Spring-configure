package service.impl;

import entity.Armor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ArmorRepository;
import service.IArmorService;

import java.util.List;

@Service
public class ArmorService implements IArmorService {

    private ArmorRepository armorRepository;

    @Autowired
    public ArmorService(ArmorRepository armorRepository) {
        this.armorRepository = armorRepository;
    }

    public Armor addArmor(Armor armor) {
        return armorRepository.save(armor);
    }


    public List<Armor> getArmors(Enum typeArmor) {
        return armorRepository.findByTypeArmor(typeArmor);
    }

    @Override
    public Armor getOneArmor(String name) {
        return armorRepository.findByName(name);
    }

    @Override
    public List<Armor> getAllArmors() {
        return armorRepository.findAll();
    }

}