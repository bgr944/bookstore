package hh.sof03.Bookstore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof03.Bookstore.domain.Book;
import hh.sof03.Bookstore.domain.BookRepository;


@Controller
public class BookstoreController {

	@Autowired
	private BookRepository BookRepository;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String Books(Model model) {
		
		List<Book> Books = new ArrayList<Book>();

		model.addAttribute("Books", Books);
		
		return "index";
		
    }
}