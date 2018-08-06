/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.dao;

import com.coolreader.common.Query;
import com.coolreader.database.DBConnector;
import com.coolreader.entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {

    public Account findAccount(Account account) {
        Account temp = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Account.SELECT_ACCOUNT);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                temp = new Account();
                temp.setId(resultSet.getInt("AccountId"));
                temp.setUsername(resultSet.getString("Username"));
                temp.setPassword(resultSet.getString("Password"));
                temp.setRole(new RoleDao().getRoleById(resultSet.getInt("RoleId")));
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
        return temp;
    }

    public static void main(String[] args) {
        AccountDao accountDao = new AccountDao();
        Account account = new Account("mai tuyen", "tuyen1008");
        account = accountDao.findAccount(account);
        System.out.println(account.toString());
    }
}
