package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "weapons")
public class Weapon extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int damage;
}
