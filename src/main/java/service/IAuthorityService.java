package service;

import entity.Authority;
import org.springframework.stereotype.Service;

public interface IAuthorityService {
    Authority addAuthority(Authority authority);
    Authority changeAuthority(Authority authority);
    void deleteAuthority(Authority authority);
}
