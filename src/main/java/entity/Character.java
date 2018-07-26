package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "characters")
public class Character extends AbstractEntity {

    @Column(unique = true,nullable = false)
    private String name;

    @ManyToOne
    private User owner;

    @OneToOne
    private AttributeSet attributeSet;

    @OneToMany
    private List<Armor> armor;

    @OneToMany
    private List<Weapon> weapon;

    @OneToOne
    private Race race;
}
