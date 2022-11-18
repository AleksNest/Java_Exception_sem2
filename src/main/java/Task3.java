public class Task3 {
    public static void main(String[] args) {

        int a = 90;
        int b = 0;
        int[] abc = {1, 2};
        printSum(23, 234);

        // Задание 3 (решение 1)

        if (b == 0) {
            throw new ArithmeticException("operation devide by zero not supported");
        }
        validIndexArray(abc, 3);    // метод проверки размера массива
        abc[3] = 9;

        // Задание 3 (решение 2)

        a = 90;
        b = 10;

        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Devide by  0");

        } catch (NullPointerException ex) {
            System.out.println("not be  null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("out of range of Array");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
   }


    public static void validIndexArray(int[] num, int index) {
        if (index < 0 || index >= num.length) {
            throw new IllegalArgumentException("incorrect index in Array: " + "[" + index + "]");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

}
