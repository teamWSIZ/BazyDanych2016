package Service;

import Domain.Host;
import Domain.HostGroupRe;
import Domain.HostRe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.List;


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


    // `/hosts POST`
    public Rest createNewHost(String name, String comment) {
        Host h = new Host();
        h.setName(name);
        h.setComment(comment);
        hostRe.save(h);
        Rest odp = new Rest();
        odp.setResult(h);
        return odp;
    }

    public Rest getHostsStatus() {
        return new Rest();
    }

    // `/groups/:id: GET
    @Transactional
    public Rest listHostsOfGroup(Integer hostGroupId) {
        Rest odp = new Rest();
        List<Host> list = hostGroupRe.findHostsOfGroup(hostGroupId);
        System.out.println("!!!!!(test transakcji)!!!!!! -->" + TransactionSynchronizationManager.isActualTransactionActive());
        odp.setResult(list);
        return  odp;
    }

    // `/actions/:actionid: GET (endpoint_id)
    public Rest executeAction(Integer hostGroupId) {
        Rest odp = new Rest();
        List<Host> list = hostGroupRe.findHostsOfGroup(hostGroupId);
        odp.setResult(list);
        return  odp;
    }





}
