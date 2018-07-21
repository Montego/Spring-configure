package service;

import org.springframework.stereotype.Service;

@Service
public interface ICharacterService {
    void addCharacter();
    void changeCharacter();
    void deleteCharacter();
}
