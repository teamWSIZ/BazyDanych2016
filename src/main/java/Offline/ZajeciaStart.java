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

//        DishOrderRe dRepo = ctx.getBean(DishOrderRe.class);
//
//        DishOrder nowe = new DishOrder();
//        nowe.setDishid(2);
//        nowe.setPersonid(1);
//        nowe.setLiczba(5);
//        nowe.setDataZamowienia(new Date());
//        dRepo.save(nowe);
//
//        for(DishOrder doo : dRepo.findAll()) {
//            System.out.println(doo);
//        }

//        PersonRe personRe = ctx.getBean(PersonRe.class);
//        for(Dish d : personRe.findOrderedDishesOfPerson(1))
//            System.out.println(d);

//        IngredientRe repo = ctx.getBean(IngredientRe.class);
//        Ingredient nowy = new Ingredient();
//        nowy.setNazwa("Cukier");
//        repo.save(nowy);

//        DishIngredientRe drepo = ctx.getBean(DishIngredientRe.class);
//        DishIngredients skladnikPepsi = new DishIngredients();
//        skladnikPepsi.setDishid(3);
//        skladnikPepsi.setIngredientid(1);
//        drepo.save(skladnikPepsi);
//        DishIngredients skladnikPepsi2 = new DishIngredients();
//        skladnikPepsi2.setDishid(3);
//        skladnikPepsi2.setIngredientid(1);
//        drepo.save(skladnikPepsi2);

        //Składniki pepsi
        DishRe re = ctx.getBean(DishRe.class);
        for(Ingredient i : re.findIngredientsOfDish(3))
            System.out.println(i);


        ctx.close();
    }
}
