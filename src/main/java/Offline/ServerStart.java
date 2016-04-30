package Offline;

import Service.CentralProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pm on 4/30/16.
 */
public class ServerStart {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("offline-config.xml");

        CentralProcessor processor = ctx.getBean(CentralProcessor.class);

        processor.createNewHost("Baza", "Baza postgres");

        System.out.println(processor.getAllHosts());

        ctx.close();
    }

}
