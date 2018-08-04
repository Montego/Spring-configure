package service.impl;

import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.IUserService;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        user.setRegistrated(new Timestamp(new Date().getTime()));
        User savedUser = userRepository.save(user);
        log.info("User " + savedUser.getLogin() + " saved with id: " + savedUser.getId());
        return savedUser;
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUser(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public User saveUser() {
        return null;
    }
}
