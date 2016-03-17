package Offline;

import Domain.Person;
import Domain.PersonRe;
import Domain.PizzaRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

/**
 * Offline-owy tester repozytoriów.
 */
public class TestStart {
    public static void main(String[] args) {
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
