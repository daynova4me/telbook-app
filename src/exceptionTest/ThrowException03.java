package exceptionTest;

import java.util.Scanner;

public class ThrowException03 {
    public static void setAge(int age){
        if (age < 0 || age > 130){
            throw new IllegalArgumentException("나이는 0~130 사이여야 합니다.");
        }
    }

    static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            //나이를 설정하는 메서드 호출
            setAge(age);
        }catch (IllegalArgumentException e){
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
