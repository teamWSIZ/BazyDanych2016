package Offline;

import Domain.HostRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Offline-owy tester repozytoriów.
 */
public class TestStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config.xml");

        HostRe hostRe = ctx.getBean(HostRe.class);
//        Host nowy = new Host();
//        nowy.setName("Windows 11");
//        nowy.setComment("Czy istnieje?");
//        hostRe.save(nowy);

        System.out.println(hostRe.findAll());

        ctx.close();
    }


}
