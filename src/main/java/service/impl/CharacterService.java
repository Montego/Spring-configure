package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CharacterRepository;
import service.ICharacterService;

@Service
public class CharacterService implements ICharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public Character addCharacter(Character character) {
        return null;
    }

    public Character changeCharacter(Character character) {
        return null;
    }

    public void deleteCharacter(Character character) {

    }
}
