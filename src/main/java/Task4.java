//–азработайте программу, котора€ выбросит Exception, когда пользователь вводит пустую строку.
// ѕользователю должно показатьс€ сообщение, что пустые строки вводить нельз€.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        boolean flag = true;
        String str = "";
        while (flag) {
            System.out.print("Input date: ");
            Scanner in = new Scanner(System.in);
            str = in.nextLine();
            flag = checkNullStr(str);
        }
        System.out.println(str);

    }
    public static boolean checkNullStr(String str) { // метод проверки наличи€ Null и пустой строки

        if (str == null || str.isEmpty()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("input cannot contain an empty string");
                return true;
            }
        } else {
            return false;
        }
    }

}
