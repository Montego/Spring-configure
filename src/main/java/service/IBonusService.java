package service;

import entity.Bonus;

public interface IBonusService {
    Bonus addBonus(Bonus bonus);
    Bonus changeBonus(Bonus bonus);
    void deleteBonus(Bonus bonus);

}
