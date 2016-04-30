package Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Endpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer endPointId;
    String ip;
    Integer port;
    String comment;
    Integer endPointTypeId;     //Endpoint *:1 EndpointType
    Integer hostid;
}
