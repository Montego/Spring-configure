package service;

import org.springframework.stereotype.Service;

@Service
public interface IArmorService {
    void addArmor();
    void changeArmor();
    void deleteArmor();
}
