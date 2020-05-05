package DAO;

import model.User;

import java.util.List;

public interface UserDAO {
    public static final String SQL_FIND_ALL_USERS = "SELECT * FROM \"User\" ORDER BY \"idUser\"" ;
    public static final String SQL_FIND_BY_ID_USER = "SELECT * FROM \"User\" WHERE \"idUser\" = ?" ;
    public static final String SQL_INSERT_USER = "INSERT INTO \"User\" (\"firstNameUser\", \"secondNameUser\", \"ageUser\", +\"countryUser\", \"winUser\", \"loseUser\") VALUES (?,?,?,?,?,?)" ;
    public static final String SQL_UPDATE_USER = "UPDATE \"User\" SET \"firstNameUser\" = ?, \"secondNameUser\" = ?, \"ageUser\" = ?, \"countryUser\" = ?, \"winUser\" = ?, \"loseUser\" = ? WHERE  \"idUser\" = ?" ;
    public static final String SQL_DELETE_USER = "DELETE FROM \"User\"  WHERE  \"idUser\" = ?" ;

    List<User> getAllUsers();
    User getUserByID(int idUser);
    void insert(User user);
    void update(int idUser, User user);
    void delete(int idUser);
}
