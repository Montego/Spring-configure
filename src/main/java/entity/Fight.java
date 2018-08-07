package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Fight extends AbstractEntity {
    @ManyToOne
    private Character char1;
    @ManyToOne
    private Character char2;
    @Column(nullable = false)
    private String result;
    @OneToOne
    private Bonus bonus;

}
