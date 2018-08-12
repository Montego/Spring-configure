package service.impl;

import entity.Battlefield;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BattlefieldRepository;
import service.IBattlefieldService;

import java.util.List;

public class BattlefieldService implements IBattlefieldService {

    private BattlefieldRepository battlefieldRepository;
    @Autowired
    public BattlefieldService(BattlefieldRepository battlefieldRepository){
        this.battlefieldRepository = battlefieldRepository;
    }

    @Override
    public Battlefield getBattlefield(String battlefield) {
        return battlefieldRepository.findByName(battlefield);
    }

    @Override
    public List<Battlefield> getAllBattlefield() {
        return battlefieldRepository.findAll();
    }


}
