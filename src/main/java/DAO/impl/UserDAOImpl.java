package DAO.impl;

import DAO.UserDAO;
import DAO.connectionJDBC.*;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    public List<User> getAllUsers() {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            ResultSet resultSet =
                    connection.createStatement().executeQuery(SQL_FIND_ALL_USERS);
            List<User> list = new ArrayList<>();
            while (resultSet.next()) {
                list.add(new User(
                        resultSet.getInt(User.ID_USER_COLUMN),
                        resultSet.getString(User.FIRST_NAME_USER_COLUMN),
                        resultSet.getString(User.SECOND_NAME_USER_COLUMN),
                        resultSet.getInt(User.AGE_USER_COLUMN),
                        resultSet.getString(User.COUNTRY_USER_COLUMN),
                        resultSet.getInt(User.WIN_USER_COLUMN),
                        resultSet.getInt(User.LOSE_USER_COLUMN)));
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public User getUserByID(int idUser) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_FIND_BY_ID_USER);
            preparedStatement.setInt(1, idUser);
            ResultSet resultSet=preparedStatement.executeQuery();
            resultSet.next();
            return new User(
                    resultSet.getInt(User.ID_USER_COLUMN),
                    resultSet.getString(User.FIRST_NAME_USER_COLUMN),
                    resultSet.getString(User.SECOND_NAME_USER_COLUMN),
                    resultSet.getInt(User.AGE_USER_COLUMN),
                    resultSet.getString(User.COUNTRY_USER_COLUMN),
                    resultSet.getInt(User.WIN_USER_COLUMN),
                    resultSet.getInt(User.LOSE_USER_COLUMN));
        } catch (SQLException e) {
            return null;
        }
    }

    public void insert(User user) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_INSERT_USER);
            preparedStatement.setString(1, user.getFirstNameUser());
            preparedStatement.setString(2, user.getSecondNameUser());
            preparedStatement.setInt(3, user.getAgeUser());
            preparedStatement.setString(4, user.getCountryUser());
            preparedStatement.setInt(5, user.getWinUser());
            preparedStatement.setInt(6, user.getLoseUser());
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }

    public void update(int idUser, User user) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_UPDATE_USER);
            preparedStatement.setString(1, user.getFirstNameUser());
            preparedStatement.setString(2, user.getSecondNameUser());
            preparedStatement.setInt(3, user.getAgeUser());
            preparedStatement.setString(4, user.getCountryUser());
            preparedStatement.setInt(5, user.getWinUser());
            preparedStatement.setInt(6, user.getLoseUser());
            preparedStatement.setInt(7, idUser);
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }

    public void delete(int idUser) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_DELETE_USER);
            preparedStatement.setInt(1, idUser);
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }
}