package service;


import entity.Armor;
import entity.Character;

import java.util.List;

public interface ICharacterService {
    Character addCharacter(Character character);
    Character getOneCharacter(String name);
    List<Character> getAllCharacters();
    void deleteCharacter(String name);
    Character getOneCharacter(Long id);

}
