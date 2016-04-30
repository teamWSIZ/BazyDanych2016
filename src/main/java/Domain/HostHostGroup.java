package Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class HostHostGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer hostHostGroup;
    Integer hostId;
    Integer hostGroupId;
}
