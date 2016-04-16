package Offline;

import Domain.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ZajeciaStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("offline-config.xml");
//        DishRe repo = ctx.getBean(DishRe.class);
//        for(Dish d : repo.findAll()) System.out.println(d);
//        System.out.println("-----------------------------");
//        for(Dish d : repo.findByNazwa("Pepsi")) System.out.println(d);
//        System.out.println("-----------------------------");
//        for(Dish d : repo.findByCenaLessThan(15)) System.out.println(d);
//
//
//        PersonRe repoOsob = ctx.getBean(PersonRe.class);
//        for(Person p : repoOsob.findAll()) System.out.println(p);

        DishOrderRe dRepo = ctx.getBean(DishOrderRe.class);

        DishOrder nowe = new DishOrder();
        nowe.setDishid(2);
        nowe.setPersonid(1);
        nowe.setLiczba(5);
        nowe.setDataZamowienia(new Date());
        dRepo.save(nowe);

        for(DishOrder doo : dRepo.findAll()) {
            System.out.println(doo);
        }


        ctx.close();
    }
}
