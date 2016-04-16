package Domain;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRe extends CrudRepository<Person,Integer>{
    List<Person> findByNameStartingWith(String nazwa);
    List<Person> findByNameContaining(String tekst);
    List<Person> findAllByOrderByNameAsc();

    @Query("select d from Dish d, DishOrder ddo, Person p " +
            "where d.dishid =  ddo.dishid and " +
            "ddo.personid = p.personid and p.personid = ?1")
    List<Dish> findOrderedDishesOfPerson(Integer personId);
}
