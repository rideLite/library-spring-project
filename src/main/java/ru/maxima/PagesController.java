package ru.maxima;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PagesController {
    @GetMapping("/people-crud")
    public String getPeopleCRUDPage(){
        return "people/people-crud-page";
    }
    @GetMapping("/people-books")
    public String getReadersBooksPage(){
        return "people/people-books-page";
    }
    @GetMapping("/books-crud")
    public String getBooksCRUDPage(){
        return "books/books-crud-page";
    }
    @GetMapping("/books-owner")
    public String getBooksOwnerPage(){
        return "books/books-owner-page";
    }
}
