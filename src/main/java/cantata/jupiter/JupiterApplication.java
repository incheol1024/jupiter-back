package cantata.jupiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class JupiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JupiterApplication.class, args);
	}

}
