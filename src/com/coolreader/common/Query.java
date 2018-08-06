/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.common;

public class Query {

    public interface Account {

        public static String SELECT_ACCOUNT = "SELECT * FROM Account WHERE Username = ? AND Password = ?";
        public static String SELECT_USERNAME = "SELECT Username FROM Account WHERE Username = ?";
        public static String INSERT_ACCOUNT = "INSERT INTO Account VALUES (?,?)";
    }

    public interface Role {

        public static String SELECT_ROLE_BY_ID = "SELECT * FROM Role WHERE RoleId = ?";
    }

    public interface Book {

        public static String SELECT_BOOK_BY_ID = "SELECT * FROM Book WHERE BookId = ?";
        public static String SELECT_BOOK_BY_TITLE = "SELECT * FROM Book WHERE Title LIKE ?";
        public static String SELECT_BOOK_BY_AUTHOR = "SELECT * FROM Book WHERE Author LIKE ?";
        public static String SELECT_BOOK_BY_CATEGORY = "SELECT * FROM Book WHERE Category LIKE ?";
        public static String SELECT_ALL_BOOK = "SELECT * FROM Book";
        public static String CREATE_BOOK = "INSERT INTO Book VALUES (?,?,?,?,?,?,GETDATE(),GETDATE())";
        public static String UPDATE_BOOK = "UPDATE Book SET Title = ?, Brief = ?, Author = ?, Publisher = ?, Category = ?, Content = ?, UpdatedDate = GETDATE() WHERE BookId = ?";
        public static String DELETE_BOOK = "DELETE FROM Book WHERE BookId = ?";
        public static String SELECT_BOOK_IN_BOOKCASE = "Select * from Book where BookId in(select BookId from BookBookcase where BookcaseId = ?)";
        public static String SELECT_MAX_BOOK_ID = "SELECT MAX(BookId) FROM Book";
    }

    public interface Bookcase {

        public static String CLEAR_BOOKCASE = "DELETE FROM BookBookcase WHERE BookcaseId = ?";
        public static String ADD_BOOK_TO_BOOKCASE = "insert into BookBookcase values (?,?,getdate())";
        public static String UPDATE_BOOKCASE = "UPDATE BOOKCASE SET Bookcasename = ? WHERE BookcaseId = ?";
        public static String DELETE_BOOK_FROM_BOOKCASE = "DELETE FROM BookBookcase WHERE BookcaseId = ? AND BookId = ?";
        public static String GET_BOOKCASE_BY_ACCOUNT = "SELECT * FROM BOOKCASE WHERE AccountId = ?";
    }
}
