package exception;
// 이 클래스 자체가 자바가 지원하는 예외처리를 하도록 생성

public class MyException extends RuntimeException{
    public MyException(){}

    public MyException(String message){
        super(message);
    }
}
