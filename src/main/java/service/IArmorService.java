package service;

import entity.Armor;

import java.util.List;

public interface IArmorService {
    Armor addArmor(Armor armor);

    List<Armor> getArmors(Enum typeArmor);

    Armor getOneArmor(String name);

    List<Armor> getAllArmors();

}
