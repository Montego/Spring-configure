package service.impl;

import entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AuthorityRepository;
import service.IAuthorityService;

@Service
public class AuthorityService implements IAuthorityService {

    private AuthorityRepository authorityRepository;

    @Autowired
    public AuthorityService(AuthorityRepository authorityRepository){
        this.authorityRepository = authorityRepository;
    }

    public Authority getAuthority(Authority authority) {
        return authorityRepository.getOne(authority.getId());
    }

    public Authority addAuthority(Authority authority) {
        return authorityRepository.save(authority);
    }

    @Override
    public Authority getByRole(String role) {
        return authorityRepository.findByAuthority(role);
    }

    @Override
    public Authority getAllRoles() {
        return (Authority) authorityRepository.findAll();
    }


}
