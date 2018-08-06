/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.service;

import com.coolreader.dao.BookDao;
import com.coolreader.entity.Book;
import java.util.List;

public class BookService {

    private final BookDao bookDao = new BookDao();

    public List<Book> listAllBooks() {
        return bookDao.getAllBooks();
    }

    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    public List<Book> getBookByTitle(String title) {
        return bookDao.getBooksByTitle(title);
    }

    public List<Book> getBookByAuthor(String author) {
        return bookDao.getBooksByAuthor(author);
    }

    public List<Book> getBookByCategory(String category) {
        return bookDao.getBooksByCategory(category);
    }

    public boolean deleteBookById(int id) {
        Book book = new Book();
        book.setId(id);
        return bookDao.deleteBook(book);
    }

    public boolean updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    public boolean createBook(Book book) {
        return bookDao.createBook(book);
    }

    public int getMaxBookId() {
        return bookDao.getMaxBookId();
    }
}
