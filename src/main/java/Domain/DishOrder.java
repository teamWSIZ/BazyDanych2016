package Domain;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class DishOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderid;
    Integer dishid;
    Integer personid;
    Integer liczba;
    Boolean wykonany;
}
