package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "authorities")
public class Authority extends AbstractEntity implements GrantedAuthority {

    @Column(unique = true,nullable = false)
    private String authority;

}
