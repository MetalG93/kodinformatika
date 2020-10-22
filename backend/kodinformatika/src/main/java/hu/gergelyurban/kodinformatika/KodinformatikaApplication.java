package hu.gergelyurban.kodinformatika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("hu.gergelyurban.kodinformatika.*")
public class KodinformatikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodinformatikaApplication.class, args);
	}

}
