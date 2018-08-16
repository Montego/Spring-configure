package security;

import entity.Password;

public interface IAuthenticationService {
    String generateToken(String login, Password password);
}
