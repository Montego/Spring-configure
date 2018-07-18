package entity;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String login;

    @OneToOne
    private Password password;

    @ManyToOne
    private Authority role;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }




}
