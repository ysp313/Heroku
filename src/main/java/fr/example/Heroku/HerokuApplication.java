package fr.example.Heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuApplication.class, args);
	}

}

@RestController
class HelloWorldController{
	@GetMapping("/")
	String hello(){
		return "Hello World ! Test of deployment...";
	}
}
