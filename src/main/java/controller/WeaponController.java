package controller;

import entity.TypeWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.IWeaponService;
import service.impl.WeaponService;

@RestController
@RequestMapping("weapon")
public class WeaponController {
    private final IWeaponService weaponService;

    @Autowired
    public WeaponController(IWeaponService weaponService) {
        this.weaponService = weaponService;

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllWeapons() {
        return new ResponseEntity<>(weaponService.getAllWeapons(), HttpStatus.OK);

    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getOneWeapon(@PathVariable String name) {
        return new ResponseEntity<>(weaponService.getOneWeapon(name), HttpStatus.OK);
    }

    @RequestMapping(value = "/{type}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeapons(@PathVariable TypeWeapon typeWeapon) {
        return new ResponseEntity<>(weaponService.getWeapons(typeWeapon), HttpStatus.OK);
    }
}
