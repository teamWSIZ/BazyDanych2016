package Offline;

import Domain.PizzaRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Offline-owy tester repozytoriów.
 *
 *
 */
public class TestStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("offline-config.xml");
        PizzaRe repo = ctx.getBean(PizzaRe.class);
        System.out.println(repo.count());
        ctx.close();

    }
}
