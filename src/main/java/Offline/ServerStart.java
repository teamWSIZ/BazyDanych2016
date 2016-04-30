package Offline;

import Domain.Host;
import Domain.HostRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pm on 4/30/16.
 */
public class ServerStart {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("offline-config.xml");

        HostRe hostRe = ctx.getBean(HostRe.class);

        Host nowy = new Host();
        nowy.setName("Brama");
        nowy.setComment("Brama sieci wewnetrznej");
        hostRe.save(nowy);


        for(Host h : hostRe.findAll()) {
            System.out.println(h);
        }

        ctx.close();
    }

}
