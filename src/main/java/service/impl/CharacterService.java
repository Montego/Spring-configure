package service.impl;

import entity.Character;
import entity.TypeArmor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CharacterRepository;
import service.ICharacterService;

import java.util.List;

@Service
public class CharacterService implements ICharacterService {

    private CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    public Character addCharacter(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character getOneCharacter(String name) {
        return characterRepository.findByName(name);
    }

    @Override
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public void deleteCharacter(String name) {

    }
}
