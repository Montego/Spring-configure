package service;

import entity.Race;

import java.util.List;

public interface IRaceService {
    Race getOneRace(String name);

    List<Race> getAllRaces();

    Race addRace(Race race);
}
