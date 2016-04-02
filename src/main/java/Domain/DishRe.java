package Domain;


import org.springframework.data.repository.CrudRepository;

public interface DishRe extends CrudRepository<Dish,Integer>{
//    List<Dish> findAllByOrderByNazwaAsc();
}
