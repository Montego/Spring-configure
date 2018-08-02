package service.impl;

import entity.Bonus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BonusRepository;
import service.IBonusService;

@Service
public class BonusService implements IBonusService {
    @Autowired
    private BonusRepository bonusRepository;

    @Autowired
    private FightService fightService;

    public Bonus getBonus(Bonus bonus) {
        return bonusRepository.getOne(bonus.getId());
    }
}

