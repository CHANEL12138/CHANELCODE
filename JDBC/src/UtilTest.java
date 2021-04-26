import java.sql.*;

public class UtilTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = utilsql.getConnection();
            conn.setAutoCommit(false);//设置是否自动执行，意思是有多条sql语句同时执行

            String sql = "select ename from emp where ename like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"_A%");





           // conn.commit();//执行

            rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString("ename"));
            }

            String sql1 = "insert into dept(deptno,dname,loc) values(?,?,?)";
            ps = conn.prepareStatement(sql1);
            ps.setInt(1,50);
            ps.setString(2,"工作人员");
            ps.setString(3,"北京");
            System.out.println(ps.executeUpdate());

            conn.commit();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (conn != null) {
                try {
                    conn.rollback();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            utilsql.close(conn,ps,rs);
        }


    }
}
