package WebController;

import Domain.HostRe;
import Service.CentralProcessor;
import Service.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
@EnableWebMvc
public class HelloController {
    @Autowired
    HostRe hostRe;
    @Autowired
    CentralProcessor processor;

    @RequestMapping(value = "/")
    @ResponseBody
    public Rest saySomething() {
        return new Rest();
    }

    @RequestMapping(value = "/hosts", method = RequestMethod.GET)
    @ResponseBody
    public Rest getAllHosts() {
        Rest odp = new Rest();
        odp.setResult(processor.listHostsOfGroup(1));
        return odp;
    }

}
