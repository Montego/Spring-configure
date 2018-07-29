package service.impl;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.IUserService;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;


    public User addUser(User user) {
        user.setRegistrated(new Timestamp(new Date().getTime()));
        return userRepository.save(user);
    }

    public User changeUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
