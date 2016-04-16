package Offline;

import Domain.Dish;
import Domain.DishRe;
import Domain.Person;
import Domain.PersonRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZajeciaStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("offline-config.xml");

        DishRe repo = ctx.getBean(DishRe.class);

        for(Dish d : repo.findAll()) System.out.println(d);
        System.out.println("-----------------------------");
        for(Dish d : repo.findByNazwa("Pepsi")) System.out.println(d);
        System.out.println("-----------------------------");
        for(Dish d : repo.findByCenaLessThan(15)) System.out.println(d);

        ctx.close();
    }
}
