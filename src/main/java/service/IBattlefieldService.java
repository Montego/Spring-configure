package service;

import entity.Battlefield;

import java.util.List;

public interface IBattlefieldService {
    Battlefield getBattlefield(String battlefield);

    List<Battlefield> getAllBattlefield();
}
