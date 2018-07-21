package service;

import org.springframework.stereotype.Service;

@Service
public interface IAuthorityService {
    void addAuthority();
    void changeAuthority();
    void deleteAuthority();
}
