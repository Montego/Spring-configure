package service.impl;

import entity.Character;
import entity.TypeArmor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CharacterRepository;
import service.ICharacterService;

@Service
public class CharacterService implements ICharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public Character addCharacter(Character character) {
        return characterRepository.save(character);
    }

    public Character getCharacter(Character character) {
        return null;
    }

    public void deleteCharacter(Character character) {

    }
}
