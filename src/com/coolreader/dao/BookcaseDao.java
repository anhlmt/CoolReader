/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.dao;

import com.coolreader.common.Query;
import com.coolreader.database.DBConnector;
import com.coolreader.entity.Account;
import com.coolreader.entity.Book;
import com.coolreader.entity.Bookcase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookcaseDao {

    public List<Book> viewBookCase(Bookcase bookCase) {
        List<Book> listBook = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Book book = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.SELECT_BOOK_IN_BOOKCASE);
            preparedStatement.setInt(1, bookCase.getId());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                book = new Book();
                book.setId(resultSet.getInt("BookId"));
                book.setAuthor(resultSet.getString("Author"));
                book.setTitle(resultSet.getString("Title"));
                book.setBrief(resultSet.getString("Brief"));
                book.setPublisher(resultSet.getString("Publisher"));
                book.setContent(resultSet.getString("Content"));
                book.setCategory(resultSet.getString("Category"));
                book.setCreatedDate(resultSet.getDate("CreatedDate"));
                book.setUpdatedDate(resultSet.getDate("UpdatedDate"));
                listBook.add(book);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listBook;
    }

    public boolean clearBookcase(Bookcase bookcase) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Bookcase.CLEAR_BOOKCASE);
            preparedStatement.setInt(1, bookcase.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean addBookToCase(Bookcase bookcase, Book book) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Bookcase.ADD_BOOK_TO_BOOKCASE);
            preparedStatement.setInt(1, bookcase.getId());
            preparedStatement.setInt(2, book.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean deleteBookFromBookcase(Bookcase bookcase, Book book) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Bookcase.DELETE_BOOK_FROM_BOOKCASE);
            preparedStatement.setInt(1, bookcase.getId());
            preparedStatement.setInt(2, book.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public Bookcase getBookcaseByAccount(Account account) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Bookcase bookcase = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Bookcase.GET_BOOKCASE_BY_ACCOUNT);
            preparedStatement.setInt(1, account.getId());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                bookcase = new Bookcase();
                bookcase.setId(resultSet.getInt("BookcaseId"));
                bookcase.setName(resultSet.getString("BookcaseName"));
                bookcase.setListBook(null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return bookcase;
    }

    public boolean updateBookcase(Bookcase bookcase) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Bookcase.UPDATE_BOOKCASE);
            preparedStatement.setString(1, bookcase.getName());
            preparedStatement.setInt(2, bookcase.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }
}
