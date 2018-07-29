package service;


import entity.Armor;
import entity.Character;

public interface ICharacterService {
    Character addCharacter(Character character);
    Character getCharacter(Character character);
    void deleteCharacter(Character character);

}
