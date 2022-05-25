package springmvc;

import org.springframework.boot.SpringApplication; //importação para usar o código da linha 9
import org.springframework.boot.autoconfigure.SpringBootApplication; //importação para usar o código da linha 6 

@SpringBootApplication //mostra que essa é a classe princpal
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}