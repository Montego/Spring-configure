package controller;

import entity.Authority;
import entity.Password;
import entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserService;
import service.impl.UserService;

public class Run {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = context.getBean(UserService.class);

        Password password = new Password();
        password.setPassword("sdfdfsdfdsfsdfsdg");

        Authority authority = new Authority();
        authority.setAuthority("ADMIN");


        User user = new User();
        user.setLogin("lsdkfjldskjfl");
        user.setPassword(password);
        user.setRole(authority);

        userService.addUser(user);

    }
}