package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.IRaceService;

@RestController
@RequestMapping("race")
public class RaceController {
    private final IRaceService raceService;

    @Autowired
    public RaceController(IRaceService raceService) {
        this.raceService = raceService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllRaces() {
        return new ResponseEntity<>(raceService.getAllRaces(), HttpStatus.OK);

    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getOneRace(@PathVariable String name) {
        return new ResponseEntity<>(raceService.getOneRace(name), HttpStatus.OK);
    }
}
