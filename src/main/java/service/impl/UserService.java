package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;
}
