package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bonuses")
public class Bonus extends AbstractEntity{
    @Column
    private int attackBonus;
    @Column
    private int defenseBonus;

}
