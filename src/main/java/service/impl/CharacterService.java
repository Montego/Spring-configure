package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import repository.CharacterRepository;

public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;
}
