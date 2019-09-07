package springboot.logging.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		logger.error("Message logged in at ERROR level");
		logger.warn("Message logged in at WARN level");
		logger.info("Message logged in at INFO level");
		logger.debug("Message logged in at DEBUG level");

	}

}
