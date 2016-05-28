package _Domain;


import lombok.Data;

//@Entity
@Data
public class Action {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer actionid;
    String name;
    String comment;
    String scriptFileName;
}
