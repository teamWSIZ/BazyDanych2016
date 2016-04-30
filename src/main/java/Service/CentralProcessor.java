package Service;

import Domain.Host;
import Domain.HostGroupRe;
import Domain.HostRe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pm on 4/30/16.
 */
@Component
public class CentralProcessor {
    @Autowired
    HostRe hostRe;

    @Autowired
    HostGroupRe hostGroupRe;


    // `/hosts GET`
    public Iterable<Host> getAllHosts() {
        return hostRe.findAll();
    }


    public Rest createNewHost(String name, String comment) {
        Host h = new Host();
        h.setName(name);
        h.setComment(comment);
        hostRe.save(h);
        Rest odp = new Rest();
        odp.setResult(h);
        return odp;
    }



}
