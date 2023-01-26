package ch20.mysql.sec06;

import java.io.FileInputStream;
import java.sql.*;

public class BoardInsertExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "java",
                    "mysql"
            );

            String sql = "" +
                    "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) " +
                    "VALUES (?,?,?,now(),?,?)";

            PreparedStatement pstmt = conn.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "제목4");
            pstmt.setString(2, "내용4");
            pstmt.setString(3, "winter");
            pstmt.setString(4, "222.jpg");
            pstmt.setBlob(5, new FileInputStream("D:\\만재\\휴학학기\\JAVA\\상품1.png"));

            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: " + rows);

            if (rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println("저장된 bno: " + bno);
                }
                rs.close();
            }

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
