package service.impl;

import entity.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import repository.RaceRepository;
import service.IRaceService;

@Service
public class RaceService implements IRaceService {

    private RaceRepository raceRepository;

    @Autowired
    public RaceService(RaceRepository raceRepository){
        this.raceRepository = raceRepository;
    }

    public Race getRace(Race race) {
        return raceRepository.getOne(race.getId());
    }

    public Race addRace(Race race) {
        return raceRepository.save(race);
    }

}
