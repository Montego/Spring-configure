package service;

import entity.Password;

public interface IPasswordService {
    Password addPassword(Password password);
    Password changePassword(Password password);

}
