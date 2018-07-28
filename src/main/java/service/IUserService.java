package service;

import entity.User;
import org.springframework.stereotype.Service;

public interface IUserService{
    User addUser(User user);
    User changeUser(User user);
    void deleteUser(User user);
}
