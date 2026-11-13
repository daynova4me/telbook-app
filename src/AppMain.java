import db.DBConn;
import exception.InputValidation;
import exception.MyException;

import java.util.Scanner;

public class AppMain {
    static void main(String[] args) {
        //DB 연결 확인
        DBConn.getConnection();

//        InputValidation validation = new InputValidation();
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        try {
//            validation.phoneCheck(name);
//        }catch (MyException e){
//            System.out.println(e.getMessage());
//        }

    }
}
