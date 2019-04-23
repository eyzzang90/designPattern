package templateMethodPattern.userDao;

import java.sql.Connection;
import java.sql.SQLException;

public class DuserDao extends UserDao {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // D사 DB connection 생성코드
        return null;
    }
}
