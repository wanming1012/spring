package hello.reading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class ReadingApplication {

	@Autowired
	private BookService bookService;

	@RequestMapping("/to-read")
	public Mono<String> toRead() {
		return bookService.readingList();
	}

	public static void main(String[] args) {
		SpringApplication.run(ReadingApplication.class, args);
	}

}
