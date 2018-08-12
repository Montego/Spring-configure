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
//    @Enumerated(EnumType.STRING)
//    private Battlefield battlefield;
    @OneToOne
    private Battlefield battlefield;

    public Fight(){}

    public  Fight(Character char1, Character char2,Battlefield battlefield){
        this.char1 = char1;
        this.char2 = char2;
        this.battlefield = battlefield;
    }
}
