import DAO.UserDAO;
import DAO.impl.UserDAOImpl;
import model.User;

public class Main {
    public static void main(String[] args){
        UserDAOImpl user = new UserDAOImpl();
//        System.out.println(user.getUserByID(1));
//        User newUser = new User("A", "A", 3, "A", 0,0);
//        user.insert(newUser);
//        System.out.println(user.getUserByID(14));
        System.out.println(user.getAllUsers());
        System.out.println(user.getUserByID(1));
    }
}
