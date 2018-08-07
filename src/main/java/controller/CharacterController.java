package controller;

import entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.impl.CharacterService;

@RestController
@RequestMapping("character")
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCharacters() {
        return new ResponseEntity<>(characterService.getAllCharacters(), HttpStatus.OK);

    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getOneCharacter(@PathVariable String name) {
        return new ResponseEntity<>(characterService.getOneCharacter(name), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addCharacter(@RequestBody Character character) {
        return new ResponseEntity<>(characterService.addCharacter(character), HttpStatus.CREATED);

    }
}
