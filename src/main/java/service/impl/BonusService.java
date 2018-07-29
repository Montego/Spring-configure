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

    public Bonus addBonus(Bonus bonus) {
        return null;
    }

    public Bonus changeBonus(Bonus bonus) {
        return null;
    }

    public void deleteBonus(Bonus bonus) {

    }
}
