package security;

import entity.Password;
import entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import service.IPasswordService;
import service.IUserService;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthenticationService implements IAuthenticationService {

    private static final String KEY = "abc123";
    private static final long TOKEN_PERIOD = 10 * 24 * 60 * 60 * 1000;
    private static final String HEADER_AUTHORIZATION = "Authorization";

    public User currentUser;

    private IUserService userService;
    private IPasswordService passwordService;
    private PasswordEncoder encoder;

    @Autowired
    public AuthenticationService(IUserService userService, IPasswordService passwordService, PasswordEncoder encoder) {
        this.userService = userService;
        this.passwordService = passwordService;
        this.encoder = encoder;
    }

    public String generateToken(String username, String password) {
        if (username == null || password == null)
            return null;
        User realUser = userService.getUser(username);
        if (realUser == null || !password.equals(realUser.getPassword().getPassword())) return null;
        Map<String, Object> tokenData = new HashMap<String, Object>();
        Date now = new Date();
        tokenData.put("userID", realUser.getId());
        tokenData.put("username", username);
        tokenData.put("password", password);
        tokenData.put("scope", realUser.getRole().getAuthority());
        tokenData.put("token_create_date", now.getTime());
        tokenData.put("token_expiration_date", now.getTime() + TOKEN_PERIOD);
        JwtBuilder jwtBuilder = Jwts.builder();
        jwtBuilder.setClaims(tokenData);
        jwtBuilder.setExpiration(new Date(now.getTime() + TOKEN_PERIOD));
        return jwtBuilder.signWith(SignatureAlgorithm.HS512, KEY).compact();
    }

    public Authentication getAuthentication(String token) {
        if (token == null) return null;
        Claims tokenData = Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
        String username = tokenData.get("username").toString();
        currentUser = userService.getUser(username);
        if (currentUser == null) return null;
        String password = tokenData.get("password").toString();
        String role = tokenData.get("scope").toString();
        return new UsernamePasswordAuthenticationToken(username, password, AuthorityUtils.createAuthorityList(role));
    }

    public Authentication getAuthentication(HttpServletRequest httpServletRequest) {
        return getAuthentication(httpServletRequest.getHeader(HEADER_AUTHORIZATION));
    }
}

