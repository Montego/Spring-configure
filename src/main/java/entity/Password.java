package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "passwords")
public class Password extends AbstractEntity {

    @Column(nullable = false)
    private String password;
}
