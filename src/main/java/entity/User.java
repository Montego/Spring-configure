package entity;


import javax.persistence.*;
import java.sql.Timestamp;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setRegistrated(Timestamp registrated) {
        this.registrated = registrated;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setRole(Authority role) {
        this.role = role;
    }
}
