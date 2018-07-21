package service;

import entity.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public interface IUserService{
    void addUser();
    void changeUser();
    void deleteUser();
}
