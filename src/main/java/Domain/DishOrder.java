package Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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

    @Temporal(TemporalType.TIMESTAMP)
    Date dataZamowienia;
}
