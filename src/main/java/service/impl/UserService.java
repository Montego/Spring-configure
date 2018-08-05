package service.impl;

import entity.Authority;
import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AuthorityRepository;
import repository.UserRepository;
import service.IUserService;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class UserService implements IUserService {

    private UserRepository userRepository;
    private AuthorityService authorityService;
   // private AuthorityRepository authorityRepository;

    @Autowired
    public UserService(UserRepository userRepository, AuthorityService authorityService) {
        this.userRepository = userRepository;
        this.authorityService = authorityService;
    }

    public User addUser(User user) {
        if (user == null || user.getLogin() == null || user.getPassword() == null) return null;
        user.setRole(authorityService.getByRole("ROLE_USER"));
        user.setRegistrated(new Timestamp(new Date().getTime()));
        User savedUser = userRepository.save(user);
        log.info("User " + savedUser.getLogin() + " saved with id: " + savedUser.getId());
        return savedUser;
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String login) {
        return userRepository.findByLogin(login);
    }

    public User getUser(String login, String authority) {
        Authority role = authorityService.getByRole(authority);
        return userRepository.findByLoginAndRole(login, role);
    }

    public User getUser(long id) {
        return userRepository.findById(id).orElse(null);
    }

//    public List<Authority> getAllRoles() {
//        //return authorityService.findAll();
//        return authorityRepository.findAll();
//    }


}
