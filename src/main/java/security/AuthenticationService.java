package security;

import java.security.SecureRandom;

public class AuthenticationService implements IAuthentificationService{
    final SecureRandom random = new SecureRandom();

        public synchronized String generateToken( String username ) {
            long longToken = Math.abs( random.nextLong() );
            String random = Long.toString( longToken, 16 );
            return ( username + ":" + random );
        }
}
