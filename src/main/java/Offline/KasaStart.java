package Offline;

import Service.KasaService;
import model.PersonaRe;
import model.TransferRe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pm on 4/30/16.
 */
public class KasaStart {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config.xml");
        PersonaRe pre = ctx.getBean(PersonaRe.class);
        TransferRe tre = ctx.getBean(TransferRe.class);
//        Persona p = Persona.builder().name("Xinping").pass("").money(0).build();
//        pre.save(p);

//        Persona p1 = pre.findOne(1);
//        System.out.println(p1);
        ctx.getBean(KasaService.class).transferIt(tre);

        ctx.close();
    }

}
