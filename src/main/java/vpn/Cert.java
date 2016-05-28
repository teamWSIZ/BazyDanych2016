package vpn;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Cert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer certid;
    String name;
    Integer userid;
    Integer creatorid;
}

