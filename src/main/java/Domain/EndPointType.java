package Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class EndPointType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer endPointTypeid;
    String name;
    String comment;
}
