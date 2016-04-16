package Offline;

import Domain.DishRe;
import Domain.Person;
import Domain.PersonRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Offline-owy tester repozytoriów.
 */
public class TestStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("offline-config.xml");

        DishRe repo = ctx.getBean(DishRe.class);

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

        PersonRe repoOsob = ctx.getBean(PersonRe.class);

        for(Person p : repoOsob.findByNameStartingWith("Kl"))
            System.out.println(p);


        ctx.close();
    }
    public static void smain(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("offline-config.xml");
//        PizzaRe repo = ctx.getBean(PizzaRe.class);
//        System.out.println(repo.count());

        PersonRe personRe = ctx.getBean(PersonRe.class);
//        Random r = new Random();
//        for (int i = 0; i < 10; i++) {
//            Person p = new Person("Student" + String.valueOf(r.nextInt(50)));
//            personRe.save(p);
//        }

        //Przejdzie przez kolekcję osób których `name` zawiera napis "udent" (np. "Student")
        for(Person p : personRe.findByNameContaining("uden"))
            System.out.println(p);

        ctx.close();
    }

}
