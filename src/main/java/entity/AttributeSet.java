package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AttributeSet extends AbstractEntity {
    @Column(nullable = false)
    private int attack;
    @Column (nullable = false)
    private int defence;
    @Column(nullable = false)
    private int nonDamageChance;
}
