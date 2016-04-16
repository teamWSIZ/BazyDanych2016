package Domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer personid;
    String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
