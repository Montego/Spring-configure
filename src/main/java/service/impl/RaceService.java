package service.impl;

import entity.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RaceRepository;
import service.IRaceService;

@Service
public class RaceService implements IRaceService {
    @Autowired
    private RaceRepository raceRepository;

    public Race addRace(Race race) {
        return null;
    }

    public Race changeRace(Race race) {
        return null;
    }
}
