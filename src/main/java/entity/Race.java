package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "races")
public class Race extends AbstractEntity{
    @Column(unique = true,nullable = false)
    private String name;
    @OneToMany
    private List<Bonus> bonus;

}
