package service;

import org.springframework.stereotype.Service;

@Service
public interface ICharacterService {
    Character addCharacter(Character character);
    Character changeCharacter(Character character);
    void deleteCharacter(Character character);
}
