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
    private TypeArmor typeArmor;


    public Armor(int defense, TypeArmor typeArmor, String name) {
        this.defense = defense;
        this.typeArmor = typeArmor;
        this.name = name;
    }

    public Armor() {
    }
}
