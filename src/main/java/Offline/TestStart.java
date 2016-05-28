package Offline;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vpn.UserRe;

/**
 * Offline-owy tester repozytoriów.
 */
public class TestStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config.xml");

        UserRe userRe = ctx.getBean(UserRe.class);

        System.out.println(userRe.findAll());
        ctx.close();
    }


}
