package service.impl;

import entity.Battlefield;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BattlefieldRepository;
import service.IBattlefieldService;

import java.util.List;

@Service
public class BattlefieldService implements IBattlefieldService {

    private BattlefieldRepository battlefieldRepository;

    @Autowired
    public BattlefieldService(BattlefieldRepository battlefieldRepository) {
        this.battlefieldRepository = battlefieldRepository;
    }


    public Battlefield getBattlefield(String battlefield) {
        return battlefieldRepository.findByName(battlefield);
    }


    public List<Battlefield> getAllBattlefield() {
        return battlefieldRepository.findAll();
    }


}
