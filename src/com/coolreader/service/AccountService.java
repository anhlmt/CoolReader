/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.service;

import com.coolreader.dao.AccountDao;
import com.coolreader.entity.Account;
import com.coolreader.entity.Bookcase;
import com.coolreader.utils.Validation;

public class AccountService {

    private final AccountDao accountDao = new AccountDao();

    private Account currentAccount;
    private Bookcase bookcase;

    private static AccountService accountService;

    private AccountService() {

    }

    public static AccountService getInstance() {
        if (accountService == null) {
            accountService = new AccountService();
        }
        return accountService;
    }

    public boolean login(String username, String password) {
        if (!Validation.checkUsername(username) && Validation.checkPassword(password)) {
            return false;
        }
        Account account = new Account(username, password);
        account = accountDao.findAccount(account);
        if (account == null) {
            return false;
        }
        this.setCurrentAccount(account);
        BookcaseService bookcaseService = new BookcaseService();
        bookcase = bookcaseService.getBookcaseByAccount(account);
        bookcase.setListBook(bookcaseService.viewBookcase(bookcase));
        return true;
    }

    public void logout() {
        setCurrentAccount(null);
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public Bookcase getBookcase() {
        return bookcase;
    }

    public void setBookcase(Bookcase bookcase) {
        this.bookcase = bookcase;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().login("leminhtuananh", "anhlmt"));
        System.out.println(getInstance().login("leminhtuaananh", "anhlmt"));
    }
}
