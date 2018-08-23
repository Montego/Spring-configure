package security;

import entity.Password;
import entity.User;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import service.IPasswordService;
import service.IUserService;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService implements IAuthenticationService {

    private static final String KEY = "abc123";
    private static final long TOKEN_PERIOD = 10;

    private IUserService userService;
    private IPasswordService passwordService;

    @Autowired
    public AuthenticationService(IUserService userService, IPasswordService passwordService) {
        this.userService = userService;
        this.passwordService = passwordService;
    }

    public String generateToken(String username, Password password) {
        if (username == null || password == null)
            return null;
        User realUser = userService.getUser(username);
        if (realUser == null || !password.equals(realUser.getPassword())) return null;
        Map<String, Object> tokenData = new HashMap<String, Object>();
        LocalDate now = LocalDate.now();
        tokenData.put("userID", realUser.getId());
        tokenData.put("username", realUser.getLogin());
        tokenData.put("scope", realUser.getRole().getAuthority());
        tokenData.put("token_create_date", now.toEpochDay());
        tokenData.put("token_expiration_date", now.plusDays(TOKEN_PERIOD).toEpochDay());
        JwtBuilder jwtBuilder = Jwts.builder();
        jwtBuilder.setClaims(tokenData);
        jwtBuilder.setExpiration(new Date(now.plusDays(TOKEN_PERIOD).toEpochDay()));
        return jwtBuilder.signWith(SignatureAlgorithm.HS512, KEY).compact();
    }

    public Authentication getAuthentication(String token) {
//        if (token == null) return null;
//        Claims tokenData = Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
//        String username = tokenData.get("username").toString();
//        return UsernamePasswordAuthenticationToken
        return null;
    }
}

