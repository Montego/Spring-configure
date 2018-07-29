package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FightRepository;
import service.fightImpl1.IFightService;

@Service
public class FightService implements IFightService {
    @Autowired
    private FightRepository fightRepository;

    public String fight(Character char1, Character char2) {
        return null;
    }
}
