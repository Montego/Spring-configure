package service.impl;

import entity.*;
import entity.Character;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FightRepository;
import service.fightImpl1.IFightService;

import java.util.Arrays;
import java.util.List;
import static entity.TypeArmor.*;
import static entity.TypeWeapon.BOW;
import static entity.TypeWeapon.MACE;
import static org.junit.Assert.*;

@Service
public class FightServiceTest {

    private FightRepository fightRepository;

    @Autowired
    public FightServiceTest(FightRepository fightRepository) {
        this.fightRepository = fightRepository;
    }
    //int powerChar1 = 30;
    //int powerChar2 = 45;
    private User user1 = new User();
    private Armor headArmor1 = new Armor(10, HEAD, "шлем1");
    private Armor bodyArmor1 = new Armor(15, BODY, "доспех1");
    private Armor legsArmor1 = new Armor(5, LEGS, "поножи1");
    private Armor headArmor2 = new Armor(12, HEAD, "шлем3");
    private Armor bodyArmor2 = new Armor(20, BODY, "доспех3");
    private Armor legsArmor2 = new Armor(1, LEGS, "поножи3");
    private List<Armor> armors1 = Arrays.asList(headArmor1, bodyArmor1, legsArmor1);
    //List<Armor> armors1 = new ArrayList<Armor>();
    private List<Armor> armors2 = Arrays.asList(headArmor2, bodyArmor2, legsArmor2);
    //armors1.add(bodyArmor1);                  TODO почему не работает?

    private Weapon weapon1 = new Weapon(35, MACE, "MACE");
    private Weapon weapon2 = new Weapon(25, BOW, "BOW");
    private AttributeSet orcSet = new AttributeSet(20, 10, 5);
    private AttributeSet elfSet = new AttributeSet(17, 8, 10);
    private Race orc = new Race("ORC", orcSet);
    private Race elf = new Race("ELF", elfSet);
    private Character char1Test = new Character("Character №1", user1, armors1, weapon1, orc);
    private Character char2Test = new Character("Character №2", user1, armors2, weapon2, elf);

    int powerChar1TestExpecting = 10 + 15 + 5 + 35 + 20 + 10 + 5;               //100
    int powerChar2TestExpecting = 12 + 20 + 1 + 25 + 17 + 8 + 10;               //93

    private int calculatePowerChar(Character character) {
        int charPower = character.getWeapon().getDamage() + character.getArmor().stream().mapToInt(Armor::getDefense).sum() + character.getRace().getAttributeSet().getAttack() +
                character.getRace().getAttributeSet().getDefence() + character.getRace().getAttributeSet().getNonDamageChance();
        return charPower;
    }

//    public String calculatePowerCharToString(Character character){
//        return String.valueOf(calculatePowerChar(character));
//    }

    @Test
    public void shouldCorrectCalculatingPowerChar() {
        Character char1 = char1Test;
        int powerChar1Test = calculatePowerChar(char1);
        int expectingPower = 100;
        assertTrue (powerChar1Test == expectingPower);
    }

    @Test
    public void shouldCorrectFightMessage() {
        Character char1 = char1Test;
        Character char2 = char2Test;
        IFightService fightService = new FightService(fightRepository);
        String resultMessage = fightService.fight(char1,char2);
        int powerChar1 = calculatePowerChar(char1);
        int powerChar2 = calculatePowerChar(char2);
        int result = powerChar1 - powerChar2;
        String expectingMessageTemplate = "Character №1 Победил!\n Сharacter№1 сильнее на : " + result + " очков";
        assertTrue(resultMessage.equals(expectingMessageTemplate));
    }


    @Test
    public void addFight() {
    }

    @Test
    public void getFights() {
    }
}