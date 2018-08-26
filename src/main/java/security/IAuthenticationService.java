package security;

import entity.Password;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IAuthenticationService {
    String generateToken(String login, String password);
    Authentication getAuthentication(String token);
    Authentication getAuthentication(HttpServletRequest httpServletRequest);
}
