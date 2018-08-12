package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bonuses")
public class Bonus extends AbstractEntity{
    @Column
    private int attackBonus;
    @Column
    private int defenseBonus;

    public Bonus(int attackBonus, int defenseBonus){
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }
    public Bonus(){
    }
}
