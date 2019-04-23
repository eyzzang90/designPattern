package templateMethodPattern.userDao;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class UserDao {

    public void add(User user) throws ClassNotFoundException, SQLException{
        Connection conn = getConnection();
        //...

    }

    public User get(String id) throws ClassNotFoundException, SQLException{
        Connection conn = getConnection();
        //....
        return new User();
    }

    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
}
