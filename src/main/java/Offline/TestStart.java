package Offline;

import Domain.Ttt;
import Domain.TttRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Offline-owy tester repozytoriów.
 *
 *
 */
public class TestStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("offline-config.xml");
        TttRe repo = ctx.getBean(TttRe.class);
        System.out.println(repo.count());


        ctx.close();

    }
}
