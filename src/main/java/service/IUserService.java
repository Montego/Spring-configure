package service;

import entity.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);

    void deleteUser(User user);

    List<User> getUsers();

    User getUser(String login);

    User getUser(String login, String authority);

    User getUser(long id);
}
