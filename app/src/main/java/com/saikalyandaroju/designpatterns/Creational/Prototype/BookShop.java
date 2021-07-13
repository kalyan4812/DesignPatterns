package com.saikalyandaroju.designpatterns.Creational.Prototype;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String name;
    private List<Book> books=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void loadBookFromDb(){
        for(int i=1;i<11;i++){
            Book book=new Book();
            book.setBookId(i);
            book.setBookName("Book "+i);
            getBooks().add(book);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
    //shallow cloning
   /* @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    // deep clone.
    @NonNull
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop=new BookShop();
        for(Book b:getBooks()){
            Book book=new Book();
            book.setBookName(b.getBookName());
            book.setBookId(b.getBookId());
            bookShop.getBooks().add(book);


        }
       // bookShop.getBooks().addAll(getBooks());
        // why not bookShop.setBooks(getBooks()); ?
        return bookShop;
    }
}
