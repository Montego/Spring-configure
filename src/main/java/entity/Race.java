package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "races")
public class Race extends AbstractEntity{
    @Column(unique = true,nullable = false)
    private String name;
//    @OneToMany
//    private List<Bonus> bonus;
    @OneToOne
    private AttributeSet attributeSet;

    public Race(String name, AttributeSet attributeSet) {
        this.name = name;
        this.attributeSet = attributeSet;
    }
    public Race(){

    }

}
