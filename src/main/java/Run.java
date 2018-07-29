import entity.Authority;
import entity.Password;
import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.AuthorityService;
import service.impl.PasswordService;
import service.impl.UserService;

@Slf4j
public class Run {

    //private static final Logger log = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) {

        log.info("Application start");
        log.error("This is error log!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = context.getBean(UserService.class);
        PasswordService passwordService = context.getBean(PasswordService.class);
        AuthorityService authorityService = context.getBean(AuthorityService.class);

        Password password = new Password();
        password.setPassword("sdfdfsdfdsfsdfsdg");
        passwordService.addPassword(password);

        Authority authority = new Authority();
        authority.setAuthority("ADMIN");
        authorityService.addAuthority(authority);


        User user = new User("sadasf", password);
//        user.setLogin("lsdkfjldskjfl");
//        user.setPassword(password);
        user.setRole(authority);

        userService.addUser(user);

        log.info("Aoolication stop");

    }
}