package security;

public interface IAuthentificationService {
    String generateToken(String user);
}
