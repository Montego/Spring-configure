package service;

import entity.Armor;
import org.springframework.stereotype.Service;

public interface IArmorService {
    Armor addArmor(Armor armor);
    Armor changeArmor(Armor armor);
    void deleteArmor(Armor armor);
}
