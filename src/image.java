import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class image {
  public static void main(String[] args) throws Exception, IOException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/finance", "root", "");
    String INSERT_PICTURE = "insert into MyPictures(employeeNo, name, photo) values (?, ?, ?)";

    FileInputStream fis = null;
    PreparedStatement ps = null;
    try {
      conn.setAutoCommit(false);
      File file = new File("F:/aaa.jpg");
      fis = new FileInputStream(file);
      ps = conn.prepareStatement(INSERT_PICTURE);
      ps.setString(1, "110");
      ps.setString(2, "lewis");
      ps.setBinaryStream(3, fis, (int) file.length());
      ps.executeUpdate();
      conn.commit();
    } finally {
      ps.close();
      fis.close();
    }
  }
}
