package service;

import entity.Armor;
import org.springframework.stereotype.Service;

@Service
public interface IArmorService {
    Armor addArmor(Armor armor);
    void changeArmor();
    void deleteArmor();
}
