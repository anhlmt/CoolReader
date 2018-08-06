/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.service;

import com.coolreader.dao.BookcaseDao;
import com.coolreader.entity.Account;
import com.coolreader.entity.Book;
import com.coolreader.entity.Bookcase;
import java.util.List;

public class BookcaseService {

    private final BookcaseDao bookcaseDao = new BookcaseDao();

    public boolean addBookToBookcaseById(int bookcaseId, int bookId) {
        Bookcase bookcase = new Bookcase();
        bookcase.setId(bookcaseId);
        Book book = new Book();
        book.setId(bookId);
        return bookcaseDao.addBookToCase(bookcase, book);
    }

    public Bookcase getBookcaseByAccount(Account account) {
        return bookcaseDao.getBookcaseByAccount(account);
    }

    public List<Book> viewBookcase(Bookcase bookcase) {
        return bookcaseDao.viewBookCase(bookcase);
    }

    public boolean deleteBookFromBookcaseById(int bookcaseId, int bookId) {
        Bookcase bookcase = new Bookcase();
        bookcase.setId(bookcaseId);
        Book book = new Book();
        book.setId(bookId);
        return bookcaseDao.deleteBookFromBookcase(bookcase, book);
    }

    public boolean clearBookcaseById(int bookcaseId) {
        Bookcase bookcase = new Bookcase();
        bookcase.setId(bookcaseId);
        return bookcaseDao.clearBookcase(bookcase);
    }

    public boolean updateBookcase(Bookcase bookcase) {
        return bookcaseDao.updateBookcase(bookcase);
    }
}
