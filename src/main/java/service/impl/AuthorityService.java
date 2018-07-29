package service.impl;

import entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AuthorityRepository;
import service.IAuthorityService;

@Service
public class AuthorityService implements IAuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;

    public Authority getAuthority(Authority authority) {
        return null;
    }
}
