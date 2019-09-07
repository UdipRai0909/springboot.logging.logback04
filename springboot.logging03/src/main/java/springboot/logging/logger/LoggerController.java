package springboot.logging.logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

	@RequestMapping("/")
	public String welcome() {
		String name = "kk";
		if(name.length()==2) {
			throw new RuntimeException("I am a runtime Exception error.");
		}
		return "Hello World";
	}

}
