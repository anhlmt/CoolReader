/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Aug 3, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.entity.Book;
import java.util.ArrayList;
import java.util.List;

public class BookBuffer {

    private int maxBookId;
    private List<Book> listBook;

    public BookBuffer() {

    }

    public List<Book> getBooksByTitle(String title) {
        List<Book> list = new ArrayList<>();
        for (Book book : listBook) {
            if (book.getTitle().toLowerCase().startsWith(title.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> list = new ArrayList<>();
        for (Book book : listBook) {
            if (book.getAuthor().toLowerCase().startsWith(author.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    public List<Book> getBooksByCategory(String category) {
        List<Book> list = new ArrayList<>();
        for (Book book : listBook) {
            if (book.getCategory().toLowerCase().startsWith(category.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    public Book getBookById(int id) {
        for (Book book : listBook) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void clearBooks() {
        listBook.clear();
    }

    public void addBook(Book book) {
        book.setId(++maxBookId);
        listBook.add(book);
    }

    public void deleteBook(Book book) {
        listBook.remove(book);
    }
    public void updateBook(Book book){
        int index = listBook.indexOf(book);
        listBook.set(index, book);
    }

    public int getMaxBookId() {
        return maxBookId;
    }

    public void setMaxBookId(int maxBookId) {
        this.maxBookId = maxBookId;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

}
