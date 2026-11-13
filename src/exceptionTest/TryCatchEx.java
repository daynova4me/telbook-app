package exceptionTest;

public class TryCatchEx {
    static void main(String[] args) {
        //ArithmeticException 라는 오류가 뜸.
        try {
            //int result 실행해보고 안 되면 catch를 통해 출력하고
            //final 출력됨.
            //final은 int result가 계산이 되더라도 출력됨.
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없다.");
            System.out.println("오류 메세지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("오류 메세지 : " + e.getMessage());
        } finally {
            System.out.println("여기는 무조건 실행된다");
        }
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 10번이 없음");
            System.out.println("오류 메세지 : " + e.getMessage());
        }finally {
            System.out.println("무조건 실행되는 곳");
        }
        //ㄴ final은 있어도 되고 없어도 되고
    }
}
