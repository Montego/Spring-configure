package service.fightImpl1;

import entity.Character;
import entity.Fight;

import java.util.List;

public interface IFightService {
    String fight(Character char1, Character char2);
    Fight addFight(Fight fight);
    List<Fight> getFights();
}
