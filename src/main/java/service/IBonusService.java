package service;

import entity.Battlefield;
import entity.Bonus;
import entity.Character;

public interface IBonusService {
    Bonus getBonus(Bonus bonus);
    Bonus calculateBonus(Character character, Battlefield battlefield);
}
