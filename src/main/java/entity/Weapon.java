package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "weapons")
public class Weapon extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int damage;

    @Enumerated(EnumType.STRING)
    private TypeWeapon typeWeapon;

    public Weapon(int damage, TypeWeapon typeWeapon) {
        this.damage = damage;
        this.typeWeapon = typeWeapon;
    }

    public Weapon() {
    }
}
