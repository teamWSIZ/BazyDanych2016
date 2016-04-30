package Offline;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Offline-owy tester repozytoriów.
 */
public class TestStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config.xml");

//        DishRe repo = ctx.getBean(DishRe.class);

//        Dish nowy = new Dish();
//        nowy.setNazwa("Sałatka");
//        nowy.setCena(10);
//        nowy.setWersja("Duża");
//
//        repo.save(nowy);

//        Dish dd = repo.findOne(3);
//        dd.setWersja("0.495L");
//        repo.save(dd);

//        System.out.println(dd);


//
//        for(Dish d : repo.findAll()) {
//            System.out.println(d);
//        }

//        PersonRe repoOsob = ctx.getBean(PersonRe.class);
//
//        for(Person p : repoOsob.findByNameStartingWith("Kl"))
//            System.out.println(p);



        ctx.close();
    }


}
