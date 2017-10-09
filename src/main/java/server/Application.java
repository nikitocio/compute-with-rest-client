package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 01-Oct-17
 */
@SpringBootApplication(scanBasePackages={"server"})
public class Application {

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
}