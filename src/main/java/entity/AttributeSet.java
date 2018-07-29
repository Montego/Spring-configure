package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "attributes")
public class AttributeSet extends AbstractEntity {
    @Column(nullable = false)
    private int attack;
    @Column (nullable = false)
    private int defence;
    @Column(nullable = false)
    private int nonDamageChance;

    public AttributeSet() {
    }
}
