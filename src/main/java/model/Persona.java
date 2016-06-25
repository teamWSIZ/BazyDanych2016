package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Informacje osobowe + o info o stanie konta.
 *
 * Wykorzystujemy też funkcjonalności typu builder Lomboka, czyli można:
 *  Persona p = Persona.builder().name("Xinping").pass("123").money(0).build();
 */

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer personid;
    String pass;
    String name;
    Integer money;
}