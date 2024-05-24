package com.example.springboot.controllers;

import com.example.springboot.data.Book;
import com.example.springboot.data.Library;
import com.example.springboot.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;

@Controller
public class UserSettingController {
    Library library = new Library();
    @GetMapping("/setting")
    public String setting() {
        System.out.println("фыпфы");
        return "setting";
    }
    @GetMapping("/submitForm")
    public String submitForm() {

        return "submitForm";
    }

    @PostMapping("/setting")
    public String settings(@RequestBody String reqest,Model model) {

        String[] ar = reqest.split("&");
        String title = ar[0].replace("txt=","");
//        int b = Integer.parseInt(ar[1].replace("age=",""));






        if (title.equals("all")){
            model.addAttribute("books", library.getBooks());
            return "allBooks";
        }
        title = title.replace("+", " ");

        if (!reqest.isEmpty())
        for (Book book:library.getBooks()){
            if (book.getName().equals(title)){

                model.addAttribute("author", book.getAuthor());
                model.addAttribute("name", book.getName());
                return "setting";
            }

        }

        return "setting";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute Book book, Model model) {
//
        library.addBook(book);
        return "setting";
    }

}
