package security;

import entity.Password;
import org.springframework.security.core.Authentication;

public interface IAuthenticationService {
    String generateToken(String login, Password password);
    Authentication getAuthentication(String token);
}
