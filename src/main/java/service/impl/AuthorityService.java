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

    public Authority addAuthority(Authority authority) {
        return authorityRepository.save(authority);
    }

    public Authority changeAuthority(Authority authority) {
        return null;
    }

    public void deleteAuthority(Authority authority) {

    }
}
