package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//public enum Battlefield  {
//    FOREST, FIELD, MOUNTAIN, BOG, UNNAMED1, UNNAMED2, UNNAMED3, UNNAMED4, UNNAMED5
//}


@Getter
@Setter
@Entity
@Table(name = "battlefields")
public class Battlefield extends AbstractEntity {
    @Column
    String name;
    @OneToOne
    Bonus bonus;
}