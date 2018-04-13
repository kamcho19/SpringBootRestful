package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    
    //@RequestMapping("/greeting")
    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public Greeting getGreeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public Greeting postGreeting(@RequestParam(value="name", defaultValue="World") String name) {
    	return new Greeting(counter.incrementAndGet(),
    			String.format(template, name));
    }
    @RequestMapping(value="/greeting", method=RequestMethod.PUT)
    public Greeting putGreeting(@RequestParam(value="name", defaultValue="World") String name) {
    	return new Greeting(counter.incrementAndGet(),
    			String.format(template, name));
    }
    @RequestMapping(value="/greeting", method=RequestMethod.DELETE)
    public Greeting delGreeting(@RequestParam(value="name", defaultValue="World") String name) {
    	return new Greeting(counter.incrementAndGet(),
    			String.format(template, name));
    }
}
