package banana.yong.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface RemoteClient {

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
    Hello hello(@PathVariable String name);

}
