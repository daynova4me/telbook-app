package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    private static Connection dbConn;
    public static Connection getConnection(){
        //연결이 되지 않았을 때만 연결정보를 생성하도록 할 것.
        if (dbConn == null){
            try {
                String dbDriver = "com.mysql.cj.jdbc.Driver";
                //dbUrl에서 DB 이름을 맨 끝에 반드시 적는다.
                String dbUrl = "jdbc:mysql://localhost:3306/teldb";//★★★★★ db이름 제일 중요함.
                String dbUser = "root";
                String dbPassword = "1111";
                Class.forName(dbDriver);
                //실제로 db와 연결
                dbConn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
                System.out.println("DB 연결 성공");
            }catch (ClassNotFoundException e){
                System.out.println("드라이버를 찾을 수 없습니다.");
                System.out.println(e.getMessage());
            } catch (SQLException e) {
                System.out.println("DB 연결 실패");
                System.out.println(e.getMessage());
            }
        }
        return dbConn;
    }
}
