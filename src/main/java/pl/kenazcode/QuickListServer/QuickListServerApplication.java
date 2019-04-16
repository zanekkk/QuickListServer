package pl.kenazcode.QuickListServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pl.kenazcode.QuickListServer")
public class QuickListServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuickListServerApplication.class, args);
	}
}
