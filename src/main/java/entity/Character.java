package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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

    @OneToOne
    private Weapon weapon;

    @ManyToOne
    private Race race;

    public Character(String name, User owner, List<Armor> armor, Weapon weapon, Race race) {
        this.name = name;
        this.owner = owner;
        this.armor = armor;
        this.weapon = weapon;
        this.race = race;
    }

    public Character(){}

}
