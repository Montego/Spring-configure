package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="armors")
public class Armor extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int defense;

    @Enumerated(EnumType.STRING)
    private TypeArmor type;


    public Armor(int defense, TypeArmor type, String name) {
        this.defense = defense;
        this.type = type;
        this.name = name;
    }

    public Armor() {
    }
}
