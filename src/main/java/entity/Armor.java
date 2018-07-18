package entity;

import javax.persistence.*;

@Entity
@Table(name="armors")
public class Armor extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int defense;

    @Enumerated(EnumType.STRING)
    private TypeArmor type;

}
