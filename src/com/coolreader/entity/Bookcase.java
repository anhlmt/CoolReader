/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.entity;

import java.util.List;

public class Bookcase {

    private int id;
    private String name;
    private List<Book> listBook;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    public void deleteABook(Book book) {
        listBook.remove(book);
    }

    public void addABook(Book book) {
        listBook.add(book);
    }

    public void updateABook(Book book) {
        int index = listBook.indexOf(book);
        listBook.set(index, book);
    }

    public void clearBooks() {
        listBook.clear();
    }

    @Override
    public String toString() {
        return "Bookcase{" + "id=" + id + ", name=" + name + '}';
    }

}
