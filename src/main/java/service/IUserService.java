package service;

import entity.User;

public interface IUserService{
    User addUser(User user);
    void deleteUser(User user);
}
