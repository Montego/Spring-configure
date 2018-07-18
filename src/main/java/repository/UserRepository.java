package repository;

import entity.Authority;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin (String login);

    User findByAuthority (Authority role);


}
