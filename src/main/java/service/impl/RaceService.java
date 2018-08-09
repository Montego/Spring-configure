package service.impl;

import entity.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import repository.RaceRepository;
import service.IRaceService;

import java.util.List;

@Service
public class RaceService implements IRaceService {

    private RaceRepository raceRepository;

    @Autowired
    public RaceService(RaceRepository raceRepository){
        this.raceRepository = raceRepository;
    }

    public Race getOneRace(String name) {
        return raceRepository.findByName(name);
    }

    public Race addRace(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }
}
