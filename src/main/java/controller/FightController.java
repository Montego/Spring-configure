package controller;

import entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.ICharacterService;
import service.fightImpl1.IFightService;

import java.util.List;

@RestController
@RequestMapping("fight")
public class FightController {
    private final IFightService fightService;
    private final ICharacterService characterService;

    @Autowired
    public FightController(IFightService fightService, ICharacterService characterService) {
        this.fightService = fightService;
        this.characterService = characterService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> fight(@RequestBody List<Long> ids) {
        Character char1 = characterService.getOneCharacter(ids.get(0));
        Character char2 = characterService.getOneCharacter(ids.get(1));
        return new ResponseEntity<>(fightService.fight(char1, char2), HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> addFight (@RequestBody Fight fight) {
//        return new ResponseEntity<>(fightService.addFight(fight), HttpStatus.CREATED);
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFights() {
        return new ResponseEntity<>(fightService.getFights(), HttpStatus.OK);

    }
}
