/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.dao;

import com.coolreader.common.Query;
import com.coolreader.database.DBConnector;
import com.coolreader.entity.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public boolean createBook(Book book) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.CREATE_BOOK);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getBrief());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setString(4, book.getPublisher());
            preparedStatement.setString(5, book.getCategory());
            preparedStatement.setString(6, book.getContent());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
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

    public boolean updateBook(Book book) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.UPDATE_BOOK);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getBrief());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setString(4, book.getPublisher());
            preparedStatement.setString(5, book.getCategory());
            preparedStatement.setString(6, book.getContent());
            preparedStatement.setInt(7, book.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
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

    public boolean deleteBook(Book book) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.DELETE_BOOK);
            preparedStatement.setInt(1, book.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
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

    public Book getBookById(int id) {
        Book book = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.SELECT_BOOK_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                book = new Book();
                book.setId(resultSet.getInt("BookId"));
                book.setTitle(resultSet.getString("Title"));
                book.setBrief(resultSet.getString("Brief"));
                book.setAuthor(resultSet.getString("Author"));
                book.setPublisher(resultSet.getString("Publisher"));
                book.setCategory(resultSet.getString("Category"));
                book.setContent(resultSet.getString("Content"));
                book.setCreatedDate(resultSet.getDate("CreatedDate"));
                book.setUpdatedDate(resultSet.getDate("UpdatedDate"));
            }
        } catch (SQLException ex) {
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
        return book;
    }

    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();
        Book book = null;
        Connection connection = null;
//        Connection connection = DBConnector.conn;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Query.Book.SELECT_ALL_BOOK);
            while (resultSet.next()) {
                book = new Book();
                book.setId(resultSet.getInt("BookId"));
                book.setTitle(resultSet.getString("Title"));
                book.setBrief(resultSet.getString("Brief"));
                book.setAuthor(resultSet.getString("Author"));
                book.setPublisher(resultSet.getString("Publisher"));
                book.setCategory(resultSet.getString("Category"));
                book.setContent(resultSet.getString("Content"));
                book.setCreatedDate(resultSet.getDate("CreatedDate"));
                book.setUpdatedDate(resultSet.getDate("UpdatedDate"));
                list.add(book);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    public List<Book> getBooksByTitle(String title) {
        List<Book> list = new ArrayList<>();
        Book book = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.SELECT_BOOK_BY_TITLE);
            preparedStatement.setString(1, title);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                book = new Book();
                book.setId(resultSet.getInt("BookId"));
                book.setTitle(resultSet.getString("Title"));
                book.setBrief(resultSet.getString("Brief"));
                book.setAuthor(resultSet.getString("Author"));
                book.setPublisher(resultSet.getString("Publisher"));
                book.setCategory(resultSet.getString("Category"));
                book.setContent(resultSet.getString("Content"));
                book.setCreatedDate(resultSet.getDate("CreatedDate"));
                book.setUpdatedDate(resultSet.getDate("UpdatedDate"));
                list.add(book);
            }
        } catch (SQLException ex) {
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
        return list;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> list = new ArrayList<>();
        Book book = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.SELECT_BOOK_BY_AUTHOR);
            preparedStatement.setString(1, author);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                book = new Book();
                book.setId(resultSet.getInt("BookId"));
                book.setTitle(resultSet.getString("Title"));
                book.setBrief(resultSet.getString("Brief"));
                book.setAuthor(resultSet.getString("Author"));
                book.setPublisher(resultSet.getString("Publisher"));
                book.setCategory(resultSet.getString("Category"));
                book.setContent(resultSet.getString("Content"));
                book.setCreatedDate(resultSet.getDate("CreatedDate"));
                book.setUpdatedDate(resultSet.getDate("UpdatedDate"));
                list.add(book);
            }
        } catch (SQLException ex) {
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
        return list;
    }

    public List<Book> getBooksByCategory(String category) {
        List<Book> list = new ArrayList<>();
        Book book = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.SELECT_BOOK_BY_CATEGORY);
            preparedStatement.setString(1, category);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                book = new Book();
                book.setId(resultSet.getInt("BookId"));
                book.setTitle(resultSet.getString("Title"));
                book.setBrief(resultSet.getString("Brief"));
                book.setAuthor(resultSet.getString("Author"));
                book.setPublisher(resultSet.getString("Publisher"));
                book.setCategory(resultSet.getString("Category"));
                book.setContent(resultSet.getString("Content"));
                book.setCreatedDate(resultSet.getDate("CreatedDate"));
                book.setUpdatedDate(resultSet.getDate("UpdatedDate"));
                list.add(book);
            }
        } catch (SQLException ex) {
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
        return list;
    }
    
    public int getMaxBookId(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Book.SELECT_MAX_BOOK_ID);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (SQLException ex) {
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
        return 0;
    }

    public static void main(String[] args) {
        BookDao bookDao = new BookDao();
        //System.out.println(bookDao.getBookById(1));
        Book tmp = new Book();
        tmp.setId(3);

//        tmp.setTitle("Tiếng Việt lớp 1");
//        tmp.setBrief("");
//        tmp.setAuthor("Bộ Giáo Dục");
//        tmp.setPublisher("NXB Giáo Dục");
//        tmp.setCategory("Khoa học");
//        tmp.setContent("Học tiếng việt");
//        BookDao.getInstance().updateBook(tmp);
//        bookDao.deleteBook(tmp);
        for (Book book : bookDao.getBooksByTitle("D" + '\u0025')) {
            System.out.println(book.toString());
        }
        System.out.println(bookDao.getMaxBookId());
    }
}
