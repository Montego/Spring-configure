package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import repository.PasswordRepository;

public class PasswordService {
    @Autowired
    private PasswordRepository passwordRepository;
}
