package com.saikalyandaroju.designpatterns.Creational.Prototype;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop=new BookShop();
        bookShop.setName("Ram Book Store");
        bookShop.loadBookFromDb();
        System.out.println(bookShop);


        BookShop bookShop1=(BookShop)bookShop.clone();
        bookShop1.setName("Gopal Book Store");
        System.out.println(bookShop1);

        bookShop.getBooks().remove(0); // removing book1 from ram store.
        bookShop.getBooks().get(2).setBookName("Gita");

        System.out.println(bookShop);
        System.out.println(bookShop1);
    }
}
