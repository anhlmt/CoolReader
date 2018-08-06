/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.dao;

import com.coolreader.common.Query;
import com.coolreader.database.DBConnector;
import com.coolreader.entity.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleDao {

    public Role getRoleById(int id) {
        Role role = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBConnector.getConnection();
            preparedStatement = connection.prepareStatement(Query.Role.SELECT_ROLE_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                role = new Role();
                role.setId(resultSet.getInt("RoleId"));
                role.setAuthority(resultSet.getString("Authority"));
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
        return role;
    }

    public static void main(String[] args) {
        Role role = new RoleDao().getRoleById(1);
        System.out.println(role.getId());
        System.out.println(role.getAuthority());
    }
}
