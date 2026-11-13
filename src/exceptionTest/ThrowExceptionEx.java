package exceptionTest;

public class ThrowExceptionEx {
    //심부름하는 자식
    public static int divide(int x, int y){
        try {
            return x / y;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //심부름 시키는 부모
    static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);
    }
}
