package Domain;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DishRe extends CrudRepository<Dish,Integer>{
    List<Dish> findByNazwa(String nazwa);
    List<Dish> findByCenaLessThan(Integer ileMamyPieniedzy);

    @Query("select i from Ingredient i, Dish d, DishIngredients di " +
            "where i.ingredientid =  di.ingredientid and " +
            "di.dishid = d.dishid and d.dishid = ?1")
    List<Ingredient> findIngredientsOfDish(Integer dishId);


}
