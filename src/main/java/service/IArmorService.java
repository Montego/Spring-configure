package service;

import entity.Armor;
import entity.TypeArmor;

import java.util.ArrayList;
import java.util.List;

public interface IArmorService {
    Armor addArmor(Armor armor);

    List<Armor> getArmors(TypeArmor typeArmor);
    Armor getOneArmor(String name);
    List<Armor> getAllArmors();

}
