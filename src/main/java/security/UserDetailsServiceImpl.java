package security;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import service.IUserService;

import static java.util.Collections.singletonList;

public class UserDetailsServiceImpl implements UserDetailsService {
    private IUserService userService;

    @Autowired
    public UserDetailsServiceImpl(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUser(username);
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword().getPassword(), singletonList(user.getRole()));
    }
}
