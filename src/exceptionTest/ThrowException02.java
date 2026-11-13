package exceptionTest;

public class ThrowException02 {
    //심부름하는 자식
    public static int divide(int x, int y) throws ArithmeticException{
        return  x/y;
    }

    //심부름 시키는 부모
    static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("0으로 나누면 안된다.");
        }
    }
}
