package sleuth.trace.webflux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "logging")
public class LoggingTestController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping( "/tarceandspanID")
    public String tarceandspanID(){

        LOG.info("Call tarceandspanID method webflux..!!!");

        return "tarceandspanID";
    }



}
