package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AttributeSet extends AbstractEntity {
    @Column
    private int attack;
    @Column
    private int defence;
    @Column
    private int nonDamageChance;
}
