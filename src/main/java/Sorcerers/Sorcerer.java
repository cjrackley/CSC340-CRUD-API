package Sorcerers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sorcerers")
@Data
@NoArgsConstructor
public class Sorcerer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column()
    private double age;

    @Column()
    private String grade;

    public Sorcerer(String name, String description, double age, String grade) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.grade = grade;
    }

}
