import java.util.Scanner;

//���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float), � ���������� ��������� ��������.
//���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ���������� �������� ��������� � ������������ ���� ������.

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







