import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Entered number: " + inputNumber());
    }

    public static float inputNumber() {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the float number");
            try {
                return scanner.nextFloat();

            } catch (Exception e) {
                System.out.println("Incorrect date.");
                System.out.println("number must be float");

            }

        }
    }
}







