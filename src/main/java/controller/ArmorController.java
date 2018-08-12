package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.IArmorService;

@RestController
@RequestMapping("armor")
public class ArmorController {

    private final IArmorService armorService;

    @Autowired
    public ArmorController(IArmorService armorService) {
        this.armorService = armorService;

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllArmors() {
        return new ResponseEntity<>(armorService.getAllArmors(), HttpStatus.OK);

    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getOneArmor(@PathVariable String name) {
        return new ResponseEntity<>(armorService.getOneArmor(name), HttpStatus.OK);
    }

    @RequestMapping(value = "/{type}", method = RequestMethod.GET)
    public ResponseEntity<?> getArmors(@PathVariable Enum typeArmor) {
        return new ResponseEntity<>(armorService.getArmors(typeArmor), HttpStatus.OK);
    }
}
