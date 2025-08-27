package co.com.techskill.lab2.library;

import co.com.techskill.lab2.library.domain.dto.PetitionDTO;
import co.com.techskill.lab2.library.service.dummy.PetitionService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
@OpenAPIDefinition
public class LibraryApplication {


	public static void main(String[] args) {
		PetitionService petitionService = new PetitionService();
		System.out.println("Iniciando el procesamiento de peticiones...");

		// Algunas peticiones son tipo RETURN, otras LEND:
		petitionService.processPetition("09c09cc8-b").subscribe(System.out::println);
		petitionService.processPetition("2f5fca21-b").subscribe(System.out::println);
		petitionService.processPetition("4c9ef769-9").subscribe(System.out::println);
		petitionService.processPetition("5b2dae36-f").subscribe(System.out::println);
		petitionService.processPetition("ad4801f0-9").subscribe(System.out::println);
		petitionService.processPetition("9cc825c1-7").subscribe(System.out::println);
		petitionService.processPetition("d5120259-4").subscribe(System.out::println);
		petitionService.processPetition("09ef7d35-d").subscribe(System.out::println);
		petitionService.processPetition("0e6a31b1-f").subscribe(System.out::println);
		petitionService.processPetition("4ebc9aa6-f").subscribe(System.out::println);
		// Mono que no existe
		petitionService.processPetition("abcdefg0-1").subscribe(System.out::println);
	}
}





