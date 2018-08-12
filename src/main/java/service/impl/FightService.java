package service.impl;

import entity.Armor;
import entity.Character;
import entity.Fight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FightRepository;
import service.fightImpl1.IFightService;

import java.util.List;

@Service
public class FightService implements IFightService {

    private FightRepository fightRepository;

    @Autowired
    public FightService(FightRepository fightRepository) {
        this.fightRepository = fightRepository;
    }


    public String fight(Character char1, Character char2) {

        int powerChar1 = getCharDamage(char1) + getArmorDefence(char1) + getCharAttack(char1) + getCharDefence(char1) + getNonDamage(char1);
        int powerChar2 = getCharDamage(char2) + getArmorDefence(char2) + getCharAttack(char2) + getCharDefence(char2) + getNonDamage(char2);


        String messageTemplate = "%s Победил!\n%s сильнне на : %d очков";
        String winnerName = powerChar1 > powerChar2 ? char1.getName() : char2.getName();

        return String.format(messageTemplate, winnerName, winnerName, powerChar1 - powerChar2);
    }


    public Fight addFight(Fight fight) {
        return fightRepository.save(fight);
    }

    public List<Fight> getFights() {
        return fightRepository.findAll();
    }


    private int getArmorDefence(Character character) {
        return character.getArmor().stream().mapToInt(Armor::getDefense).sum();
    }

    private int getCharDamage(Character character) {
        return character.getWeapon().getDamage();
    }

    private int getCharAttack(Character character) {
        return character.getRace().getAttributeSet().getAttack();
    }

    private int getCharDefence(Character character) {
        return character.getRace().getAttributeSet().getDefence();
    }

    private int getNonDamage(Character character) {
        return character.getRace().getAttributeSet().getNonDamageChance();
    }
}
