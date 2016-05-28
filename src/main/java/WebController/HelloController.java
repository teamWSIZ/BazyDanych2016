package WebController;

import Domain.Host;
import Domain.HostRe;
import Service.CentralProcessor;
import Service.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
@EnableWebMvc
public class HelloController {
    @Autowired
    HostRe hostRe;
    @Autowired
    CentralProcessor processor;
    @Autowired
    HostRe hostRepository;

    @RequestMapping(value = "/")
    @ResponseBody
    public Rest saySomething() {
        return new Rest();
    }

    @RequestMapping(value = "/hosts", method = RequestMethod.GET)
    @ResponseBody
    @Transactional
    public Rest getAllHosts() {
        Rest odp = new Rest();
        odp.setResult(hostRepository.findAll());
        System.out.println(odp);
        System.out.println("!!!!!(test transakcji)!!!!!! -->" +
                TransactionSynchronizationManager.isActualTransactionActive());
        odp.setResult(hostRepository.findAll());

        return odp;
    }

    @RequestMapping(value = "/hosts/add", method = RequestMethod.GET)
    @ResponseBody
    public Rest createHost(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "comment", required = false) String comment) {
        Host nowy = new Host();
        nowy.setName(name);
        nowy.setComment(comment);
        hostRe.save(nowy);
        Rest odp = new Rest();
        return odp;
    }



}
