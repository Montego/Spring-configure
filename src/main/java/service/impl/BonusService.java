package service.impl;

import entity.Battlefield;
import entity.Bonus;
import entity.Character;
import entity.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BonusRepository;
import service.IBonusService;

@Service
public class BonusService implements IBonusService {
    private BonusRepository bonusRepository;


    @Autowired
    public BonusService(BonusRepository bonusRepository) {
        this.bonusRepository = bonusRepository;

    }

    public Bonus getBonus(Bonus bonus) {
        return bonusRepository.getOne(bonus.getId());               //переделать
    }

    public Bonus calculateBonus(Character character, Battlefield battlefield) {
        Race ch = character.getRace();
        String bf = battlefield.toString();
        Bonus bonus = new Bonus();

        if (ch.getName() == "ELF" && bf == "FOREST") {
            return new Bonus(5, 10);
        }
        if (ch.getName() == "ORK" && bf == "FIELD") {
            return new Bonus(10, 5);
        }
        if (ch.getName() == "HUMAN" && bf == "MOUNTAIN") {
            return new Bonus(8, 8);
        }
        if (bf == "BOG") {
            return new Bonus(-5, -5);
        }
        return bonus;
    }

}

