package com.company.composition.task1;

import com.company.composition.task1.Author;
import com.company.composition.task1.Book;

public class TestAuthor {
    public static void main(String[] args) {
//        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
//        System.out.println(ahTeck);
//        ahTeck.setEmail("paulTan@nowhere.com");
//        System.out.println("name is: " + ahTeck.getName());
//        System.out.println("eamil is: " + ahTeck.getEmail());
//        System.out.println("gender is: " + ahTeck.getGender());

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
