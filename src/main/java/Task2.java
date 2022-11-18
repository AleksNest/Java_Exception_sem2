// Если необходимо, исправьте данный код
public class Task2 {
    public static void main(String[] args) {

        int d = 0;
        int[] intArray = new int[9];
        intArray[8] = 1;
        if (d == 0) {
            throw new ArithmeticException("operation devide by zero not supported");
        }
        double catchedRes1 = intArray[8] / d;

        System.out.println(catchedRes1);
    }
}
