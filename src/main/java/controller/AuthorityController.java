package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.impl.AuthorityService;

@RestController
@RequestMapping("authority")
public class AuthorityController {

    private final AuthorityService authorityService;

    @Autowired
    public AuthorityController(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(authorityService.getAllRoles(),HttpStatus.OK);
    }
}
