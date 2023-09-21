package hh.sof03.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hh.sof03.Bookstore.domain.Book;
import hh.sof03.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository BookRepository) {
		return (args) -> {

			BookRepository.save(new Book("1232323-21", "A Farewell to Arms", "Ernest Hemingway", 1929, 30.00));
			BookRepository.save(new Book("2212343-5", "Animal Farm", "George Orwell", 1945, 20.00));
			BookRepository.save(new Book("10-5050000149", "Crime and Punishment", "Fyodor Dostoevsky", 1866, 40.00));
			BookRepository.save(new Book("9780061177576", "Post Office", "Charles Bukowski", 1971, 10.00));
			

		};
	}
	
}
