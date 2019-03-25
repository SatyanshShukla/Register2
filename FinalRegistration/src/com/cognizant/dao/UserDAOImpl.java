package com.cognizant.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.cognizant.model.User;
public class UserDAOImpl implements UserDAO {
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  public int register(User user) {
    String sql = "insert into users values(?,?,?,?,?,?,?,?)";
    jdbcTemplate.update(sql, new Object[] { user.getAdminID(), user.getFirstname(), user.getLastname(),
    user.getAge(), user.getDoB(), user.getContact(), user.getAltcontact() ,user.getEmailID()});
    return 1;
    }

  }
  class UserMapper implements RowMapper<User> {
  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();
    user.setAdminID(rs.getString("adminID"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setAge(rs.getInt("age"));
    user.setDoB(rs.getString("DoB"));
    user.setContact(rs.getString("contact"));
    user.setAltcontact(rs.getString("altcontact"));
    user.setEmailID(rs.getString("emailID"));
    return user;
  }
}
