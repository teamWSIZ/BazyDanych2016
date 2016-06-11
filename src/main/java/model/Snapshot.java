package model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
public class Snapshot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer snapid;
    @Temporal(TemporalType.TIMESTAMP)
    Date timestamp;
    String text;    // [ pid1,mon1; pid2,mon2; ...]
}