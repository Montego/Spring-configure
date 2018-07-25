package entity;

import javax.persistence.*;

@Entity
@Table(name = "weapons")
public class Weapon extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int damage;

    @Enumerated(EnumType.STRING)
    private TypeWeapon typeWeapon;
}
