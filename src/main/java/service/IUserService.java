package service;

import org.springframework.stereotype.Service;

@Service
public interface IUserService{
    void addUser();
    void changeUser();
    void deleteUser();
}
