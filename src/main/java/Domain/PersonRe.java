package Domain;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRe extends CrudRepository<Person,Integer>{
    List<Person> findByNameContaining(String tekst);
    List<Person> findAllByOrderByNameAsc();
}
