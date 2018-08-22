package security;

import entity.Password;
import entity.User;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import service.IPasswordService;
import service.IUserService;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService implements IAuthenticationService {

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
        User user = new User();
        Map<String, Object> tokenData = new HashMap<String, Object>();

        if (password.equals(user.getPassword())) {
            tokenData.put("clientType", user.getRole());
            tokenData.put("userID", user.getId().toString());
            tokenData.put("username", user.getLogin());
            tokenData.put("token_create_date", user.getRegistrated());
//            Calendar calendar = Calendar.getInstance();
//            calendar.add(Calendar.YEAR, 100);
//            tokenData.put("token_expiration_date", calendar.getTime());

            JwtBuilder jwtBuilder = Jwts.builder();
//            jwtBuilder.setExpiration(calendar.getTime());
            jwtBuilder.setClaims(tokenData);

            String key = "abc123";
            String token = jwtBuilder.signWith(SignatureAlgorithm.HS512, key).compact();
            return token;
        }
        return "Authentication error";
    }
}

