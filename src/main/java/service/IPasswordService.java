package service;

import entity.Password;
import org.springframework.stereotype.Service;

public interface IPasswordService {
    Password addPassword(Password password);
    Password changePassword(Password password);

}
