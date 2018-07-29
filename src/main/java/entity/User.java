package entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String login;

    @OneToOne
    private Password password;

    @ManyToOne
    private Authority role;

    @Column
    private Timestamp registrated;

    public User(String login, Password password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }
}
